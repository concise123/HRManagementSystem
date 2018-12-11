-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: gms
-- ------------------------------------------------------
-- Server version	5.7.16-log

-- -- -- /*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
-- -- /*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
-- -- /*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
-- -- /*!40101 SET NAMES utf8 */;
-- -- /*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
-- -- /*!40103 SET TIME_ZONE='+00:00' */;
-- -- /*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
-- -- /*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
-- -- /*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
-- -- /*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table dailywork
--

DROP TABLE dailywork;
-- -- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- -- /*!40101 SET character_set_client = utf8 */;
CREATE TABLE dailywork (
  sr number(11) NOT NULL,
  attndnc varchar2(45) DEFAULT NULL,
  work varchar2(45) DEFAULT NULL,
  assignTime varchar2(45) DEFAULT NULL,
  assignStatus varchar2(45) DEFAULT NULL
);
-- -- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table dailywork
--

--LOCK TABLES dailywork WRITE;
-- -- -- /*!40000 ALTER TABLE dailywork DISABLE KEYS */;
INSERT INTO dailywork VALUES (2,'zain','xsankl','Tue Jan 17 10:17:45 PST 2017','Not Available');
INSERT INTO dailywork VALUES (2,'presenT','ghr n jana','Wed Jan 18 22:34:36 PST 2017','Not Available');
-- -- -- /*!40000 ALTER TABLE dailywork ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Table structure for table login
--

DROP TABLE login;
-- -- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- -- /*!40101 SET character_set_client = utf8 */;
CREATE TABLE login (
  srno number(11) NOT NULL,
  id varchar2(45) DEFAULT NULL,
  pass varchar2(45) DEFAULT NULL,
  question varchar2(45) DEFAULT NULL,
  answer varchar2(45) DEFAULT NULL,
  name varchar2(45) DEFAULT NULL,
  status varchar2(45) DEFAULT NULL,
  date_time varchar2(45) DEFAULT NULL,
  PRIMARY KEY (srno)
);

select * from tab;
select * from login;
-- -- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table login
--

-- LOCK TABLES login WRITE;
-- -- /*!40000 ALTER TABLE login DISABLE KEYS */;
INSERT INTO login VALUES (1,'manager','1234','What is your dream?','Being a successfull Programmer','manager','Admin','Wed Jan 18 21:08:40 PST 2017');
-- -- /*!40000 ALTER TABLE login ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Table structure for table personalinfo
--

-- DROP TABLE IF EXISTS personalinfo;
-- -- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!40101 SET character_set_client = utf8 */;
CREATE TABLE personalinfo (
  id number(11) NOT NULL,
  name varchar2(45) DEFAULT NULL,
  phone varchar2(45) DEFAULT NULL,
  cnic varchar2(45) DEFAULT NULL,
  emrgnc_name varchar2(45) DEFAULT NULL,
  emrgnc_phone varchar2(45) DEFAULT NULL,
  address varchar2(45) DEFAULT NULL,
  dob varchar2(45) DEFAULT NULL,
  email varchar2(45) DEFAULT NULL,
  emp_pic varchar2(100),
  post varchar2(45) DEFAULT NULL,
  salary number(10,3) DEFAULT NULL,
  timing varchar2(45) DEFAULT NULL,
  PRIMARY KEY (id)
);
-- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table personalinfo
--

-- LOCK TABLES personalinfo WRITE;
-- /*!40000 ALTER TABLE personalinfo DISABLE KEYS */;
INSERT INTO personalinfo VALUES (2,'hamza ','232323','21212','zain','2232','lahore','6 / Jul / Year','hamxayaxin@gmail.com',null ,'Manager',100000,'Day / Month / Year');
-- /*!40000 ALTER TABLE personalinfo ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Table structure for table salaryslip
--

-- DROP TABLE IF EXISTS salaryslip;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!40101 SET character_set_client = utf8 */;
CREATE TABLE salaryslip (
  sr number(11) NOT NULL,
  name varchar2(45) DEFAULT NULL,
  post varchar2(45) DEFAULT NULL,
  month varchar2(45) DEFAULT NULL,
  days number(11) DEFAULT NULL,
  advance number(10,3) DEFAULT NULL,
  deduction number(10,3) DEFAULT NULL,
  net_salary number(10,3) DEFAULT NULL,
  dt varchar2(45) DEFAULT NULL,
  gross_salary number(10,3) DEFAULT NULL
);
-- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table salaryslip
--

-- LOCK TABLES salaryslip WRITE;
-- /*!40000 ALTER TABLE salaryslip DISABLE KEYS */;
INSERT INTO salaryslip VALUES (2,'hamza ','designer','Jan',1,2,2,21222,'Tue Jan 17 11:28:15 PST 2017',21218);
INSERT INTO salaryslip VALUES (2,'hamza ','designer','Jan',8,2,2,21222,'Tue Jan 17 11:29:08 PST 2017',21218);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',4,21,32,100000,'Tue Jan 17 11:30:16 PST 2017',99947);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jun',8,10,10,100000,'Tue Jan 17 11:32:16 PST 2017',99980);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:33:52 PST 2017',99994);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:13 PST 2017',99994);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:38 PST 2017',99994);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:40 PST 2017',99994);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:43 PST 2017',99994);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:46 PST 2017',99994);
INSERT INTO salaryslip VALUES (3,'zain','Manager','Jan',1,3,3,100000,'Tue Jan 17 11:34:52 PST 2017',99994);
INSERT INTO salaryslip VALUES (2,'hamza ','designer','Jan',1,100,105,21222,'Wed Jan 18 22:35:22 PST 2017',21017);
INSERT INTO salaryslip VALUES (2,'hamza ','designer','Jan',30,100,105,21222,'Wed Jan 18 22:35:58 PST 2017',21017);
INSERT INTO salaryslip VALUES (2,'hamza ','designer','Jan',1,1,1,21222,'Wed Jan 18 23:11:43 PST 2017',21220);
-- /*!40000 ALTER TABLE salaryslip ENABLE KEYS */;
-- UNLOCK TABLES;

--
-- Table structure for table uploadwork
--

-- DROP TABLE IF EXISTS uploadwork;
-- /*!40101 SET @saved_cs_client     = @@character_set_client */;
-- /*!40101 SET character_set_client = utf8 */;
CREATE TABLE uploadwork (
  id number(11) NOT NULL,
  description varchar2(45) DEFAULT NULL,
  upload_date varchar2(45) DEFAULT NULL,
  developer_name varchar2(45) DEFAULT NULL,
  designer_name varchar2(45) DEFAULT NULL,
  game_link varchar2(45) DEFAULT NULL,
  PRIMARY KEY (id)
);
-- /*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table uploadwork
--

-- LOCK TABLES uploadwork WRITE;
-- /*!40000 ALTER TABLE uploadwork DISABLE KEYS */;
-- /*!40000 ALTER TABLE uploadwork ENABLE KEYS */;
-- UNLOCK TABLES;
-- /*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

-- /*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
-- /*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
-- /*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
-- /*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
-- /*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
-- /*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
-- /*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-19 10:14:13
