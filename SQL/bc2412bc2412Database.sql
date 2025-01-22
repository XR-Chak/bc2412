-- this is a comment line
-- MySqlWorkbench is a client side-->connect(ip/port/id/password)->MySQL Server (7x24)

-- MySQL DBMS -> case insensitive!!!!
-- use database
use bootcamp_2412;

-- MySQL server may contain many database, one database may contain many tables
-- varchar = String
create table customers(
	id integer,
    first_name varchar(20),
    last_name varchar(20),
    email varchar(50),
    dob date
);

-- * mean all columns
select*
from customers;


insert into customers(id,first_name,last_name,email,dob)
values (1,'Vincent','Lau','vincentlau@gmail.com','1999-12-31');

insert into customers(id,first_name,last_name,email,dob)
values (2,'Lucas','Lau','Lucaslau@gmail.com','1999-12-31');

insert into customers(id,first_name,last_name,email,dob)
values (3,'Sally','Wong','SallyWong@gmail.com','2009-12-31');


insert into customers(id,first_name,last_name,email,dob)
values (2,'Ray','Chak','RayChak@gmail.com','2000-06-02');

delete from customers;-- delete all data from the table

SET SQL_SAFE_UPDATES = 0;-- to off the safemode

-- delete data by criteria
delete from customers where last_name = 'Wong';

-- select specific columns
-- select is to choose columns
select id, first_name,dob from customers;

-- where is to control rows
select id,first_name,dob from customers where dob< '2000-01-01';

-- select doesn;t change the data in harddisk.SQL is just using a program to retrieve the data in harddisk
-- insert ,delete change the data in harddisk

select * from customers where last_name = 'lau' and dob > '1999-12-01';
select * from customers where last_name = 'lau' or first_name = 'Sally';

-- and has higher priority to execute
select * from customers where last_name = 'lau' or first_name = 'Sally' and dob > '2000-01-01';
select * from customers where (last_name = 'lau' or first_name = 'Sally') and dob > '2000-01-01';

-- Not equals to
select * from customers where last_name <> 'Wong';

-- order by(default asc)
select * from customers order by first_name;
-- order by asc
select * from customers order by first_name asc;

-- order nby desc(~0.38ms)
select * from customers order by first_name desc;

select * from customers where dob>'2000-01-01' order by id desc;

-- table: orders
-- id,amount,order_date,customers_id

create table orders(
	id integer,
    amount integer,
    order_date date,
    customers_id long
    );


insert into 

