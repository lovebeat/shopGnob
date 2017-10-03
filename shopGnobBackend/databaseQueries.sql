
CREATE DATABASE [ECommerce]
GO
USE [ECommerce]
GO

CREATE TABLE Category(
	
	id int IDENTITY(1,1) not null,
	name nvarchar(50) null,
	description nVARCHAR(500) null,
	image_url nVARCHAR(100) null,
	is_active bit null,
	CONSTRAINT pk_category_id PRIMARY KEY (id)
);

INSERT INTO Category (name,description,image_url,is_active) VALUES ('Cactus','This is some description for Cactus','CAT_1.jpg','1')
INSERT INTO Category (name,description,image_url,is_active) VALUES ('Succulent','This is some description for Succulent','CAT_2.jpg','1')
INSERT INTO Category (name,description,image_url,is_active) VALUES ('Others','This is some description for others','CAT_3.jpg','1')

CREATE TABLE User_detail(
	
	id int IDENTITY(1,1) not null,
	first_name nvarchar(50),
	last_name nVARCHAR(50),
	role nVARCHAR(50),
	enabled bit null,
	password nvarchar(50),
	email nvarchar(100),
	contact_number nvarchar(50)
	CONSTRAINT pk_user_id PRIMARY KEY (id)
	);

INSERT INTO User_detail (first_name,last_name,role, enabled, password, email, contact_number) VALUES ('Nguyen','Gnob', 'ADMIN', '1','admin','gnob@gmail.com','01636244804')
INSERT INTO User_detail (first_name,last_name,role, enabled, password, email, contact_number) VALUES ('Nguyen','SaoDem', 'SUPPLIER', '1','supplier','saodem@gmail.com','0969952616')
INSERT INTO User_detail (first_name,last_name,role, enabled, password, email, contact_number) VALUES ('Nguyen','Duong', 'SUPPLIER', 'true','supplier','duong@gmail.com','01653765276')


CREATE TABLE Product(
	id int IDENTITY(1,1) not null,
	code nvarchar(50) null,
	name nVARCHAR(50) null,
	brand nVARCHAR(50) null,
	description nvarchar(100) null,
	unit_price Decimal (10,2) null,
	quantity int null,
	is_active bit null,
	category_id int,
	supplier_id int,
	purchases int Default 0,
	views int default 0,
	CONSTRAINT pk_product_id PRIMARY KEY (id),
	CONSTRAINT fk_product_category_id FOREIGN KEY (category_id) REFERENCES Category(id),
	CONSTRAINT fk_product_supplier_id FOREIGN KEY (supplier_id) REFERENCES User_detail(id)	
	);

INSERT INTO Product(code,name,brand,description, unit_price, quantity, is_active,category_id,supplier_id) 
VALUES ('GNOBCUTE0001','Birthday Cake Cactus', 'Cactus','this is one of the best Cactus available in the shop right now',40000,5,'1',1,2)

INSERT INTO Product(code,name,brand,description, unit_price, quantity, is_active,category_id,supplier_id) 
VALUES ('GNOBCUTE0002','Móc câu Cactus', 'Cactus','this is one of the best Cactus available in the shop right now',50000,4,'1',1,3)

INSERT INTO Product(code,name,brand,description, unit_price, quantity, is_active,category_id,supplier_id) 
VALUES ('GNOBCUTE0003','Cỏ ngọc Succulent', 'Succulent','this is one of the best Succulent available in the shop right now',65000,2,'1',2,3)

INSERT INTO Product(code,name,brand,description, unit_price, quantity, is_active,category_id,supplier_id) 
VALUES ('GNOBCUTE0004','Three Colour Succulent', 'Succulent','this is one of the best Succlent available in the shop right now',35000,7,'1',2,2)

