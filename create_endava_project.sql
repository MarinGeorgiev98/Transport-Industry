CREATE SCHEMA IF NOT EXISTS `endava_project` DEFAULT CHARACTER SET utf8 ;
USE `endava_project` ;

CREATE TABLE IF NOT EXISTS `endava_project`.`addresses` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `country` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `street` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `endava_project`.`users` (
  `id` INT UNSIGNED NOT NULL AUTO_INCREMENT,
  `egn` CHAR(10) NOT NULL UNIQUE,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `email` VARCHAR(320) NOT NULL UNIQUE,
  `'status'` ENUM('active', 'inactive') NOT NULL,
  `addresses_id` INT UNSIGNED NOT NULL,
  PRIMARY KEY (`id`, `addresses_id`),
  INDEX `fk_users_addresses_idx` (`addresses_id` ASC),
  CONSTRAINT `fk_users_addresses`
    FOREIGN KEY (`addresses_id`)
    REFERENCES `endava_project`.`addresses` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;
