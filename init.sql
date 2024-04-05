-- Create the log_data table if it doesn't exist
CREATE TABLE IF NOT EXISTS log_data (
    id SERIAL PRIMARY KEY,
    inputdata TEXT,
    logname VARCHAR(255)
);

-- Create the app_user table if it doesn't exist
CREATE TABLE IF NOT EXISTS app_user (
    email VARCHAR(255) PRIMARY KEY,
    firstname VARCHAR(100),
    lastname VARCHAR(100),
    password VARCHAR(255)
);

-- Create the log_data_seq sequence if it doesn't exist
CREATE SEQUENCE IF NOT EXISTS log_data_seq
    START WITH 1
    INCREMENT BY 1;


