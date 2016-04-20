-- // create user table
-- Migration SQL that makes the change goes here.
CREATE TABLE user(
id INT NOT NULL,
 name VARCHAR(50),
 website VARCHAR(255),
 phone VARCHAR (15),
 PRIMARY KEY (id)
);



-- //@UNDO
-- SQL to undo the change goes here.
DROP TABLE user;

