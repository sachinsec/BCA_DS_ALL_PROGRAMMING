use startsql;
-- alter table users modify column email varchar(100) after id;
-- select * from users;
alter table users modify column date_of_birth date first;
select * from users;