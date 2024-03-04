package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "transferencia")
public class TransferenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private double monto;
    private Date fechaTransferencia;
    @OneToOne(mappedBy = "transferencia")
    private MovimientoEntity movimientos;
    @ManyToOne
    @JoinColumn(name = "numCuentaDest")
    private CuentaEntity numeroCuenta;

    public TransferenciaEntity(UUID id, double monto, Date fechaTransferencia, CuentaEntity numeroCuenta) {
        this.id = id;
        this.monto = monto;
        this.fechaTransferencia = fechaTransferencia;
        this.numeroCuenta = numeroCuenta;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

	public CuentaEntity getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(CuentaEntity numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}
}
