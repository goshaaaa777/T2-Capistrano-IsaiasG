-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: bdcibertec
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
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autor` (
  `id_autor` int NOT NULL AUTO_INCREMENT,
  `ape_autor` varchar(50) NOT NULL,
  `fech_nac_autor` date NOT NULL,
  `nom_autor` varchar(50) NOT NULL,
  PRIMARY KEY (`id_autor`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (1,'Jallo','1927-03-06','Manuel'),(2,'Jallo','1927-03-06','Manuel'),(3,'Jallo','1927-03-06','Manuel'),(4,'Jallo','1927-03-06','Manuel'),(5,'Jallo','1927-03-06','Manuel'),(6,'Jallo','1927-03-06','Manuel'),(7,'Jallo','1927-03-06','Manuel');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `publicacion`
--

DROP TABLE IF EXISTS `publicacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `publicacion` (
  `id_publicacion` int NOT NULL AUTO_INCREMENT,
  `fech_publicacion` datetime(6) NOT NULL,
  `resumen` varchar(250) NOT NULL,
  `titulo` varchar(250) NOT NULL,
  `id_autor` int NOT NULL,
  PRIMARY KEY (`id_publicacion`),
  KEY `FKirx65153dnpg3bspj0eiav939` (`id_autor`),
  CONSTRAINT `FKirx65153dnpg3bspj0eiav939` FOREIGN KEY (`id_autor`) REFERENCES `autor` (`id_autor`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `publicacion`
--

LOCK TABLES `publicacion` WRITE;
/*!40000 ALTER TABLE `publicacion` DISABLE KEYS */;
INSERT INTO `publicacion` VALUES (1,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1),(2,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1),(3,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1),(4,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1),(5,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1),(6,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1),(7,'1967-05-29 19:00:00.000000','Una obra maestra que narra la historia de la familia Buendía.','Cien Años de Soledad',1);
/*!40000 ALTER TABLE `publicacion` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-06-23 12:28:12
