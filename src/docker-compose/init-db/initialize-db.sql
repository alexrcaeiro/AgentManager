CREATE ROLE agent WITH LOGIN PASSWORD 'password';

CREATE DATABASE user_db;
GRANT ALL PRIVILEGES ON DATABASE user_db TO agent;
