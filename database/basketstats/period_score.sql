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

-- Dump della struttura di tabella basketstats.period_score
DROP TABLE IF EXISTS `period_score`;
CREATE TABLE IF NOT EXISTS `period_score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `period_type_id` int(11) NOT NULL,
  `game_id` int(11) NOT NULL,
  `home_score` int(11) NOT NULL,
  `visitor_score` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `period_type_period_score_fk` (`period_type_id`),
  KEY `match_1_period_score_fk` (`game_id`),
  CONSTRAINT `match_1_period_score_fk` FOREIGN KEY (`game_id`) REFERENCES `game` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `period_type_period_score_fk` FOREIGN KEY (`period_type_id`) REFERENCES `period_type` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- L’esportazione dei dati non era selezionata.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
