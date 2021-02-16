--liquibase formatted sql
--changeset database-migration:1

create TABLE customer
(
    id         int IDENTITY(1,1) primary key,
    first_name varchar(50),
    last_name  varchar(50),
    email  varchar(50),
    age        int
);