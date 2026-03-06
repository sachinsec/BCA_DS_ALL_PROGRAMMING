use startsql;
alter table users add column is_active boolean default true;
select *from users;