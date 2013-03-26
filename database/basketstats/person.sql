-- --------------------------------------------------------
-- Host                          :127.0.0.1
-- Versione server               :5.5.28 - MySQL Community Server (GPL)
-- S.O. server                   :Win64
-- HeidiSQL Versione             :7.0.0.4286
-- Creato                        :2013-02-24 13:21:24
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dump della struttura di tabella basketstats.person
DROP TABLE IF EXISTS `person`;
CREATE TABLE IF NOT EXISTS `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `tenant_id` int(11) NOT NULL,
  `name` varchar(30) NOT NULL,
  `surname` varchar(30) NOT NULL,
  `fullname` varchar(30) NOT NULL,
  `nick` varchar(30) DEFAULT NULL,
  `bio` text,
  `email` varchar(100) NOT NULL,
  `phone_number` varchar(20) DEFAULT NULL,
  `document_id` varchar(30) DEFAULT NULL,
  `document_type_id` int(11) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `birth_place` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `city` varchar(50) DEFAULT NULL,
  `zipcode` varchar(10) DEFAULT NULL,
  `country` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `document_type_person_fk` (`document_type_id`),
  KEY `tenant_person_fk` (`tenant_id`),
  CONSTRAINT `document_type_person_fk` FOREIGN KEY (`document_type_id`) REFERENCES `document_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `tenant_person_fk` FOREIGN KEY (`tenant_id`) REFERENCES `tenant` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- L’esportazione dei dati non era selezionata.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
