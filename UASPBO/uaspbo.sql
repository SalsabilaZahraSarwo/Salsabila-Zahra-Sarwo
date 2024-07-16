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
INSERT INTO `pdam` VALUES ('B001','Kontol','Gold','2024-07-16',115,100,10000,150000),('A2002','Memek','Silver','2024-07-15',225,200,10000,250000);
/*!40000 ALTER TABLE `pdam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taxi`
--

DROP TABLE IF EXISTS `taxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `taxi` (
  `kodetransaksi` varchar(15) NOT NULL,
  `kodepenumpang` varchar(8) NOT NULL,
  `nama` varchar(45) NOT NULL,
  `jenispenumpang` varchar(13) NOT NULL,
  `platnomor` varchar(10) NOT NULL,
  `supir` varchar(45) NOT NULL,
  `biayaAwal` int(15) NOT NULL,
  `biayaperkilo` int(15) NOT NULL,
  `jarak` int(5) NOT NULL,
  `totalbayar` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taxi`
--

LOCK TABLES `taxi` WRITE;
/*!40000 ALTER TABLE `taxi` DISABLE KEYS */;
INSERT INTO `taxi` VALUES ('20240712','A1001','Kontol','Langganan','BA696TOT','Supirman',120000,80000,5,360000),('20240713','B002','memek','Non-Langganan','BH6969TIT','Titit',125000,85000,8,805000);
/*!40000 ALTER TABLE `taxi` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-16 18:43:57
