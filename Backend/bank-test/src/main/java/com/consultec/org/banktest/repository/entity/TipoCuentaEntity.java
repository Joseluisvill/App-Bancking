package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipoCuenta")
public class TipoCuentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String tipo;
    @OneToOne(mappedBy = "tipoCuenta")
    private CuentaEntity cuenta;

    public TipoCuentaEntity() {
    }

    public TipoCuentaEntity(Long id, String tipo, CuentaEntity cuenta) {
        this.id = id;
        this.tipo = tipo;
        this.cuenta = cuenta;
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

    public CuentaEntity getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaEntity cuenta) {
        this.cuenta = cuenta;
    }
}
