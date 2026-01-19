CREATE TABLE users(id INT,name VARCHAR2(50),class VARCHAR(50),addre VARCHAR2(50),sallary INT);
INSERT INTO users VALUES(133,'SACHIN','BCADS','AJNOKH',100000);
INSERT INTO users VALUES(134,'KRISHNVEER','BCADS','AJNOKH',70000);
INSERT INTO users VALUES(135,'SACHIN','BCADS','AJNOKH',100000);
INSERT INTO users VALUES(136,'MOHIT','BCADS','KARHAILA',70000);

SELECT name,id FROM users; -- this is a especially coloumn print query
UPDATE users
    SET name='ARJUN', sallary=200000
    WHERE id = 133;
UPDATE users
    SET sallary=300000
    WHERE id = 135;
SELECT * FROM users
ORDER BY name asc; --- using for asc assending order and desc fro descting order

DELETE FROM users 
WHERE id=133;
SELECT name From users;