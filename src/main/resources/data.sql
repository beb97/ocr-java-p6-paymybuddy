-- https://www.baeldung.com/spring-boot-data-sql-and-schema-sql

-- INSERT INTO USER (first_name) VALUES('P');
INSERT INTO USER (first_name, last_name, email) VALUES('P', 'B' , 'pb@gmail.com');
INSERT INTO USER (first_name, last_name, email) VALUES('JM', 'S' , 'jms@gmail.com');
INSERT INTO USER (first_name, last_name, email) VALUES('S', 'Y' , 'sy@gmail.com');


INSERT INTO CONTACT(USER_ID, CONTACT_ID) VALUES(1,2);
INSERT INTO CONTACT(USER_ID, CONTACT_ID) VALUES(2,3);