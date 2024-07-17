-- MariaDB dump 10.19  Distrib 10.4.32-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: uaspbo
-- ------------------------------------------------------
-- Server version	10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `pdam`
--

DROP TABLE IF EXISTS `pdam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pdam` (
  `kodePembayaran` varchar(15) NOT NULL,
  `Nama` varchar(45) NOT NULL,
  `JenisPelanggan` varchar(8) NOT NULL,
  `Tanggal` varchar(10) NOT NULL,
  `meterBulanIni` int(15) NOT NULL,
  `meterBulanLalu` int(15) NOT NULL,
  `biayaPerMeter` int(11) NOT NULL,
  `TotalBayar` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pdam`
--

LOCK TABLES `pdam` WRITE;
/*!40000 ALTER TABLE `pdam` DISABLE KEYS */;
INSERT INTO `pdam` VALUES ('001','tono','Gold','2024-07-17',115,100,10000,150000),('002','ucup','umum','2024-07-17',225,200,10000,250000);
/*!40000 ALTER TABLE `pdam` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Dump completed on 2024-07-16 18:43:57
