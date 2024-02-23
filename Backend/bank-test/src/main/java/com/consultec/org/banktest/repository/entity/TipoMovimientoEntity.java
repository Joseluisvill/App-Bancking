package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tipoMovimiento")
public class TipoMovimientoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private Date fechaCreacion;
    private double cargo;
    @OneToOne(mappedBy = "")
    private MovimientoEntity movimiento;
    public TipoMovimientoEntity(Long id, String nombre, Date fechaCreacion, double cargo) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.cargo = cargo;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }
}
