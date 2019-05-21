-- This is Comment
CREATE DATABASE sample OWNER student ENCODING 'UTF8';

CREATE TABLE emp( code INTEGER PRIMARY KEY, name TEXT, age INTEGER, tel TEXT);

INSERT INTO emp VALUES (1,'鈴木',30,'03-1111-1111'),
                       (2,'佐藤',28,'043-2222-2222'),
                       (3,'田中',46,'05-3333-3333'),
                       (4,'山田',57,'076-4444-4444'),
                       (5,'木村',31,'076-5555-5555');

ALTER TABLE emp OWNER TO student;

CREATE TABLE item (code SERIAL PRIMARY KEY, category_code INTEGER , name TEXT, price INTEGER);
CREATE TABLE category (code SERIAL PRIMARY KEY, name TEXT);
CREATE TABLE customer (code SERIAL PRIMARY KEY, name TEXT, address TEXT, tel TEXT, email TEXT);
CREATE TABLE ordered(code SERIAL PRIMARY KEY, customer_code INTEGER, orderd_date DATE, total_price INTEGER);
CREATE TABLE orderd_detail(orderd_code INTEGER , item_code INTEGER, num INTEGER);