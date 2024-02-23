package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estatus")
public class EstatusEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @OneToOne(mappedBy = "estatus")
    private UsuarioEntity usuario;
    @OneToOne(mappedBy = "estatus")
    private CuentaEntity cuenta;

    public EstatusEntity(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
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
}
