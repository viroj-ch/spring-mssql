--liquibase formatted sql
--changeset database-migration:2

INSERT INTO customer (first_name, last_name, age) values ('John', 'Wick', 30);
-- INSERT INTO customer (first_name, last_name, age) values ('Karl', 'Jablonski', 45);
-- INSERT INTO customer (first_name, last_name, age) values ('Matti', 'Karttunen', 31);
-- INSERT INTO customer (first_name, last_name, age) values ('Wolski', 'Zbyszek', 18);
