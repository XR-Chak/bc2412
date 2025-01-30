create database bootcamp_exercise1;
use bootcamp_exercise1;
create table regions(
	REGION_ID INT primary key,
    REGION_NAME varchar(25));
    
create table countries(
	COUNTRY_ID char(2) primary key,
    COUNTRY_NAME varchar(40),
    REGION_ID INT,
    foreign key (REGION_ID) references regions(REGION_ID));
    
create table locations(
	LOCATION_ID int primary key,
    STREET_ADDRESS varchar(25),
    POSTAL_CODE varchar(12),
    city varchar(30),
    state_province varchar(12),
    country_id char(2),
    foreign key(country_id) references countries(country_id));
    
create table departments(
	department_id int primary key,
    department_name varchar(30),
    manager_id int,
    location_id int,
    foreign key(location_id) references locations(location_id));
    
create table jobs(
	job_id varchar(10) primary key,
    job_title varchar(35),
    min_salary int,
    max_salary int);
    
create table employees(
	employee_id int primary key,
    first_name varchar(20),
    last_name varchar(25),
    email varchar(25),
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10),
    foreign key(job_id) references jobs(job_id),
    salary int,
    commission_pct int,
    manager_id int,
    department_id int,
    foreign key(department_id) references departments(department_id));
    
    create table job_history(
			employee_id int ,
            foreign key(employee_id) references employees(employee_id),
            start_date date ,
            end_date date,
            job_id varchar(10),
            foreign key(job_id) references jobs(job_id),
            department_id int,
            foreign key(department_id) references departments(department_id),
            primary key(employee_id,start_date) -- composite primary key of two columns,--> to form one pk
    );
    
    insert into regions values (1,'north'),(2,'south'),(3,'East');
    
    select * from regions;
    
    insert into countries values ('DE','Germany',1),('IT','Italy',1),('JP','Japan',3),('US','United State',2);
    
    select * from countries;
    
    insert into locations values(1000,'1297 Via Cola di Rie','989','Roma',null,'IT')
    ,(1100,'93091 Calle della Te','10934','Venice',null,'IT')
    ,(1200,'2017 Shinjuku-ku','1689','Tokyo','Tokyo JP',null)
    ,(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US');
    
    select * from locations;
    
    INSERT INTO DEPARTMENTS VALUES(10,'Administration',200,1100),(20,'Marketing',201,1200),(30,'Purchasing',202,1400);
    
    select * from departments;
    
    insert into jobs values(1,'programmer',25000,45000),(2,'admin',22000,35000)
    ,(3,'Analyst programmer',28000,48000),(4,'SA',35000,65000);
    
    select * from jobs;
    
INSERT INTO employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
VALUES (100, 'Steven', 'King', 'SKING', '515-1234567', '1987-06-17', 1, 24000.00, 0.00, 109, 10);

INSERT INTO employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
VALUES (101, 'Neena', 'Kochhar', 'NKOCHHAR', '515-1234568', '1987-06-18', 2, 17000.00, 0.00, 103, 20);

INSERT INTO employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
VALUES (102, 'Lex', 'De Haan', 'LDEHAAN', '515-1234569', '1987-06-19', 3, 17000.00, 0.00, 108, 30);

INSERT INTO employees (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID)
VALUES (103, 'Alexander', 'Hunold', 'AHUNOLD', '590-4234567', '1987-06-20', 2, 9000.00, 0.00, 105, 20);
    
select * from employees;

INSERT INTO JOB_HISTORY (employee_id, start_date, end_date, job_id, department_id)
VALUES (102, '1993-01-13', '1998-07-24', 1, 20);

INSERT INTO JOB_HISTORY (employee_id, start_date, end_date, job_id, department_id)
VALUES (101, '1989-09-21', '1993-10-27', 2, 10);

INSERT INTO JOB_HISTORY (employee_id, start_date, end_date, job_id, department_id)
VALUES (101, '1993-10-28', '1997-03-15', 2, 30);

INSERT INTO JOB_HISTORY (employee_id, start_date, end_date, job_id, department_id)
VALUES (100, '1996-02-17', '1999-12-19', 3, 30);

INSERT INTO JOB_HISTORY (employee_id, start_date, end_date, job_id, department_id)
VALUES (103, '1998-03-24', '1999-12-31', 2, 20);

select * from JOB_HISTORY;

select l.location_id,l.street_address,l.city,l.state_province,c.country_name
from locations l inner join countries c on l.country_id = c.country_id;

select first_name,last_name,department_id
from employees;

with t1 as(
		select l.location_id,l.country_id,d.department_id
		from locations l inner join departments d on l.location_id = d.location_id
)
select e.first_name,e.last_name,e.department_id
from employees e inner join t1 on e.department_id = t1.department_id where t1.country_id = 'JP';

select e1.employee_id,e1.last_name as employee_lastName,e2.employee_id as managerID,e2.last_name as manager_lastName
from employees e1 left join employees e2 on e1.manager_id = e2.employee_id;

select first_name,last_name,hire_date
from employees where hire_date>'1987-06-19';

select * from departments;

select d.department_name,count(1) as number_of_employees
from employees e inner join departments d on e.department_id = d.department_id group by d.department_name;

select e.employee_id,j2.job_title,datediff(j1.end_date,j1.start_date) as number_of_days
from employees e inner join job_history j1 on e.employee_id = j1.employee_id
inner join jobs j2 on j2.job_id = j1.job_id where e.department_id =30;

with Allmanager as(
	   select concat(e2.last_name,' ',e2.first_name) as Manager_name
		from employees e1,employees e2 where e2.employee_id = e1.manager_id
)
select d.department_name,a.manager_name,l.city,c.COUNTRY_NAME
from departments d left join locations l on d.location_id = l.LOCATION_ID
inner join countries c on l.country_id = c.COUNTRY_ID,Allmanager a;

select avg(e.salary) as average_salary_of_department,d.department_name
from departments d inner join employees e on d.department_id=e.department_id
group by e.department_id;

create table job_grades(
	grade_level varchar(2) primary key,
    lowest_salary int,
    highest_salary int
    );

alter table jobs 
drop column min_salary,
drop column max_salary,
add column grade_level varchar(2),
add constraint fk_grade_level foreign key(grade_level) references job_grades(grade_level);
