package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.ResponseGeneric;
import com.consultec.org.banktest.modelo.UsuarioRequestDTO;
import com.consultec.org.banktest.modelo.UsuarioResponseDTO;
import com.consultec.org.banktest.repository.IGenericService;
import com.consultec.org.banktest.repository.IUsuarioRepository;
import com.consultec.org.banktest.repository.entity.UsuarioEntity;
import com.consultec.org.banktest.services.mapping.UsuarioMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UsuarioServiceImple implements IGenericService<UsuarioResponseDTO, UsuarioRequestDTO,Long> {
    @Autowired
    private IUsuarioRepository usuarioRepository;


    @Override
    public List<UsuarioResponseDTO> findAll() {
        List<UsuarioResponseDTO> usuariosDTOS=new ArrayList<>();
        usuarioRepository.findAll().forEach(x-> usuariosDTOS.add(UsuarioMap.toDTO(x)));
        return usuariosDTOS;
    }

    @Override
    public ResponseGeneric<UsuarioResponseDTO> Create(UsuarioRequestDTO entity) {
        UsuarioEntity usuario=UsuarioMap.toModel(entity);
        usuarioRepository.save(usuario);
        System.out.println(usuario.getEstatus().getNombre()+"---"+usuario.getEstatus().getId());
        return new ResponseGeneric<UsuarioResponseDTO>(false,
                "Dato insertado satisfactoriamente",
                UsuarioMap.toDTO(usuario));
    }

    @Override
    public ResponseGeneric<UsuarioResponseDTO> Update(UsuarioRequestDTO entity) {
        return null;
    }

    @Override
    public ResponseGeneric<UsuarioResponseDTO> Delete(Long aLong) {
        return null;
    }
}
