package com.consultec.org.banktest.modelo;

import java.util.Date;

public record UsuarioRequestDTO(
        String nombre,
        String apellido,
        String dni,
        String correo,
        String contrasena,
        Long estatus,
        Date fechaNacimiento,
        Long tipoUsuario
) {
    public static final class UsuarioRequestBuilder{
        String nombre;
        String apellido;
        String dni;
        String correo;
        String contrasena;
        Long estatus;
        Date fechaNacimiento;
        Long tipoUsuario;

        public UsuarioRequestBuilder() {
        }

        public UsuarioRequestBuilder setContrasena(String contrasena) {
            this.contrasena = contrasena;
            return this;
        }

        public UsuarioRequestBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public UsuarioRequestBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public UsuarioRequestBuilder setDni(String dni) {
            this.dni = dni;
            return this;
        }

        public UsuarioRequestBuilder setCorreo(String correo) {
            this.correo = correo;
            return this;
        }

        public UsuarioRequestBuilder setEstatus(Long estatus) {
            this.estatus = estatus;
            return this;
        }

        public UsuarioRequestBuilder setFechaNacimiento(Date fechaNacimiento) {
            this.fechaNacimiento = fechaNacimiento;
            return this;
        }

        public UsuarioRequestBuilder setTipoUsuario(Long tipoUsuario) {
            this.tipoUsuario = tipoUsuario;
            return this;
        }
        public UsuarioRequestDTO build(){
            return new UsuarioRequestDTO(nombre,apellido,dni,correo,contrasena,estatus,fechaNacimiento,tipoUsuario);
        }
    }
}