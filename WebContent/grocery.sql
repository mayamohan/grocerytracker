-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema sooperList
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `sooperList` ;

-- -----------------------------------------------------
-- Schema sooperList
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `sooperList` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `sooperList` ;

-- -----------------------------------------------------
-- Table `weeklyGrocery`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `weeklyGrocery` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `weeklyGrocery` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `storeName` VARCHAR(20) NOT NULL,
  `amount` DECIMAL(5) NOT NULL,
  `numItems` INT NOT NULL,
  `desc` VARCHAR(100) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
