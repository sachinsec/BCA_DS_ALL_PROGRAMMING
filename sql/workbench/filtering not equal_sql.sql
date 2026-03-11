use startsql;
select * from users

-- where name like '%a' and gender in ('male' , 'female') limit 6 offset 2; use of offset keyword to skip first 2 
-- where name like '%a' and gender in ('male' , 'female') limit 6 ; use of like keyword 
-- where name in ('sachin','arjun','alice') order by date_of_birth ASC limit 5;    use of order by and limit 5
-- where gender = 'Female' and name = 'priya singh';   use of and
-- where gender in ('Male','other');  use of in
-- where date_of_birth between '2004-09-12' and '2009-09-12';  use of between
-- where gender = 'male';
-- where date_of_birth < '2005-09-25';
-- where id > 10;