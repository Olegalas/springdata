CREATE DATABASE first;

USE first;

CREATE TABLE user(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(30),
    pass VARCHAR(30),
    state VARCHAR(10),
    PRIMARY KEY (id)
);

CREATE DATABASE second;

USE second;

CREATE TABLE admin(
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(30),
    pass VARCHAR(30),
    state VARCHAR(10),
    PRIMARY KEY (id)
);

