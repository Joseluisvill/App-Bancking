package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "tipoMovimiento")
public class TipoMovimientoEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "tipoMovimiento")
    private List<MovimientoEntity> movimientos;
    private String nombre;
    private Date fechaCreacion;
    private double cargo;
   
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

	public List<MovimientoEntity> getMovimientos() {
		return movimientos;
	}

	public void setMovimientos(List<MovimientoEntity> movimientos) {
		this.movimientos = movimientos;
	}
    
}
