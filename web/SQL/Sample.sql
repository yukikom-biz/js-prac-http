DROP DATABASE IF EXISTS sample;
CREATE DATABASE sample;
USE sample;
CREATE TABLE emp(
    code INTEGER PRIMARY KEY ,
    name TEXT,
    age INTEGER,
    tel TEXT
);
-- INSERT INTO emp VALUES (1,);
insert into emp values (1,"鈴木",30,"03-1111-1111");
insert into emp values (2,"佐藤",28,"043-2222-2222");
insert into emp values (3,"田中",46,"05-3333-3333");
insert into emp values (4,"山田",57,"076-4444-4444");
insert into emp values (5,"木村",31,"076-5555-5555");
select * from emp;