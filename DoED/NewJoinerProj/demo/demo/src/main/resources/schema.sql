DROP TABLE IF EXISTS TBL_INSTRUMENTS;

CREATE TABLE TBL_INSTRUMENTS (

--non of this is working
    id INTEGER AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(250) NOT NULL,
    description TEXT NOT NULL,
    val DOUBLE,
    originyear INTEGER,
    audioFilePath VARCHAR(250),
    imageFilePath VARCHAR(250)
);


-- EXAMPLEEEE
--DROP TABLE IF EXISTS TBL_EMPLOYEES;
--
--CREATE TABLE TBL_EMPLOYEES (
--  id INT AUTO_INCREMENT  PRIMARY KEY,
--  first_name VARCHAR(250) NOT NULL,
--  last_name VARCHAR(250) NOT NULL,
--  email VARCHAR(250) DEFAULT NULL
--);