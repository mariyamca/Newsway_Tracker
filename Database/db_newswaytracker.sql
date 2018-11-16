# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_newswaytracker
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    2018-10-13 13:56:04
# --------------------------------------------------------

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ANSI,NO_BACKSLASH_ESCAPES';*/
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;*/


#
# Database structure for database 'db_newswaytracker'
#

CREATE DATABASE /*!32312 IF NOT EXISTS*/ "db_newswaytracker" /*!40100 DEFAULT CHARACTER SET latin1 COLLATE latin1_german1_ci */;

USE "db_newswaytracker";


#
# Table structure for table 'tbl_admin'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_admin" (
  "admin_id" int(11) NOT NULL auto_increment,
  "admin_username" varchar(50) default NULL,
  "admin_password" varchar(50) NOT NULL,
  "admin_email" varchar(50) default NULL,
  PRIMARY KEY  ("admin_id")
) AUTO_INCREMENT=2;



#
# Dumping data for table 'tbl_admin'
#

LOCK TABLES "tbl_admin" WRITE;
/*!40000 ALTER TABLE "tbl_admin" DISABLE KEYS;*/
REPLACE INTO "tbl_admin" ("admin_id", "admin_username", "admin_password", "admin_email") VALUES
	(1,'Admin','Admin_1922','mariyapaul1923@gmail.com');
/*!40000 ALTER TABLE "tbl_admin" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_advertise'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_advertise" (
  "advertise_id" int(11) NOT NULL auto_increment,
  "advertise_type" varchar(50) NOT NULL,
  "advertise_width" varchar(50) NOT NULL,
  "advertise_height" varchar(50) NOT NULL,
  "advertise_rate" varchar(50) NOT NULL,
  PRIMARY KEY  ("advertise_id")
) AUTO_INCREMENT=6;



#
# Dumping data for table 'tbl_advertise'
#

LOCK TABLES "tbl_advertise" WRITE;
/*!40000 ALTER TABLE "tbl_advertise" DISABLE KEYS;*/
REPLACE INTO "tbl_advertise" ("advertise_id", "advertise_type", "advertise_width", "advertise_height", "advertise_rate") VALUES
	(3,'inaugration','30','50','200');
REPLACE INTO "tbl_advertise" ("advertise_id", "advertise_type", "advertise_width", "advertise_height", "advertise_rate") VALUES
	(4,'Funeral','30','50','200');
REPLACE INTO "tbl_advertise" ("advertise_id", "advertise_type", "advertise_width", "advertise_height", "advertise_rate") VALUES
	(5,'Funeral','100','50','200');
/*!40000 ALTER TABLE "tbl_advertise" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_booking'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_booking" (
  "booking_id" int(11) NOT NULL auto_increment,
  "booking_date" date NOT NULL,
  "custreg_id" int(11) NOT NULL,
  "prodplan_id" int(11) NOT NULL,
  "booking_status" varchar(50) default '0',
  PRIMARY KEY  ("booking_id"),
  UNIQUE KEY "booking_id" ("booking_id")
) AUTO_INCREMENT=7;



#
# Dumping data for table 'tbl_booking'
#

LOCK TABLES "tbl_booking" WRITE;
/*!40000 ALTER TABLE "tbl_booking" DISABLE KEYS;*/
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status") VALUES
	(1,'2018-10-11',16,5,'1');
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status") VALUES
	(3,'2018-10-12',21,9,'1');
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status") VALUES
	(4,'2018-10-12',21,12,'2');
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status") VALUES
	(6,'2018-10-13',22,7,'1');
/*!40000 ALTER TABLE "tbl_booking" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_custreg'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_custreg" (
  "custreg_id" int(11) NOT NULL auto_increment,
  "custreg_name" varchar(50) NOT NULL,
  "custreg_hname" varchar(50) NOT NULL,
  "custreg_gender" varchar(50) NOT NULL,
  "place_id" int(11) NOT NULL,
  "custreg_age" varchar(50) NOT NULL,
  "custreg_email" varchar(50) NOT NULL,
  "custreg_phno" varchar(50) NOT NULL,
  "custreg_district" varchar(50) NOT NULL,
  "custreg_pin" int(11) NOT NULL,
  "custreg_accno" varchar(50) NOT NULL,
  "custreg_uname" varchar(50) NOT NULL,
  "custreg_pswd" varchar(50) NOT NULL,
  "custreg_status" int(50) NOT NULL default '0',
  PRIMARY KEY  ("custreg_id")
) AUTO_INCREMENT=23;



#
# Dumping data for table 'tbl_custreg'
#

LOCK TABLES "tbl_custreg" WRITE;
/*!40000 ALTER TABLE "tbl_custreg" DISABLE KEYS;*/
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(16,'athira','kaatil','FEMALE',1,'23','athira@gmail.com','9867549087','ernakulam',6789056,'sbi3567789088','athira','athira12',0);
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(17,'sree','kallikattil','FEMALE',4,'23','897690876','sree123@gmail.com','ernakulam',6879087,'sbi24567899','sree12','1234',0);
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(18,'fousiya','kallikaatil','FEMALE',1,'24','8976549087','fousi','ernakulam',687890,'sbi5667889','fousi','1234',0);
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(19,'achanya','neelathadathil','FEMALE',1,'23','78999765','achanyasp@gmail.com','ernakulam',6875446,'sbis3567uu','achanya','ach123',0);
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(20,'anumol','kallisseri','FEMALE',11,'22','anumol123@gmail.com','7890657812','ernakulam',687899,'sbi12456778','anumol12','anu12',0);
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(21,'mariya paul','koloth','FEMALE',4,'20','mariya@gmail.com ','987654890','ernakulam',686678,'sbi67896544','mariya12','mari12',0);
REPLACE INTO "tbl_custreg" ("custreg_id", "custreg_name", "custreg_hname", "custreg_gender", "place_id", "custreg_age", "custreg_email", "custreg_phno", "custreg_district", "custreg_pin", "custreg_accno", "custreg_uname", "custreg_pswd", "custreg_status") VALUES
	(22,'anu','anuhouse','FEMALE',11,'22','anu@gmail.com','9867543290','ernakulam',686678,'sbi234t6u','anu12','anu123',0);
/*!40000 ALTER TABLE "tbl_custreg" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_item'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_item" (
  "item_id" int(11) NOT NULL auto_increment,
  "item_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("item_id")
) AUTO_INCREMENT=8;



#
# Dumping data for table 'tbl_item'
#

LOCK TABLES "tbl_item" WRITE;
/*!40000 ALTER TABLE "tbl_item" DISABLE KEYS;*/
REPLACE INTO "tbl_item" ("item_id", "item_name") VALUES
	(1,'Newspaper');
REPLACE INTO "tbl_item" ("item_id", "item_name") VALUES
	(2,'Weekly');
REPLACE INTO "tbl_item" ("item_id", "item_name") VALUES
	(5,'Magazine');
/*!40000 ALTER TABLE "tbl_item" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_lang'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_lang" (
  "lang_id" int(11) NOT NULL auto_increment,
  "lang_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("lang_id")
) AUTO_INCREMENT=7;



#
# Dumping data for table 'tbl_lang'
#

LOCK TABLES "tbl_lang" WRITE;
/*!40000 ALTER TABLE "tbl_lang" DISABLE KEYS;*/
REPLACE INTO "tbl_lang" ("lang_id", "lang_name") VALUES
	(1,'Malayalam');
REPLACE INTO "tbl_lang" ("lang_id", "lang_name") VALUES
	(2,'English');
/*!40000 ALTER TABLE "tbl_lang" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_location'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_location" (
  "location_id" int(11) NOT NULL auto_increment,
  "paperboy_id" int(10) unsigned default NULL,
  "location_latitude" tinyint(3) unsigned default NULL,
  "location_longitude" varchar(50) NOT NULL,
  PRIMARY KEY  ("location_id")
);



#
# Dumping data for table 'tbl_location'
#

# No data found.



#
# Table structure for table 'tbl_paperboy'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_paperboy" (
  "paperboy_id" int(11) NOT NULL auto_increment,
  "paperboy_name" varchar(50) NOT NULL,
  "place_id" int(3) NOT NULL,
  "paperboy_gender" varchar(50) NOT NULL,
  "paperboy_age" varchar(50) NOT NULL,
  "paperboy_email" varchar(50) NOT NULL,
  "paperboy_phno" varchar(50) default NULL,
  "paperboy_district" varchar(50) NOT NULL,
  "paperboy_uname" varchar(50) NOT NULL,
  "paperboy_pswd" varchar(50) NOT NULL,
  "paperboy_status" int(11) NOT NULL default '0',
  PRIMARY KEY  ("paperboy_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_paperboy'
#

LOCK TABLES "tbl_paperboy" WRITE;
/*!40000 ALTER TABLE "tbl_paperboy" DISABLE KEYS;*/
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(2,'kishore',4,'MALE','34','kishore@gmail.com','578900977','ernakulam','kishore','1234',0);
/*!40000 ALTER TABLE "tbl_paperboy" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_place'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_place" (
  "place_id" int(11) NOT NULL auto_increment,
  "place_name" varchar(50) default NULL,
  PRIMARY KEY  ("place_id")
) AUTO_INCREMENT=12;



#
# Dumping data for table 'tbl_place'
#

LOCK TABLES "tbl_place" WRITE;
/*!40000 ALTER TABLE "tbl_place" DISABLE KEYS;*/
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(1,'kothamangalam');
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(4,'Pallithazham');
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(11,'Thankalam');
/*!40000 ALTER TABLE "tbl_place" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_plan'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_plan" (
  "plan_id" int(50) NOT NULL auto_increment,
  "plan_type" varchar(50) NOT NULL,
  PRIMARY KEY  ("plan_id")
) AUTO_INCREMENT=15;



#
# Dumping data for table 'tbl_plan'
#

LOCK TABLES "tbl_plan" WRITE;
/*!40000 ALTER TABLE "tbl_plan" DISABLE KEYS;*/
REPLACE INTO "tbl_plan" ("plan_id", "plan_type") VALUES
	(1,'Yearly');
REPLACE INTO "tbl_plan" ("plan_id", "plan_type") VALUES
	(5,'Weekly');
REPLACE INTO "tbl_plan" ("plan_id", "plan_type") VALUES
	(9,'Monthly');
REPLACE INTO "tbl_plan" ("plan_id", "plan_type") VALUES
	(14,'Daily');
/*!40000 ALTER TABLE "tbl_plan" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_prodplan'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_prodplan" (
  "prodplan_id" int(11) NOT NULL auto_increment,
  "product_id" int(11) NOT NULL,
  "plan_id" int(11) NOT NULL,
  "prodplan_rate" varchar(50) NOT NULL,
  PRIMARY KEY  ("prodplan_id")
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tbl_prodplan'
#

LOCK TABLES "tbl_prodplan" WRITE;
/*!40000 ALTER TABLE "tbl_prodplan" DISABLE KEYS;*/
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(1,4,7,'500');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(2,6,9,'200');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(4,7,9,'50');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(5,6,1,'1000');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(7,13,9,'100');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(8,13,1,'800');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(9,12,1,'600');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(10,12,9,'60');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(11,14,1,'1800');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(12,14,9,'180');
/*!40000 ALTER TABLE "tbl_prodplan" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_product'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_product" (
  "product_id" int(11) NOT NULL auto_increment,
  "item_id" int(11) default NULL,
  "lang_id" int(11) NOT NULL,
  "product_name" varchar(50) NOT NULL,
  "product_price" varchar(50) NOT NULL,
  PRIMARY KEY  ("product_id")
) AUTO_INCREMENT=17;



#
# Dumping data for table 'tbl_product'
#

LOCK TABLES "tbl_product" WRITE;
/*!40000 ALTER TABLE "tbl_product" DISABLE KEYS;*/
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(6,1,1,'Mangalam','6');
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(11,1,1,'Manaroma','8');
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(12,2,1,'Vanitha','30');
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(13,2,1,'BALARAMA','10');
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(14,1,2,'THE HINDU','6');
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(15,1,2,'Indain Express','10');
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(16,2,2,'The Week','40');
/*!40000 ALTER TABLE "tbl_product" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_route'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_route" (
  "route_id" int(50) NOT NULL auto_increment,
  "route_name" varchar(50) NOT NULL,
  "route_to" int(11) NOT NULL,
  "route_from" int(11) NOT NULL,
  "paperboy_id" tinyint(3) unsigned default NULL,
  PRIMARY KEY  ("route_id")
);



#
# Dumping data for table 'tbl_route'
#

# No data found.

/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
