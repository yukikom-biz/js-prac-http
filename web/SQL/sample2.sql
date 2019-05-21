DROP DATABASE IF EXISTS test;
create database test;
use test;
drop table if exists item;
drop table if exists category;
drop table if exists customer;
drop table if exists ordered;
drop table if exists ordered_default;

create table item
(
    code          SERIAL primary key,
    category_code integer,
    name          text,
    price         integer
);
create table category
(
    code serial primary key,
    name text
);
create table customer
(
    code    serial primary key,
    name    text,
    address text,
    tel     text,
    email   text
);
create table ordered
(
    code          serial primary key,
    customer_code integer,
    ordered_date  date,
    total_price   integer
);
create table ordered_detail
(
    ordered_code integer,
    item_code    integer,
    num          integer
);
insert into category(name)
values ('本');
insert into category (name)
values ('DVD');
insert into category (name)
values ('ゲーム');

insert into item (category_code, name, price)
values (1, 'Javaの基本', 2500);
insert into item (category_code, name, price)
values (1, 'MLB Fun', 980);
insert into item (category_code, name, price)
values (1, '料理 BOOK!', 1200);

insert into item (category_code, name, price)
values (2, '懐かしのアニメシリーズ', 2000);
insert into item (category_code, name, price)
values (2, 'The Racer', 1000);
insert into item (category_code, name, price)
values (2, 'Space Wars 3', 1200);


insert into item (category_code, name, price)
values (3, 'パズルゲーム', 780);
insert into item (category_code, name, price)
values (3, 'Invader Fighter', 3400);
insert into item (category_code, name, price)
values (3, 'Play the BascketBall', 2200);