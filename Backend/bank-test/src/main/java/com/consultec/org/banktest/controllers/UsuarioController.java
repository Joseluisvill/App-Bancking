package com.consultec.org.banktest.controllers;

import com.consultec.org.banktest.modelo.ResponseGeneric;
import com.consultec.org.banktest.modelo.UsuarioRequestDTO;
import com.consultec.org.banktest.modelo.UsuarioResponseDTO;
import com.consultec.org.banktest.services.interfaces.UsuarioServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioServiceImple usuarioServiceImple;

    @PostMapping()
    public ResponseEntity<ResponseGeneric<UsuarioResponseDTO>>post(@RequestBody UsuarioRequestDTO usuario){
        return ResponseEntity.ok(usuarioServiceImple.Create(usuario));
    }
}
