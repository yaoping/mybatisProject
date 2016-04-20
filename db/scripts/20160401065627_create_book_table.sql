-- // create book table
-- Migration SQL that makes the change goes here.

CREATE TABLE book(
  ID NUMERIC(20,0) NOT NULL,
  TITLE VARCHAR(255) NOT NULL,
  PRIMARY KEY (ID)
);

-- //@UNDO

DROP TABLE book;
