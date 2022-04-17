package org.home.agent.resource;

import javax.transaction.Transactional;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import org.home.agent.Agent;

@Path("/api/agent")
public class UserManagementResource {

    @POST
    @Transactional
    public void saveAgent(Agent agent) {
        agent.persist();
    }

    @DELETE
    @Path("/{id}")
    @Transactional
    public void deleteAgentById(Long id) {
        Agent.deleteById(id);
    }

    @DELETE
    @Path("/{country}")
    @Transactional
    public void deleteAgentByName(String country) {
        Agent.delete("country", country);
    }

    @GET
    @Path("/{id}")
    @Transactional
    public Agent getAgent(Long id) {
        return Agent.findById(id);
    }

}
