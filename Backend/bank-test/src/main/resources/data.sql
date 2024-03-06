INSERT INTO estatus (nombre) VALUES('Activo'),('Inactivo');

INSERT INTO tipo_usuario (nombre) VALUES('Administrador'),('Cliente');

insert into usuarios(fecha_in,fecha_nacimiento,fecha_out,id_estatus,apellidos,contrasena,correo,dni,nombre)
values('2024-2-3','2024-2-3','2024-2-3',1,'Perez Alonso','123456','alonso.gmail.com','8-127-1449','Juan');

insert into usuarios(fecha_in,fecha_nacimiento,fecha_out,id_estatus,apellidos,contrasena,correo,dni,nombre)
values('2024-3-3','2024-3-3','2024-3-3',1,'Gonzales Ruiz','123456','pedroruiz.gmail.com','8-237-1449','Pedro');

insert into tipo_cuenta(tipo)values('ahorro');

insert into tipo_cuenta(tipo)values('corriente');

insert into cuenta(saldo,id_estatus,id_tipo_cuenta,id_usuario,numero_cuenta,alias)
values(500.00, 1, 1, 1, 112244,'Juan Perez Alonso');

insert into cuenta(saldo,id_estatus,id_tipo_cuenta,id_usuario,numero_cuenta,alias)
values(300.00, 1, 1, 2, 112233,'Pedro Gonzales Ruiz');