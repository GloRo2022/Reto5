CREATE SCHEMA reto5;
USE reto5;

CREATE TABLE bicicletas (
  idbicicletas INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   fabricante  VARCHAR(45) NOT NULL,
   precio_unitario  INT NOT NULL,
   anio_contruccion  YEAR NOT NULL
   );

CREATE TABLE clientes  (
   id_username  VARCHAR(45) NOT NULL,
   nombres  VARCHAR(45) NOT NULL,
   apellidos  VARCHAR(45) NOT NULL,
   email  VARCHAR(45) NOT NULL,
   celular  VARCHAR(45) NOT NULL,
   contrasena  INT(8) NOT NULL,
   fecha_nacimiento  DATE NOT NULL,
  PRIMARY KEY ( id_username )
 );
  
create table proveedor (
    prov_id  int AUTO_INCREMENT primary key,

    prov_nombre  char(20),

    prov_direccion char(45),

    prov_telefono  char(11)

);

CREATE TABLE motocicletas  (
   idmotocicletas  INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   fabricante  VARCHAR(45) NOT NULL,
   precio_unitario  INT NOT NULL,
   autonomia_bateria  INT NOT NULL,
   proveedor_idproveedor  INT NOT NULL,
   FOREIGN  KEY(proveedor_idproveedor)REFERENCES  proveedor(prov_id)
);

CREATE TABLE intencion_de_compra  (
   idintencion_de_compra  INT NOT NULL AUTO_INCREMENT,
   clientes_id_username  VARCHAR(45) NOT NULL,
   bicicletas_id  INT NULL,
   motocicletas_idmotocicletas  INT NULL,
   fecha_hora  TIMESTAMP NOT NULL,
  PRIMARY KEY ( idintencion_de_compra ),
    FOREIGN KEY ( clientes_id_username )
    REFERENCES  clientes  ( id_username ),
    FOREIGN KEY ( bicicletas_id )
    REFERENCES  bicicletas  ( idbicicletas ),
    FOREIGN KEY ( motocicletas_idmotocicletas )
    REFERENCES   motocicletas  ( idmotocicletas )
);

INSERT INTO bicicletas (idbicicletas, fabricante, precio_unitario, anio_contruccion) VALUES ('1', 'Cannondale', '1200000', 2020);
INSERT INTO bicicletas (idbicicletas, fabricante, precio_unitario, anio_contruccion) VALUES ('2', 'Trek', '1450000', 2019);
INSERT INTO bicicletas (idbicicletas, fabricante, precio_unitario, anio_contruccion) VALUES ('3', 'Yeti', '2000000', 2020);
INSERT INTO bicicletas (idbicicletas, fabricante, precio_unitario, anio_contruccion) VALUES ('4', 'Fuji', '950000', 2021);
INSERT INTO bicicletas (idbicicletas, fabricante, precio_unitario, anio_contruccion) VALUES ('5', 'Bmc', '1950000', 2018);

INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('lucky', 'Pedro', 'Perez', 'pedro@gmail.com', '322-325-6932', '12345678', '2000-12-13');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('malopez', 'Maria', 'Lopez', 'maria@gmail.com', '322-325-6968', '23456789', '2003-11-30');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('diva', 'Ana', 'Diaz', 'ana@gmail.com', '322-325-6542', '34567891', '2001-09-20');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('dreamer', 'Luis', 'Rojas', 'luis@gmail.com', '322-325-9852', '45678912', '2006-03-26');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('ninja', 'Andres', 'Cruz', 'andre@gmail.com', '322-325-9873', '56789123', '1998-10-06');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('neon', 'Nelson', 'Ruiz', 'nelson@gmail.com', '322-325-3351', '67891234', '1999-02-14');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('rose', 'Claudia', 'Mendez', 'claudia@gmail.com', '322-325-6825', '78912345', '2002-03-09');
INSERT INTO clientes (id_username, nombres, apellidos, email, celular, contrasena, fecha_nacimiento) VALUES ('green', 'Jorge', 'Rodriguez', 'jorge@gmail.com', '322-325-5687', '89123456', '2005-06-30');


insert into proveedor values (101, "Auteco","calle 7 No. 45-17", "05713224459");

insert into proveedor values (102, "Hitachi", "calle 19 No. 108-26", "05714223344");

insert into proveedor values (103, "Bosch", "carrera 68 No. 26-45", "05715678798");

insert into proveedor values (104, "Teco", "calle 77 No. 68-33", "05712213243");

insert into proveedor values (105, "General Electric", "calle 29 No. 26-12", "05717239919");


INSERT INTO motocicletas (idmotocicletas, fabricante, precio_unitario, autonomia_bateria, proveedor_idproveedor) VALUES ('1', 'Starker', '4200000', '18', '101');
INSERT INTO motocicletas (idmotocicletas, fabricante, precio_unitario, autonomia_bateria, proveedor_idproveedor) VALUES ('2', 'Lucky Lion', '5600000', '14', '102');
INSERT INTO motocicletas (idmotocicletas, fabricante, precio_unitario, autonomia_bateria, proveedor_idproveedor) VALUES ('3', 'Be Electric', '4600000', '26', '101');
INSERT INTO motocicletas (idmotocicletas, fabricante, precio_unitario, autonomia_bateria, proveedor_idproveedor) VALUES ('4', 'Aima', '8000000', '36', '103');
INSERT INTO motocicletas (idmotocicletas, fabricante, precio_unitario, autonomia_bateria, proveedor_idproveedor) VALUES ('5', 'Mec de Colombia', '5900000', '20', '104');
INSERT INTO motocicletas (idmotocicletas, fabricante, precio_unitario, autonomia_bateria, proveedor_idproveedor) VALUES ('6', 'Atom Electric', '4500000', '12', '105');


INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('1', 'lucky', '1', '2017-10-25 20:00:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('2', 'lucky', '2', '2019-03-15 18:30:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('3', 'lucky', '1', '2019-05-20 20:30:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('4', 'malopez', '1', '2018-05-20 20:30:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('5', 'malopez', '1', '2020-01-20 20:30:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('6', 'diva', '3', '2019-05-20 20:30:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('7', 'diva', '4', '2018-06-22 21:30:00');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('8', 'diva', '2', '2020-03-17 15:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('9', 'dreamer', '2', '2020-03-17 15:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('10', 'dreamer', '3', '2020-04-10 18:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('11', 'ninja', '4', '2020-02-17 20:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('12', 'ninja', '1', '2020-02-20 16:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('13', 'ninja', '5', '2020-03-27 18:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, motocicletas_idmotocicletas, fecha_hora) VALUES ('14', 'rose', '6', '2020-03-20 21:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('15', 'green', '3', '2020-01-10 17:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('16', 'green', '2', '2020-02-15 20:30:20');
INSERT INTO intencion_de_compra (idintencion_de_compra, clientes_id_username, bicicletas_id, fecha_hora) VALUES ('17', 'green', '5', '2020-03-17 18:30:20');

