CREATE TABLE student(
    Id int,Name VARCHAR(50),Class VARCHAR(10),DOB date,Gender enum("Male","Female","Other"),
    create_time DEFAULT CURRENT_TIMESTAMP
)
INSERT into student VALUES(12,"Sachin",2005-09-12,Male)