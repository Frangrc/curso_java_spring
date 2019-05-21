-- MySQL Script generated by MySQL Workbench
-- Tue May 21 11:55:56 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema bd_ventas
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema bd_ventas
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `bd_ventas` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish2_ci ;
USE `bd_ventas` ;

-- -----------------------------------------------------
-- Table `bd_ventas`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_ventas`.`cliente` ;

CREATE TABLE IF NOT EXISTS `bd_ventas`.`cliente` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(50) NOT NULL,
  `email` VARCHAR(250) NOT NULL,
  `edad` TINYINT NOT NULL,
  `activo` TINYINT NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_ventas`.`producto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_ventas`.`producto` ;

CREATE TABLE IF NOT EXISTS `bd_ventas`.`producto` (
  `id` INT NOT NULL,
  `nombre` VARCHAR(50) NOT NULL,
  `cantidad` INT NOT NULL,
  `precio` DECIMAL NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  UNIQUE INDEX `nombre_UNIQUE` (`nombre` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `bd_ventas`.`compra`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `bd_ventas`.`compra` ;

CREATE TABLE IF NOT EXISTS `bd_ventas`.`compra` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `cliente_id` INT NOT NULL,
  `producto_id` INT NOT NULL,
  `fecha` TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `cantidad` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_cliente_has_producto_producto1_idx` (`producto_id` ASC) VISIBLE,
  INDEX `fk_cliente_has_producto_cliente_idx` (`cliente_id` ASC) VISIBLE,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE,
  CONSTRAINT `fk_cliente_has_producto_cliente`
    FOREIGN KEY (`cliente_id`)
    REFERENCES `bd_ventas`.`cliente` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_cliente_has_producto_producto1`
    FOREIGN KEY (`producto_id`)
    REFERENCES `bd_ventas`.`producto` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `bd_ventas`.`cliente`
-- -----------------------------------------------------
START TRANSACTION;
USE `bd_ventas`;
INSERT INTO `bd_ventas`.`cliente` (`id`, `nombre`, `email`, `edad`, `activo`, `password`) VALUES (DEFAULT, 'Prueba', 'prueba@email.com', 20, 0, '1234');

COMMIT;


-- -----------------------------------------------------
-- Data for table `bd_ventas`.`producto`
-- -----------------------------------------------------
START TRANSACTION;
USE `bd_ventas`;
INSERT INTO `bd_ventas`.`producto` (`id`, `nombre`, `cantidad`, `precio`) VALUES (DEFAULT, 'Producto prueba', 1, 1);

COMMIT;


-- -----------------------------------------------------
-- Data for table `bd_ventas`.`compra`
-- -----------------------------------------------------
START TRANSACTION;
USE `bd_ventas`;
INSERT INTO `bd_ventas`.`compra` (`id`, `cliente_id`, `producto_id`, `fecha`, `cantidad`) VALUES (DEFAULT, 1, 1, DEFAULT, 1);

COMMIT;

