package com.consultec.org.banktest.services.mapping;

import com.consultec.org.banktest.modelo.UsuarioRequestDTO;
import com.consultec.org.banktest.modelo.UsuarioResponseDTO;
import com.consultec.org.banktest.repository.entity.EstatusEntity;
import com.consultec.org.banktest.repository.entity.UsuarioEntity;

import java.util.Date;

public class UsuarioMap {
    public static UsuarioResponseDTO toDTO(UsuarioEntity entity){
        return new UsuarioResponseDTO.UsuarioResponseBuilder()
                .setId(entity.getId())
                .setNombre(entity.getNombre())
                .setApellido(entity.getApellidos())
                .setDni(entity.getDni())
                .setCorreo(entity.getCorreo())
                .setEstatus(entity.getEstatus().getNombre())
                .setFechaIngreso(entity.getFechaIn())
                .setFechaNacimiento(entity.getFechaNacimiento())
                //.setTipoUsuario(entity.getListaTipoUsuario().toString())
                .build();
    }
    public static UsuarioEntity toModel(UsuarioRequestDTO entity){
        return new UsuarioEntity(entity.nombre(),
                entity.apellido(),entity.dni(),entity.correo(),
                entity.contrasena(),new EstatusEntity(entity.estatus()),new Date(),entity.fechaNacimiento());
    }
}
