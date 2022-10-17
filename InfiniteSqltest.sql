use mydatabase;
create table Employee(
Order_id int primary key ,
first_name varchar(45) not null ,
last_name varchar(45) null,
salary double ,
joining_date varchar(100),
department varchar(100) 
);
insert into employee values(Order_id,first_name,last_name,salary,joining_date,department);
insert into employee values (1, 'Monica','Arora',10000,'2022-10-17 10:50:00','HR');
insert into employee values (2, 'Shodh','Yadav',40000,'2022-09-57 10:50:00','Employee');
insert into employee values (3, 'Naushad','Ali',30000,'2022-09-15 10:30:30','HMSA');
insert into employee values (4, 'Rishi','Srivastava',30000,'2022-09-15 11:30:30','Strategic Sales');
insert into employee values (5, 'Aman','Gupta',50000,'2022-09-16 12:30:30','Medica');
insert into employee values (6, 'Tabrez','Alam',60000,'2022-09-26 12:20:10','Account');
insert into employee values (7, 'Nandini','Yadav',90000,'2021-09-26 01:20:10','Admin');
insert into employee values (8, 'Vishal ','Yadav',190000,'2020-09-26 01:20:10','Sales Team Leader');
select * from employee;
select replace(first_name,'a','A') from employee;
select concat(first_name, ' ', last_name) AS 'COMPLETE_NAME' from employee; 
select * from employee order by first_name asc,department desc;
select * from employee where department='Admin';
select * from employee where first_name in ('Naushad','Tabrez');
select * from employee where first_name like '%a';
select * from employee where first_name like '_____h';
select first_name as WORKER_NAME from employee;
select upper(first_name) from employee;
select * from employee where salary between 100000 and 500000;
