create database ecore;

use ecore;

create table predefined_role(
id int AUTO_INCREMENT PRIMARY KEY,
name varchar(20)
);

create table role(
id int AUTO_INCREMENT PRIMARY KEY,
name varchar(20)
);

INSERT INTO predefined_role(NAME) VALUES ('Developer');
INSERT INTO predefined_role(NAME) VALUES ('Product Owner');
INSERT INTO predefined_role(NAME) VALUES ('Tester');
