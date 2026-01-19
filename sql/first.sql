CREATE table user(id int,name VARCHAR,class VARCHAR);

ALTER TABLE user 
ADD  mobile INT(10);
INSERT INTO user VALUES(10,"Sachin","bca",98765464654);
INSERT INTO user VALUES(11,"Arjun","b.tech",64657987454);
INSERT INTO user VALUES(12,"Krishnveer","mca",82948555958);
INSERT INTO user VALUES(13,"Mohit","LLB",82948555958);
SELECT * FROM user;
alter TABLE user
add address VARCHAR;
UPDATE user
set address="Ajnokh"
where id IN (10,11,12); -- for use insert similar values without repeated. we can do in single query
UPDATE user 
set address="Karhela"
where id = 13;

SELECT * FROM user
ORDER BY name asc;