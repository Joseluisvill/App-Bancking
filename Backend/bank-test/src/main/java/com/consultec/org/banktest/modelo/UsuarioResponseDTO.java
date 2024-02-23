package com.consultec.org.banktest.modelo;

import java.util.Date;

public record UsuarioResponseDTO(
        Long id,
        String nombre,
        String apellido,
        String dni,
        String correo,
        String estatus,
        Date fechaIngreso,
        Date fechaNacimiento,
        String tipoUsuario
) {
    public static final class UsuarioResponseBuilder{
        Long id;
        String nombre;
        String apellido;
        String dni;
        String correo;
        String estatus;
        Date fechaIngreso;
        Date fechaNacimiento;
        String tipoUsuario;

        public UsuarioResponseBuilder() {
        }

        public UsuarioResponseBuilder setId(Long id) {
            this.id = id;
            return this;
        }

        public UsuarioResponseBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioResponseBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public UsuarioResponseBuilder setDni(String dni) {
            this.dni = dni;
            return this;
        }

        public UsuarioResponseBuilder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public UsuarioResponseBuilder setEstatus(String estatus) {
            this.estatus = estatus;
            return this;
        }

        public UsuarioResponseBuilder setFechaIngreso(Date fechaIngreso) {
            this.fechaIngreso = fechaIngreso;
            return this;
        }

        public UsuarioResponseBuilder setFechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public UsuarioResponseBuilder setTipoUsuario(String tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
            return this;
        }
        public UsuarioResponseDTO build(){
            return new UsuarioResponseDTO(id,nombre,apellido,dni,correo,estatus,fechaIngreso,fechaNacimiento,tipoUsuario);
        }
    }
}
