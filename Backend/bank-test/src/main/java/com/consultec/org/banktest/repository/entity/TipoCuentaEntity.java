package com.consultec.org.banktest.repository.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoCuenta")
public class TipoCuentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    @OneToMany(mappedBy = "tipoCuenta")
    private List<CuentaEntity> cuenta;

    public TipoCuentaEntity() {
    }

    public TipoCuentaEntity(Long id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
