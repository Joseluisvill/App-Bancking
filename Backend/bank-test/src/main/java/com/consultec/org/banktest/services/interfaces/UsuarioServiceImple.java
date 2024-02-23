package com.consultec.org.banktest.services.interfaces;

import com.consultec.org.banktest.modelo.ResponseGeneric;
import com.consultec.org.banktest.modelo.UsuarioRequestDTO;
import com.consultec.org.banktest.modelo.UsuarioResponseDTO;
import com.consultec.org.banktest.repository.IGenericService;
import com.consultec.org.banktest.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioServiceImple implements IGenericService<UsuarioResponseDTO, UsuarioRequestDTO,Long> {
    @Autowired
    private IUsuarioRepository usuarioRepository;


    @Override
    public List<UsuarioResponseDTO> findAll() {
        return null;
    }

    @Override
    public ResponseGeneric<UsuarioResponseDTO> Create(UsuarioRequestDTO entity) {
        return null;
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
