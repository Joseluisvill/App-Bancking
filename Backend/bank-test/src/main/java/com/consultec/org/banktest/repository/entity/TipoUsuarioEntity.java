package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "tipoUsuario")
public class TipoUsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @ManyToMany
    private Set<UsuarioEntity> usuario;

    public TipoUsuarioEntity(Long id, String nombre, Set<UsuarioEntity> usuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<UsuarioEntity> getUsuario() {
        return usuario;
    }

    public void setUsuario(Set<UsuarioEntity> usuario) {
        this.usuario = usuario;
    }
}
