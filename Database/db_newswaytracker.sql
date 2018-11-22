# HeidiSQL Dump 
#
# --------------------------------------------------------
# Host:                         127.0.0.1
# Database:                     db_newswaytracker
# Server version:               5.0.51b-community-nt
# Server OS:                    Win32
# Target compatibility:         ANSI SQL
# HeidiSQL version:             4.0
# Date/time:                    11/20/2018 4:31:31 PM
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
	(1,'Admin','Admin_1739','mariyapaul1923@gmail.com');
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
) AUTO_INCREMENT=8;



#
# Dumping data for table 'tbl_advertise'
#

LOCK TABLES "tbl_advertise" WRITE;
/*!40000 ALTER TABLE "tbl_advertise" DISABLE KEYS;*/
REPLACE INTO "tbl_advertise" ("advertise_id", "advertise_type", "advertise_width", "advertise_height", "advertise_rate") VALUES
	(3,'inaugration','30','50','200');
REPLACE INTO "tbl_advertise" ("advertise_id", "advertise_type", "advertise_width", "advertise_height", "advertise_rate") VALUES
	(4,'Funeral','40','50','250');
REPLACE INTO "tbl_advertise" ("advertise_id", "advertise_type", "advertise_width", "advertise_height", "advertise_rate") VALUES
	(6,'Job Vacancy','30','20','100');
/*!40000 ALTER TABLE "tbl_advertise" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_assignrt'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_assignrt" (
  "assignrt_id" int(4) NOT NULL auto_increment,
  "route_id" int(11) NOT NULL,
  "paperboy_id" int(11) NOT NULL,
  PRIMARY KEY  ("assignrt_id"),
  UNIQUE KEY "assignrt-id" ("assignrt_id")
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tbl_assignrt'
#

LOCK TABLES "tbl_assignrt" WRITE;
/*!40000 ALTER TABLE "tbl_assignrt" DISABLE KEYS;*/
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(1,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(2,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(3,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(4,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(5,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(7,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(8,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(9,6,3);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(10,14,2);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(11,15,7);
REPLACE INTO "tbl_assignrt" ("assignrt_id", "route_id", "paperboy_id") VALUES
	(12,17,9);
/*!40000 ALTER TABLE "tbl_assignrt" ENABLE KEYS;*/
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
  "booking_paystatus" int(11) NOT NULL default '0',
  PRIMARY KEY  ("booking_id"),
  UNIQUE KEY "booking_id" ("booking_id")
) AUTO_INCREMENT=36;



#
# Dumping data for table 'tbl_booking'
#

LOCK TABLES "tbl_booking" WRITE;
/*!40000 ALTER TABLE "tbl_booking" DISABLE KEYS;*/
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(1,'2018-10-11',16,5,'1',0);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(6,'2018-10-13',22,7,'1',0);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(8,'2018-10-20',17,12,'2',0);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(10,'2018-10-30',23,14,'1',1);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(11,'2018-10-30',23,16,'1',1);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(14,'2018-10-30',23,12,'0',0);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(32,'2018-11-15',21,8,'1',1);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(33,'2018-11-15',21,13,'2',1);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(34,'2018-11-16',21,10,'1',1);
REPLACE INTO "tbl_booking" ("booking_id", "booking_date", "custreg_id", "prodplan_id", "booking_status", "booking_paystatus") VALUES
	(35,'2018-11-18',21,16,'1',1);
/*!40000 ALTER TABLE "tbl_booking" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_complaint'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_complaint" (
  "com_id" int(11) NOT NULL auto_increment,
  "com_des" varchar(50) NOT NULL,
  "com_date" date NOT NULL,
  "com_time" time NOT NULL,
  "custreg_id" int(20) NOT NULL,
  PRIMARY KEY  ("com_id")
) AUTO_INCREMENT=3;



#
# Dumping data for table 'tbl_complaint'
#

LOCK TABLES "tbl_complaint" WRITE;
/*!40000 ALTER TABLE "tbl_complaint" DISABLE KEYS;*/
REPLACE INTO "tbl_complaint" ("com_id", "com_des", "com_date", "com_time", "custreg_id") VALUES
	(1,'not get vanitha ','2018-11-08','21:19:13',21);
REPLACE INTO "tbl_complaint" ("com_id", "com_des", "com_date", "com_time", "custreg_id") VALUES
	(2,'not get vanitha','2018-11-09','15:33:48',21);
/*!40000 ALTER TABLE "tbl_complaint" ENABLE KEYS;*/
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
) AUTO_INCREMENT=25;



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
	(23,'anumol p','anunivas','FEMALE',13,'22','8907644568i','anu@gmail.com','ernakulam',686671,'sbi15689098u6','anu12','1234',0);
/*!40000 ALTER TABLE "tbl_custreg" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_insadv'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_insadv" (
  "adv_id" int(11) NOT NULL auto_increment,
  "adv_type" varchar(50) NOT NULL,
  "adv_width" int(50) NOT NULL,
  "adv_height" int(11) NOT NULL,
  "adv_rate" int(11) NOT NULL,
  "adv_image" varchar(500) default NULL,
  PRIMARY KEY  ("adv_id")
) AUTO_INCREMENT=16;



#
# Dumping data for table 'tbl_insadv'
#

LOCK TABLES "tbl_insadv" WRITE;
/*!40000 ALTER TABLE "tbl_insadv" DISABLE KEYS;*/
REPLACE INTO "tbl_insadv" ("adv_id", "adv_type", "adv_width", "adv_height", "adv_rate", "adv_image") VALUES
	(14,'4',30,50,200,'VID-20181120-WA0000.mp4');
REPLACE INTO "tbl_insadv" ("adv_id", "adv_type", "adv_width", "adv_height", "adv_rate", "adv_image") VALUES
	(15,'3',40,50,250,'Screenshot_20181120-083953.png');
/*!40000 ALTER TABLE "tbl_insadv" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_item'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_item" (
  "item_id" int(11) NOT NULL auto_increment,
  "item_name" varchar(50) NOT NULL,
  PRIMARY KEY  ("item_id")
) AUTO_INCREMENT=6;



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
) AUTO_INCREMENT=3;



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
  "paperboy_id" int(10) NOT NULL,
  "location_latitude" varchar(50) NOT NULL,
  "location_longitude" varchar(50) NOT NULL,
  "location_place" varchar(400) NOT NULL,
  "location_date" date NOT NULL,
  "location_time" time NOT NULL,
  PRIMARY KEY  ("location_id")
) AUTO_INCREMENT=135;



#
# Dumping data for table 'tbl_location'
#

LOCK TABLES "tbl_location" WRITE;
/*!40000 ALTER TABLE "tbl_location" DISABLE KEYS;*/
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(1,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:48:39');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(2,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:48:40');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(3,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:48:40');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(4,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:48:40');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(5,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:49:53');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(6,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:52:12');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(7,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:52:12');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(8,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:52:12');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(9,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','12:52:12');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(10,3,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-27','14:38:44');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(11,2,'9.9809874','76.5793115','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-10-28','13:09:21');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(12,2,'9.9809874','76.5793115','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-10-28','13:09:21');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(13,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','14:56:48');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(14,2,'9.9809874','76.5793115','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-10-28','14:57:29');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(15,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:01:32');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(16,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:03:51');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(17,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:07:24');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(18,2,'9.9809874','76.5793115','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-10-28','15:16:14');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(19,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:30:23');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(20,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:32:10');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(21,2,'9.9809874','76.5793115','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-10-28','15:36:57');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(22,2,'9.9820986','76.5788111','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:39:20');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(23,2,'9.9832098','76.5783106','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:39:38');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(24,2,'9.9820986','76.5788111','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:41:21');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(25,2,'9.9809874','76.5793115','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-10-28','15:41:43');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(26,2,'9.9820986','76.5788111','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-10-28','15:44:06');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(27,7,'10.1284381','76.6228324','Unnamed Road, Kerala 686681, India','2018-10-30','22:17:57');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(28,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:23:19');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(29,23,'10.1157679','76.6356094','Kuruppampady - Kottapady - Uppukandam - Malippara - Road, Kerala 686681, India','2018-10-30','22:23:39');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(30,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:26:01');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(31,23,'10.1284381','76.6228324','Unnamed Road, Kerala 686681, India','2018-10-30','22:26:21');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(32,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:27:01');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(33,23,'10.1157679','76.6356094','Kuruppampady - Kottapady - Uppukandam - Malippara - Road, Kerala 686681, India','2018-10-30','22:27:21');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(34,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:29:01');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(35,23,'10.1284381','76.6228324','Unnamed Road, Kerala 686681, India','2018-10-30','22:29:21');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(36,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:29:43');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(37,23,'10.1157679','76.6356094','Kuruppampady - Kottapady - Uppukandam - Malippara - Road, Kerala 686681, India','2018-10-30','22:30:03');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(38,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:31:03');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(39,23,'10.1284381','76.6228324','Unnamed Road, Kerala 686681, India','2018-10-30','22:31:23');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(40,23,'10.122103','76.6292209','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Kerala 686698, India','2018-10-30','22:32:04');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(41,23,'10.1157679','76.6356094','Kuruppampady - Kottapady - Uppukandam - Malippara - Road, Kerala 686681, India','2018-10-30','22:32:24');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(42,3,'9.9809389','76.5796811','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-11-06','11:17:05');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(43,23,'9.9809389','76.5796811','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-11-06','11:17:07');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(44,7,'9.9809389','76.5796811','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-11-06','11:17:13');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(45,3,'9.9809389','76.5796811','Kurisingal Building, Payward Complex, XIII/85, C6, Arakuzha Rd, P.O Junction, Muvattupuzha, Kerala 686661, India','2018-11-06','11:19:48');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(46,3,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-08','14:59:37');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(47,3,'10.0438066','76.6198855','Unnamed Road, Mathirappilly, Kothamangalam, Kerala 686691, India','2018-11-08','15:00:17');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(48,3,'10.0446808','76.6165537','Ambalappady Bus Stop, Kochi-Madurai-Tondi Point Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:00:37');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(49,3,'10.0361033','76.6171097','Kozhipilly - Pallipady Rd, Varappetty, Kerala 686691, India','2018-11-08','15:01:18');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(50,3,'10.0438066','76.6198855','Unnamed Road, Mathirappilly, Kothamangalam, Kerala 686691, India','2018-11-08','15:01:58');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(51,3,'10.0361033','76.6171097','Kozhipilly - Pallipady Rd, Varappetty, Kerala 686691, India','2018-11-08','15:02:17');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(52,2,'10.0361033','76.6171097','Kozhipilly - Pallipady Rd, Varappetty, Kerala 686691, India','2018-11-08','15:03:18');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(53,2,'10.0446808','76.6165537','Ambalappady Bus Stop, Kochi-Madurai-Tondi Point Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:03:38');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(54,2,'10.0446808','76.6165537','Ambalappady Bus Stop, Kochi-Madurai-Tondi Point Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:03:38');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(55,2,'10.0532583','76.6159977','Kochi - Madurai - Dhanushkodi Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:03:59');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(56,2,'10.0532583','76.6159977','Kochi - Madurai - Dhanushkodi Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:03:59');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(57,7,'10.0532583','76.6159977','Kochi - Madurai - Dhanushkodi Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:05:16');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(58,7,'10.0532583','76.6159977','Kochi - Madurai - Dhanushkodi Rd, Kothamangalam, Kerala 686691, India','2018-11-08','15:05:50');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(59,2,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','20:41:55');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(60,3,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','20:43:57');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(61,8,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','20:45:27');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(62,7,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','20:45:51');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(63,2,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','20:59:59');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(64,2,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','21:00:15');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(65,3,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','21:00:55');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(66,3,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','21:09:06');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(67,3,'10.1256558','76.6423124','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Malippara, Kerala 686681, India','2018-11-08','21:09:47');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(68,3,'10.1256558','76.6423124','Thrikkariyoor Vettilappara Kulangattukuzhy Road, Malippara, Kerala 686681, India','2018-11-08','21:09:47');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(69,3,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','21:10:40');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(70,3,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','21:10:41');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(71,3,'10.1599927','76.6699972','Kothamangalam - Idamalayar Road, Kerala 686681, India','2018-11-08','21:17:25');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(72,3,'10.0361033','76.6171097','Kozhipilly - Pallipady Rd, Varappetty, Kerala 686691, India','2018-11-09','15:06:59');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(73,3,'10.0438066','76.6198855','Unnamed Road, Mathirappilly, Kothamangalam, Kerala 686691, India','2018-11-09','15:07:19');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(74,3,'10.0438066','76.6198855','Unnamed Road, Mathirappilly, Kothamangalam, Kerala 686691, India','2018-11-09','15:16:11');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(75,3,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:16:31');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(76,3,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:17:48');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(77,21,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:22:35');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(78,21,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:22:35');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(79,3,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:23:33');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(80,3,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:26:36');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(81,3,'10.0532583','76.6159977','Kochi - Madurai - Dhanushkodi Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:26:55');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(82,9,'10.0532583','76.6159977','Kochi - Madurai - Dhanushkodi Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:28:37');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(83,9,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:29:17');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(84,9,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:29:17');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(85,9,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:29:38');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(86,9,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:29:38');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(87,21,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:33:17');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(88,21,'10.0523841','76.6193295','Heat Engines Lab, Kozhippilly - College Juction Rd, Kothamangalam, Kerala 686691, India','2018-11-09','15:33:17');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(89,21,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:33:58');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(90,21,'10.0515098','76.6226613','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-09','15:33:58');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(91,3,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:34:22');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(92,3,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:34:40');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(93,3,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:38:51');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(94,3,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:39:31');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(95,3,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:39:51');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(96,3,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:44:55');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(97,3,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:45:16');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(98,3,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:46:41');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(99,3,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:48:24');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(100,3,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:48:46');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(101,3,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:51:36');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(102,3,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:54:07');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(103,3,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:54:47');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(104,3,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:55:07');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(105,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:58:08');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(106,21,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','10:58:30');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(107,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:01:31');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(108,21,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:01:51');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(109,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:04:33');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(110,21,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:04:52');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(111,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:05:12');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(112,21,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:05:32');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(113,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:06:53');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(114,21,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:07:13');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(115,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:07:34');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(116,21,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:08:15');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(117,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:08:36');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(118,21,'9.9811899','76.5793838','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:08:56');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(119,21,'9.9821667','76.5789353','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:11:59');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(120,21,'9.9831435','76.5784868','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-11','11:12:20');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(121,2,'9.9831479','76.578478','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:09:32');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(122,2,'9.9820382','76.5791068','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:11:52');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(123,23,'9.9809284','76.5797356','Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:12:12');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(124,23,'9.9820382','76.5791068','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:15:34');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(125,23,'9.9831479','76.578478','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:15:53');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(126,23,'9.9831479','76.578478','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:26:15');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(127,23,'9.9820382','76.5791068','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:26:15');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(128,23,'9.9809284','76.5797356','Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','10:26:15');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(129,11,'9.9831479','76.578478','Tone Shotcut, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','12:24:06');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(130,11,'9.9820382','76.5791068','14 Ward, 151 Aramana Junction, State Highway 1, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','12:28:07');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(131,11,'9.9809284','76.5797356','Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-15','12:28:27');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(132,3,'10.0511486','76.6212888','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-16','14:23:14');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(133,3,'10.0511486','76.6212888','MACE Hostels Road, Kothamangalam, Kerala 686691, India','2018-11-16','14:46:25');
REPLACE INTO "tbl_location" ("location_id", "paperboy_id", "location_latitude", "location_longitude", "location_place", "location_date", "location_time") VALUES
	(134,3,'9.9853527','76.5768152','Muvattupuzha–Theni Road, SNDP Temple Rd, Thottumkalpeedika, Muvattupuzha, Kerala 686661, India','2018-11-18','16:07:18');
/*!40000 ALTER TABLE "tbl_location" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_notify'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_notify" (
  "notify_id" int(11) NOT NULL auto_increment,
  "notify_date" date NOT NULL,
  "notify_time" time NOT NULL,
  "notify_msg" varchar(50) NOT NULL,
  "custreg_id" int(11) NOT NULL,
  PRIMARY KEY  ("notify_id"),
  UNIQUE KEY "notify_id" ("notify_id")
) AUTO_INCREMENT=7;



#
# Dumping data for table 'tbl_notify'
#

LOCK TABLES "tbl_notify" WRITE;
/*!40000 ALTER TABLE "tbl_notify" DISABLE KEYS;*/
REPLACE INTO "tbl_notify" ("notify_id", "notify_date", "notify_time", "notify_msg", "custreg_id") VALUES
	(2,'2018-11-16','14:49:11','Notification::Your Payments are Pending ',16);
/*!40000 ALTER TABLE "tbl_notify" ENABLE KEYS;*/
UNLOCK TABLES;


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
) AUTO_INCREMENT=13;



#
# Dumping data for table 'tbl_paperboy'
#

LOCK TABLES "tbl_paperboy" WRITE;
/*!40000 ALTER TABLE "tbl_paperboy" DISABLE KEYS;*/
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(2,'kishore',4,'MALE','34','kishore@gmail.com','578900977','ernakulam','kishore','1234',1);
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(3,'alok',11,'MALE','34','alok@gmail.com','9867549906','ernakulam','alok12','alok123',1);
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(7,'Aravind kumar',13,'MALE','33','aravind1978@gmail.con ','9876549087','ernakulam ','aravind123','1234',1);
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(8,'akash',17,'MALE','34','akash@gmail.com','8976908765','ernakulam','akashk','ak123',1);
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(9,'sathyan',17,'MALE','34','sathya@mail.com','8976547890','ernakulam','sathya','1234',1);
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(11,'arun s',17,'MALE','29','mariyapaul1923@gmail.com','8970678987','ernakulam','arun','arun12',1);
REPLACE INTO "tbl_paperboy" ("paperboy_id", "paperboy_name", "place_id", "paperboy_gender", "paperboy_age", "paperboy_email", "paperboy_phno", "paperboy_district", "paperboy_uname", "paperboy_pswd", "paperboy_status") VALUES
	(12,'amal',16,'MALE','34','mariyapaul1923@gmail.com','8976549076','ernakulam','amal12','amal12',1);
/*!40000 ALTER TABLE "tbl_paperboy" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_place'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_place" (
  "place_id" int(11) NOT NULL auto_increment,
  "place_name" varchar(50) default NULL,
  PRIMARY KEY  ("place_id")
) AUTO_INCREMENT=18;



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
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(12,'College Junction');
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(13,'Nellikuzhy');
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(15,'Mathirapilly');
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(16,'Byepass');
REPLACE INTO "tbl_place" ("place_id", "place_name") VALUES
	(17,'Karukadam');
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
) AUTO_INCREMENT=20;



#
# Dumping data for table 'tbl_prodplan'
#

LOCK TABLES "tbl_prodplan" WRITE;
/*!40000 ALTER TABLE "tbl_prodplan" DISABLE KEYS;*/
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(1,4,7,'500');
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
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(13,6,9,'230');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(14,17,1,'600');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(15,17,9,'60');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(16,16,9,'460');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(17,11,1,'1800');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(18,11,9,'210');
REPLACE INTO "tbl_prodplan" ("prodplan_id", "product_id", "plan_id", "prodplan_rate") VALUES
	(19,16,1,'2000');
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
) AUTO_INCREMENT=18;



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
REPLACE INTO "tbl_product" ("product_id", "item_id", "lang_id", "product_name", "product_price") VALUES
	(17,2,1,'Thozhilvartha','15');
/*!40000 ALTER TABLE "tbl_product" ENABLE KEYS;*/
UNLOCK TABLES;


#
# Table structure for table 'tbl_route'
#

CREATE TABLE /*!32312 IF NOT EXISTS*/ "tbl_route" (
  "route_id" int(50) NOT NULL auto_increment,
  "route_to" varchar(50) NOT NULL,
  "route_from" varchar(50) NOT NULL,
  PRIMARY KEY  ("route_id")
) AUTO_INCREMENT=18;



#
# Dumping data for table 'tbl_route'
#

LOCK TABLES "tbl_route" WRITE;
/*!40000 ALTER TABLE "tbl_route" DISABLE KEYS;*/
REPLACE INTO "tbl_route" ("route_id", "route_to", "route_from") VALUES
	(6,'4','1');
REPLACE INTO "tbl_route" ("route_id", "route_to", "route_from") VALUES
	(14,'13','11');
REPLACE INTO "tbl_route" ("route_id", "route_to", "route_from") VALUES
	(15,'12','16');
REPLACE INTO "tbl_route" ("route_id", "route_to", "route_from") VALUES
	(17,'17','15');
/*!40000 ALTER TABLE "tbl_route" ENABLE KEYS;*/
UNLOCK TABLES;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE;*/
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;*/
