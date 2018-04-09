--
-- ER/Studio 8.0 SQL Code Generation
-- Company :      Hewlett-Packard Company
-- Project :      fenku.DM1
-- Author :       King
--
-- Date Created : Sunday, April 08, 2018 20:53:37
-- Target DBMS : MySQL 5.x
--

DROP TABLE base_configuration
;
DROP TABLE clearing
;
DROP TABLE cust_info
;
DROP TABLE cust_task
;
DROP TABLE file_local_channel
;
DROP TABLE file_source_channel
;
DROP TABLE market
;
DROP TABLE market_file
;
DROP TABLE pickup_rule
;
DROP TABLE settle
;
DROP TABLE sh_seat
;
DROP TABLE szt
;
DROP TABLE task
;
-- 
-- TABLE: base_configuration 
--

CREATE TABLE base_configuration(
    base_configuration_id             INT             NOT NULL,
    base_configuration_prop           VARCHAR(40)     NOT NULL,
    base_configuration_value          VARCHAR(100)    NOT NULL,
    base_configuration_description    VARCHAR(60)     NOT NULL,
    PRIMARY KEY (base_configuration_id)
)ENGINE=MYISAM
;



-- 
-- TABLE: clearing 
--

CREATE TABLE clearing(
    `clearing _NO`              CHAR(5)        NOT NULL,
    `clearing _NO_description`  VARCHAR(30)    NOT NULL,
    PRIMARY KEY (`clearing _NO`)
)
;



-- 
-- TABLE: cust_info 
--

CREATE TABLE cust_info(
    cust_NO                  CHAR(10)       NOT NULL,
    sh_seat_NO               CHAR(5)        NOT NULL,
    `settle _no`             CHAR(5)        NOT NULL,
    szt_NO                   CHAR(5)        NOT NULL,
    true_file_name           VARCHAR(40)    NOT NULL,
    `clearing _NO`           CHAR(5)        NOT NULL,
    custname                 VARCHAR(20)    NOT NULL,
    sh_account_NO            CHAR(10),
    sz_account_NO            CHAR(10),
    send_type                CHAR(1)        NOT NULL,
    send_type_description    VARCHAR(10),
    mail_address             VARCHAR(40),
    PRIMARY KEY (cust_NO, sh_seat_NO, `settle _no`, szt_NO, true_file_name, `clearing _NO`)
)ENGINE=MYISAM
;



-- 
-- TABLE: cust_task 
--

CREATE TABLE cust_task(
    cust_NO           CHAR(10)       NOT NULL,
    true_file_name    VARCHAR(40)    NOT NULL,
    PRIMARY KEY (cust_NO, true_file_name)
)ENGINE=MYISAM
;



-- 
-- TABLE: file_local_channel 
--

CREATE TABLE file_local_channel(
    file_local_channel_id      INT             NOT NULL,
    file_local_channel_path    VARCHAR(200)    NOT NULL,
    file_type                  VARCHAR(20)     NOT NULL,
    PRIMARY KEY (file_local_channel_id)
)ENGINE=MYISAM
;



-- 
-- TABLE: file_source_channel 
--

CREATE TABLE file_source_channel(
    file_source_channel_id      INT             NOT NULL,
    file_source_channel_path    VARCHAR(200)    NOT NULL,
    file_type                   VARCHAR(20)     NOT NULL,
    PRIMARY KEY (file_source_channel_id)
)ENGINE=MYISAM
;



-- 
-- TABLE: market 
--

CREATE TABLE market(
    market_id      CHAR(2)        NOT NULL,
    market_name    VARCHAR(20)    NOT NULL,
    PRIMARY KEY (market_id)
)ENGINE=MYISAM
;



-- 
-- TABLE: market_file 
--

CREATE TABLE market_file(
    market_file_id            INT            NOT NULL,
    market_id                 CHAR(2)        NOT NULL,
    file_source_channel_id    INT            NOT NULL,
    file_local_channel_id     INT            NOT NULL,
    file_type                 VARCHAR(20)    NOT NULL,
    file_prefix               VARCHAR(20),
    file_bz                   VARCHAR(40),
    file_suffix               VARCHAR(20)    NOT NULL,
    PRIMARY KEY (market_file_id, market_id, file_source_channel_id, file_local_channel_id)
)ENGINE=MYISAM
;



-- 
-- TABLE: pickup_rule 
--

CREATE TABLE pickup_rule(
    pickup_rule_id      INT             AUTO_INCREMENT,
    market_file_id      CHAR(2)         NOT NULL,
    pickup_rule_type    CHAR(2)         NOT NULL,
    pick_rule_desc      VARCHAR(100),
    PRIMARY KEY (pickup_rule_id)
)ENGINE=MYISAM
;



-- 
-- TABLE: settle 
--

CREATE TABLE settle(
    `settle _no`             CHAR(5)        NOT NULL,
    settle_NO_description    VARCHAR(30)    NOT NULL,
    PRIMARY KEY (`settle _no`)
)
;



-- 
-- TABLE: sh_seat 
--

CREATE TABLE sh_seat(
    sh_seat_NO          CHAR(5)        NOT NULL,
    seat_description    VARCHAR(30),
    PRIMARY KEY (sh_seat_NO)
)
;



-- 
-- TABLE: szt 
--

CREATE TABLE szt(
    szt_NO      CHAR(5)         NOT NULL,
    szt_path    VARCHAR(200)    NOT NULL,
    PRIMARY KEY (szt_NO)
)
;



-- 
-- TABLE: task 
--

CREATE TABLE task(
    task_id           INT            NOT NULL,
    task_date         CHAR(8)        NOT NULL,
    true_file_name    VARCHAR(40)    NOT NULL,
    task_status       CHAR(2)        NOT NULL,
    task_desc         VARCHAR(30)    NOT NULL,
    PRIMARY KEY (task_id, task_date)
)
;



-- 
-- TABLE: cust_info 
--

ALTER TABLE cust_info ADD CONSTRAINT Refcust_task61 
    FOREIGN KEY (cust_NO, true_file_name)
    REFERENCES cust_task(cust_NO, true_file_name)
;

ALTER TABLE cust_info ADD CONSTRAINT Refsh_seat71 
    FOREIGN KEY (sh_seat_NO)
    REFERENCES sh_seat(sh_seat_NO)
;

ALTER TABLE cust_info ADD CONSTRAINT Refsettle81 
    FOREIGN KEY (`settle _no`)
    REFERENCES settle(`settle _no`)
;

ALTER TABLE cust_info ADD CONSTRAINT Refszt91 
    FOREIGN KEY (szt_NO)
    REFERENCES szt(szt_NO)
;

ALTER TABLE cust_info ADD CONSTRAINT Refclearing171 
    FOREIGN KEY (`clearing _NO`)
    REFERENCES clearing(`clearing _NO`)
;


-- 
-- TABLE: market_file 
--

ALTER TABLE market_file ADD CONSTRAINT Refmarket11 
    FOREIGN KEY (market_id)
    REFERENCES market(market_id)
;

ALTER TABLE market_file ADD CONSTRAINT Reffile_source_channel141 
    FOREIGN KEY (file_source_channel_id)
    REFERENCES file_source_channel(file_source_channel_id)
;

ALTER TABLE market_file ADD CONSTRAINT Reffile_local_channel151 
    FOREIGN KEY (file_local_channel_id)
    REFERENCES file_local_channel(file_local_channel_id)
;


