package com.consultec.org.banktest.modelo;

import java.util.Date;

public record UsuarioRequestDTO(
        String apellido,
        String dni,
        String correo,
        Long estatus,
        Date fechaNacimiento,
        Long tipoUsuario
) {
}