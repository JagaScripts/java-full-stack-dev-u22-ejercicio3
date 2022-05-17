CREATE DATABASE IF NOT EXISTS `ud22_ejercicios_db_clientes`;
USE `ud22_ejercicios_db_clientes`;

DROP TABLE IF EXISTS cientificos;
CREATE TABLE cientificos (
dni VARCHAR(8),
nombre_completo NVARCHAR(255) NOT NULL,
PRIMARY KEY (dni)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS proyectos;
CREATE TABLE proyectos (
id CHAR(4),
nombre NVARCHAR(255) NOT NULL,
horas INT NOT NULL,
PRIMARY KEY (id)
)ENGINE=InnoDB;

DROP TABLE IF EXISTS asignado_a;
CREATE TABLE asignado_a (
cientifico VARCHAR(8),
proyecto CHAR(4),
precio INT DEFAULT NULL,
PRIMARY KEY (cientifico , proyecto),
FOREIGN KEY (cientifico) REFERENCES cientificos (DNI)
ON DELETE RESTRICT ON UPDATE CASCADE,
FOREIGN KEY (proyecto) REFERENCES proyectos (id)
ON DELETE RESTRICT ON UPDATE CASCADE
)ENGINE=InnoDB;

INSERT INTO cientificos (DNI, nombre_completo) VALUES 
('12345684', 'Jose González Ruiz'),
('12345685', 'Daniel Fernandez Lujan'),
('12345686', 'Joan Hurtado Martín'),
('12345687', 'Miguel Alcántara Garrido'),
('12345688', 'Gerard Martinez Soja'),
('12345689', 'Marc Marquez Sevilla'),
('12345610', 'Veronika Rexbo Tomico'),
('12345611', 'Constant Tomico Rexbo'),
('12345612', 'Octavi Herraiz Llull'),
('12345613', 'Aida Queralt Lozano');

INSERT INTO proyectos (id, nombre, horas) VALUES 
('0001' , 'EL BILLETE QUE ARDE… ¡Y NO SE QUEMA!', 10),
('0002' , 'CAMINAR SOBRE HUEVOS… ¡SIN ROMPERLOS!', 50),
('0003' , 'VIENDO BAILAR A LAS ONDAS DE SONIDO', 60),
('0004' , 'HAZ GEODAS CON HUEVOS', 30),
('0005' , 'CONVERTIR UNA PASTILLA DE JABÓN DE MARFIL EN UNA PALOMITA MONSTRUOSA', 80),
('0006' , '¡LAS PLANTAS CAMBIAN DE COLOR!', 50),
('0007' , 'HACIENDO ENGORDAR A LOS OSITOS DE GOMA (Y OTRAS COSAS PEORES…)', 15),
('0008' , 'ROCK CANDY CASERO… ¡Y CON UN PALO!', 20),
('0009' , 'UNA PLANTA QUE CRECE EN UN CD', 12),
('0010' , 'AGUJEREAR LA BOLSA SIN QUE SE SALGA EL AGUA', 45);

INSERT INTO asignado_a (cientifico, proyecto, precio) VALUES
('12345684','0010',20),
('12345685','0001',100),
('12345686','0002',24),
('12345687','0003',30),
('12345688','0004',100),
('12345689','0005',20),
('12345610','0006',24),
('12345611','0007',22),
('12345612','0008',68),
('12345613','0009',50);