CREATE TABLE `vehicle`.`familycars` (
  `speed` INT NOT NULL,
  `vehicle_color` ENUM('RED',
    'ORANGE',
    'YELLOW',
    'GREEN',
    'BLUE',
    'PURPLE',
    'WHITE',
    'BLACK',
    'BROWN',
    'SILVER') NULL,
  PRIMARY KEY (`speed`));
