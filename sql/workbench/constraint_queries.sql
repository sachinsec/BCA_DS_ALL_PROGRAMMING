use startsql;
desc users;
select * from users;
alter table users add constraint check  (date_of_birth> '1999-09-05');
insert into users values(26,'Mohit','mohitkarhail@gmail.com','Female','2000-09-05',default,89000);
insert into users values(27,'Mohit','mohitkarh1ail@gmail.com','Female','1999-09-06',default,89000);
