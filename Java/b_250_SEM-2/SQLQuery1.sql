--CREATE DATABASE DEV_21010101103
CREATE TABLE DEPOSIT
(
	ACTNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2),
	ADATE DATETIME
)

CREATE TABLE BRANCH
(
	BNAME VARCHAR(50),
	CITY VARCHAR(50)
)

CREATE TABLE CUSTOMERS
(
	BNAME VARCHAR(50),
	CITY VARCHAR(50)
)

CREATE TABLE BORROW
(
	LOANNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2)
)

INSERT INTO DEPOSIT VALUES(101,'ANIL','VRCE',1000,'01-MAR-95')
INSERT INTO DEPOSIT VALUES(102,'SUNIL','AJNI',5000,'04-JAN-96')
INSERT INTO DEPOSIT VALUES(103,'MEHUL','KAROLBAGH',3500,'17-NOV-95')
INSERT INTO DEPOSIT VALUES(104,'MADHURI','CHANDI',1200,'17-DEC-95')
INSERT INTO DEPOSIT VALUES(105,'PRMOD','M.G.ROAD',3000,'27-MAR-96')
INSERT INTO DEPOSIT VALUES(106,'SANDIP','ANDHERI',2000,'31-MAR-96')
INSERT INTO DEPOSIT VALUES(107,'SHIVANI','VIRAR',1000,'05-SEP-95')
INSERT INTO DEPOSIT VALUES(108,'KRANTI','NEHRU PLACE',5000,'02-JUL-95')
INSERT INTO DEPOSIT VALUES(109,'MINU','POWAI',7000,'10-AUG-95')

SELECT *FROM DEPOSIT