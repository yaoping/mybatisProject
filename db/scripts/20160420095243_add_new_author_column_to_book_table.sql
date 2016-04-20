-- // add new author column to book table
-- Migration SQL that makes the change goes here.
ALTER TABLE book add COLUMN author VARCHAR (50);


-- //@UNDO
-- SQL to undo the change goes here.
ALTER TABLE book DROP COLUMN author;


