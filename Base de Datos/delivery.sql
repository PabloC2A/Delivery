-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema delivery
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema delivery
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `delivery` ;
USE `delivery` ;

-- -----------------------------------------------------
-- Table `delivery`.`persona`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`persona` (
  `cedula` VARCHAR(10) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `apellidos` VARCHAR(50) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `nombres` VARCHAR(50) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `mail` VARCHAR(50) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  PRIMARY KEY (`cedula`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`empleado` (
  `cedula` VARCHAR(10) NOT NULL,
  `ciudad` VARCHAR(50) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  INDEX `fk_empleado_persona1_idx` (`cedula` ASC) VISIBLE,
  PRIMARY KEY (`cedula`),
  CONSTRAINT `fk_empleado_persona1`
    FOREIGN KEY (`cedula`)
    REFERENCES `delivery`.`persona` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`bodeguero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`bodeguero` (
  `idBod` INT NOT NULL AUTO_INCREMENT,
  `local` VARCHAR(50) NOT NULL,
  `cedula` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idBod`),
  INDEX `fk_bodeguero_empleado1_idx` (`cedula` ASC) VISIBLE,
  CONSTRAINT `fk_bodeguero_empleado1`
    FOREIGN KEY (`cedula`)
    REFERENCES `delivery`.`empleado` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`cliente` (
  `cedula` VARCHAR(10) NOT NULL,
  `celular` VARCHAR(10) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  PRIMARY KEY (`cedula`),
  INDEX `fk_cliente_persona1_idx` (`cedula` ASC) VISIBLE,
  CONSTRAINT `fk_cliente_persona1`
    FOREIGN KEY (`cedula`)
    REFERENCES `delivery`.`persona` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`direccion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`direccion` (
  `codigo` VARCHAR(10) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `calle1` VARCHAR(20) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `calle2` VARCHAR(20) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `referencia` VARCHAR(30) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `actual` INT NOT NULL,
  `cliente_idCli` INT NOT NULL,
  `cedula` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_direccion_cliente1_idx` (`cedula` ASC) VISIBLE,
  CONSTRAINT `fk_direccion_cliente1`
    FOREIGN KEY (`cedula`)
    REFERENCES `delivery`.`cliente` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`paquete`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`paquete` (
  `idPaquete` INT NOT NULL,
  `codigoPaq` VARCHAR(10) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `descripcion` VARCHAR(20) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `peso` INT NOT NULL,
  `alto` INT NOT NULL,
  PRIMARY KEY (`idPaquete`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`entrega`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`entrega` (
  `codigoEntrega` VARCHAR(10) NOT NULL,
  `fecha` DATE NOT NULL,
  `observacion` VARCHAR(30) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `idPaquete` INT NOT NULL,
  `clienteCedula` VARCHAR(10) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `empleadoCedula` VARCHAR(10) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  PRIMARY KEY (`idPaquete`, `codigoEntrega`),
  INDEX `fk_entrega_paquete1_idx` (`idPaquete` ASC) VISIBLE,
  INDEX `fk_entrega_cliente1_idx` (`clienteCedula` ASC) VISIBLE,
  INDEX `fk_entrega_empleado1_idx` (`empleadoCedula` ASC) VISIBLE,
  CONSTRAINT `fk_entrega_paquete1`
    FOREIGN KEY (`idPaquete`)
    REFERENCES `delivery`.`paquete` (`idPaquete`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrega_cliente1`
    FOREIGN KEY (`clienteCedula`)
    REFERENCES `delivery`.`cliente` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_entrega_empleado1`
    FOREIGN KEY (`empleadoCedula`)
    REFERENCES `delivery`.`empleado` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`estado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`estado` (
  `idEstado` INT NOT NULL AUTO_INCREMENT,
  `tipo` INT NOT NULL,
  `estado` VARCHAR(20) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `fecha` VARCHAR(20) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `observacion` VARCHAR(30) COLLATE 'utf8mb3_spanish_ci' NOT NULL,
  `paquete_idPaquete` INT NOT NULL,
  PRIMARY KEY (`idEstado`),
  INDEX `fk_estado_paquete1_idx` (`paquete_idPaquete` ASC) VISIBLE,
  CONSTRAINT `fk_estado_paquete1`
    FOREIGN KEY (`paquete_idPaquete`)
    REFERENCES `delivery`.`paquete` (`idPaquete`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `delivery`.`repartidor`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `delivery`.`repartidor` (
  `idRep` INT NOT NULL AUTO_INCREMENT,
  `zona` INT NOT NULL,
  `cedula` VARCHAR(10) NOT NULL,
  PRIMARY KEY (`idRep`),
  INDEX `fk_repartidor_empleado1_idx` (`cedula` ASC) VISIBLE,
  CONSTRAINT `fk_repartidor_empleado1`
    FOREIGN KEY (`cedula`)
    REFERENCES `delivery`.`empleado` (`cedula`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
