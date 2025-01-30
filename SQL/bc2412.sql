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
select * from customers where last_name != 'Wong';
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
    amount decimal(13,2), -- 11 is for integer digit, 2 i for decimal places
    order_date datetime,
    customer_id integer
    );
drop table orders;
select * from orders;
insert into orders (id,amount,order_date,customer_id) values (1,100.9,STR_TO_DATE('2020-12-31 23:10:59','%Y-%m-%d %H:%i:%s'),1);


insert into orders (id,amount,order_date,customer_id) values (2,999.9,current_time(),3);

insert into orders (id,amount,order_date,customer_id) values (3,1999.9,current_time(),3);

insert into orders values (4,999.9,current_time(),3),
						  (5,999.9,current_time(),3);

-- sum()
select sum(amount) from orders;
select avg(amount) from orders;
select min(amount) from orders;
select max(amount) from orders;
select count(amount) from orders;

-- Not ok
select sum(amount),id from orders;

-- ok 
select sum(amount) as total_amt ,
round(avg(amount),2) as avg_amt,
min(amount) as lowest_amt,
max(amount) as highest_amt,
count(amount) as count_amt
from orders
where amount > 1000;

-- SQL sequence
-- 1. FROM
-- 2. WHERE
-- 3. GROUP BY (HAVING)
-- 4. ORDER BY
-- 5. SELECT COLUMNS

-- Math
select ceil(o.amount),o.* from orders o; -- ceil up to nearest integer

select floor(o.amount),o.* from orders o;  -- floor down to nearest integer
select abs(-4),abs(4) from dual;



-- String
select concat(c.first_name,' ',c.last_name) as full_name,
length(c.last_name) as length_of_lastname,
upper(c.first_name) as uppercase_firstname,
lower(c.first_name) as lowercase_firstname,
replace(c.email,'@','$') as new_email,
substring(c.first_name,1,1) as first_name_initial,
left(c.first_name,2) as left_first_name,
right(c.first_name,2) as right_first_name,
instr(c.first_name,'V') as firstname_contains_V1,
instr(c.first_name,'v') as firstname_contains_V2,
c.* from customers c;



-- LIKE
-- % means any characters
select * from customers
where first_name like '%V%';

select * from customers where first_name like '%';-- % -->anything will go inside
select * from customers where last_name like 'V%E';

select * from customers;
select count(*) from customers c; -- count all the data amount ,so it have 4 row, it show 4


-- Date
select o.*,date_add(o.order_date,interval 3 month) as follow_up_date
from orders o;

CREATE DATABASE RAY;

use ray;

create table ray_storage(
	id integer,
    item varchar(25),
    amount integer,
	buy_date date
);

insert into ray_storage values (1,'Toy_car',2,current_time());
insert into ray_storage values (2,'human',1,str_to_date('2025-01-22','%Y-%m-%D'));
select * from ray_storage;   

delete from ray_storage where id =1;

insert into ray_storage values (1,'Toy_car',2,current_time()),(3,'asd',99,current_time()),(4,'testing',12,current_timestamp());
    select count(*) as fuck from ray_storage;
    
    select ceil(100.1); -- 101
    
    select floor(100.1); -- 100

use bootcamp_2412;
    
-- Separate the data into groups, by a column (customer_id)
-- After group by, you can only select the column that you used for "Group"
select customer_id,count(amount) as order_count,avg(amount) as average_order_amount from orders group by customer_id;

-- from ->where -> group by ->select
select customer_id,sum(amount) as total_order_amt,count(1) as order_count
from orders
where amount <5000
group by customer_id;

-- 3 5
-- 1 1

select count(1) from orders o;

-- DataBase type: Relational database(Structure -> schema -> row x column)
-- Inner JOIN(Customer x order)

-- 1. find order count by customer, show customer ID, show first_name and last_name and order count

-- 3 customers x 6 orders
select c.last_name,c.last_name,(o.amount),count(o.id) as total_sum_order,c.id as customer_id 
from customers c inner join orders o on o.customer_id = c.id -- "on" before join
where o.amount<5000 -- "where after join,but before group
group by c.id,c.first_name,c.last_name;

select c.id,c.first_name,c.last_name,count(1) as order_count
from customers c, orders o
where c.id = o.customer_id
and o.amount<5000
group by c.id,c.first_name,c.last_name; 

-- group by + Having
select c.last_name,c.last_name,(o.amount),count(o.id) as total_sum_order,c.id as customer_id 
from customers c inner join orders o on o.customer_id = c.id -- "on" before join
where o.amount<5000 -- "where after join,but before group ,filter record(rows)
group by c.id,c.first_name,c.last_name
having count(1) >1 -- after group by -> filter group
order by c.id;


-- distinct, gcheck the field value, if the date have dulplicate jsut show one only
select distinct customer_id
from orders;

select distinct last_name from customers;

insert into customers values(4,'Vincent','Lau','vincentLau2@gmail.com','1999-01-01');

select distinct last_name,first_name from customers group by last_name,first_name; -- group by will execute first!!!!

select last_name,first_name,count(1)
from customers
group by last_name,first_name;

-- Distinct column should exist in "group by"

-- select dustinct id
-- from customers
-- group by last_name, first_name

-- LEFT JOIN(show all record of the left table)
-- FIND all customers with his orders
select c.*,o.*
from customers c left join orders o on c.id = o.customer_id;

-- RIGHT JOIN
select c.*,o.*
from customers c right join orders o on c.id = o.customer_id;

select o.*,c.*
from orders o right join customers c on c.id = o.customer_id;

-- find the customer who didn't place order
-- left join + where

select c.*,o.*
from customers c left join orders o on c.id = o.customer_id
where o.id is null;

