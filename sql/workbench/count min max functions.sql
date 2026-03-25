use startsql;
select * from users;
select max(salary) as max_salary, min(salary) as min_salary,min(date_of_birth)
as date_birth from users;
select sum(salary) from users;
select avg(salary) from users;
select gender, avg(salary) as AVG_Salary from users group by gender;
select name, length(name) from users;
select salary, lower(name) as Lower_case, upper(name) as Upper_case from users;
select year(now()) as date from users;
