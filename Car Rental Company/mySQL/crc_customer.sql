-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: crc
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `cID` int NOT NULL,
  `cName` varchar(45) NOT NULL,
  `cPhone` varchar(45) NOT NULL,
  `cEmail` varchar(45) NOT NULL,
  `cAddress` varchar(45) NOT NULL,
  `cDOB` date NOT NULL,
  PRIMARY KEY (`cID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Mohammad','0598162232','mohammadqashoo77@gmail.com','Ramaallah','2000-05-29'),(2,'Mera','059825632','mear@gmail.cim','Tullkarem','2000-08-06'),(3,'Razan','0592326412','razan@hotmail.com','Hebron','0200-05-05'),(15,'hlsajd','554','ksndkj','nskand','2000-10-10'),(100,'jdsij','0598','jdsjfj','jldskf','2000-02-20'),(120,'Omar Barham ','0598132654','omar@gmail.com','Nablis','2000-02-02'),(121,'Mohammad','0598162235','jsalkdl@gmail.com','Ramallha','2000-12-05'),(122,'Ahmad','0598162233','ahmad@hotmail.com','Nablus','2001-05-05'),(123,'Noor','0598456215','noor@gmail.com','Tullkarem','2002-09-20'),(132,'Mohammad','0598162232','realmadrid@gmail.com','nablus','2000-05-26'),(362,'Ahmad','0595321476','aham@gmail.com','Hebron','2000-03-13'),(889,'ibrahim','059846546','uvuyguyy@gmail.com','nablus','2000-05-20'),(6545,'mlsdaj','0598','jiksaj@sdah','hsidh','2005-10-10');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-01-15 20:51:14
