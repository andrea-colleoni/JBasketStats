-- --------------------------------------------------------
-- Host                          :127.0.0.1
-- Versione server               :5.5.28 - MySQL Community Server (GPL)
-- S.O. server                   :Win64
-- HeidiSQL Versione             :7.0.0.4286
-- Creato                        :2013-02-24 13:21:25
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dump della struttura di tabella basketstats.team_campionship
DROP TABLE IF EXISTS `team_campionship`;
CREATE TABLE IF NOT EXISTS `team_campionship` (
  `team_id` int(11) NOT NULL,
  `championship_id` int(11) NOT NULL,
  PRIMARY KEY (`team_id`,`championship_id`),
  KEY `championship_team_campionship_fk` (`championship_id`),
  CONSTRAINT `championship_team_campionship_fk` FOREIGN KEY (`championship_id`) REFERENCES `championship` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `team_team_campionship_fk` FOREIGN KEY (`team_id`) REFERENCES `team` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- L’esportazione dei dati non era selezionata.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
