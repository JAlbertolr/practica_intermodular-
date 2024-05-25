-- Borrado de la bbdd existente
DROP DATABASE IF EXISTS practica_intermodular;

-- Creación de la nueva bbdd
CREATE DATABASE practica_intermodular;
USE practica_intermodular;

-- Creación de tablas
CREATE TABLE Estrella (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    tipo VARCHAR(50),
    radio_km DOUBLE,
    temperatura_superficial DOUBLE,
    distancia_tierra DOUBLE,
    composicion TEXT,
    fecha_creacion date
);

CREATE TABLE Planeta (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    radio_km DOUBLE,
    distancia_sol DOUBLE,
    periodo_orbital DOUBLE,
    temperatura_media DOUBLE,
    tipo VARCHAR(50),
    numero_satelites INT DEFAULT 0,
    Estrella_id INT,
    fecha_creacion date,
    FOREIGN KEY (Estrella_id) REFERENCES Estrella(id),
    check(tipo in("Rocoso", "Gaseoso"))
);

CREATE TABLE Satelite (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NOT NULL,
    radio_km DOUBLE,
    distancia_planeta DOUBLE,
    periodo_orbital DOUBLE,
    temperatura_media DOUBLE,
    tipo VARCHAR(50),
    planeta_id INT,
    fecha_creacion date,
    FOREIGN KEY (planeta_id) REFERENCES Planeta(id)
);

-- PL/SQL
DELIMITER //
CREATE TRIGGER actualizar_numero_satelites
AFTER INSERT ON Satelite
FOR EACH ROW
BEGIN
    UPDATE Planeta
    SET numero_satelites = numero_satelites + 1
    WHERE id = NEW.planeta_id;
END;
//
DELIMITER ;

DELIMITER //
CREATE TRIGGER fecha_creacion_sol
BEFORE INSERT ON Estrella
FOR EACH ROW
BEGIN
    SET NEW.fecha_creacion = SYSDATE();
END;
//
DELIMITER ;

DELIMITER //
CREATE TRIGGER fecha_creacion_planeta
BEFORE INSERT ON Planeta
FOR EACH ROW
BEGIN
    SET NEW.fecha_creacion = SYSDATE();
END;
//
DELIMITER ;

DELIMITER //
CREATE TRIGGER fecha_creacion_satelite
BEFORE INSERT ON Satelite
FOR EACH ROW
BEGIN
    SET NEW.fecha_creacion = SYSDATE();
END;
//
DELIMITER ;

-- Insertar datos
INSERT INTO Estrella (nombre, tipo, radio_km, temperatura_superficial, distancia_tierra, composicion) VALUES
('Sol', 'G2V', 696340, 5500, 149.6, '74% Hidrógeno, 24% Helio, 2% Otros');

INSERT INTO Planeta (nombre, radio_km, distancia_sol, periodo_orbital, temperatura_media, tipo, Estrella_id) VALUES
('Mercurio', 2439.7, 57.9, 88, 167, 'Rocoso', 1),
('Venus', 6051.8, 108.2, 225, 464, 'Rocoso', 1),
('Tierra', 6371, 149.6, 365.25, 15, 'Rocoso', 1),
('Marte', 3389.5, 227.9, 687, -65, 'Rocoso', 1),
('Júpiter', 69911, 778.5, 4333, -110, 'Gaseoso', 1),
('Saturno', 58232, 1429.4, 10759, -140, 'Gaseoso', 1),
('Urano', 25362, 2870.9, 30687, -195, 'Gaseoso', 1),
('Neptuno', 24622, 4498.3, 60190, -200, 'Gaseoso', 1);

INSERT INTO Satelite (nombre, radio_km, distancia_planeta, periodo_orbital, temperatura_media, tipo, planeta_id) VALUES
('Luna', 1737.4, 384400, 27.3, -53, 'Sólido/Rocoso', 3),
('Fobos', 11.1, 9378, 0.3, -40, 'Sólido/Rocoso', 4),
('Deimos', 6.2, 23460, 1.3, -40, 'Sólido/Rocoso', 4),
('Ío', 1821.6, 421700, 1.8, -143, 'Sólido/Rocoso', 5),
('Europa', 1560.8, 670900, 3.5, -160, 'Sólido/Hielo', 5),
('Ganimedes', 2634.1, 1070400, 7.2, -163, 'Sólido/Hielo', 5),
('Calisto', 2410.3, 1882700, 16.7, -139, 'Sólido/Hielo', 5),
('Titán', 2575.5, 1222000, 15.9, -179, 'Sólido/Hielo', 6),
('Encélado', 252.1, 238000, 1.4, -201, 'Sólido/Hielo', 6),
('Titania', 788.4, 435900, 8.7, -203, 'Sólido/Hielo', 7),
('Oberón', 761.4, 583500, 13.5, -203, 'Sólido/Hielo', 7);

select * from planeta;
select * from satelite;