
drop table PRODUCTS if exists;
create table PRODUCTS (
id int primary key,
name varchar(100),
price double,
make_date date,
description varchar(256)
);
--
--drop table REVIEWS if exists;
--create table REVIEWS (
--id int primary key,
--stars int,
--author varchar(20),
--message varchar(256),
--product_id int foreign key references PRODUCTS(id)
--);
