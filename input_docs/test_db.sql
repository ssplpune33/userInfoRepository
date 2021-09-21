/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 10.5.7-MariaDB : Database - test_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test_db` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test_db`;

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(10) DEFAULT NULL,
  `last_name` varchar(10) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `city` varchar(10) DEFAULT NULL,
  `mobile_number` varchar(10) DEFAULT NULL,
  `created_date` date DEFAULT NULL,
  `created_time` time DEFAULT NULL,
  `updated_date` date DEFAULT NULL,
  `updated_time` time DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `user_info` */

insert  into `user_info`(`id`,`first_name`,`last_name`,`dob`,`city`,`mobile_number`,`created_date`,`created_time`,`updated_date`,`updated_time`,`status`) values 
(1,'Rajesh','Kamat','2021-09-25','Pune','9876544578','2021-09-21','02:16:59','2021-09-21','19:19:57','A'),
(2,'Manoj','Sawant','1991-01-07','Pune','9876544599','2021-09-21','02:21:18','2021-09-21','08:01:48','A'),
(3,'shubham','Nimase','2021-09-14','Pune','9876898989','2021-09-21','09:53:18',NULL,NULL,'A');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
