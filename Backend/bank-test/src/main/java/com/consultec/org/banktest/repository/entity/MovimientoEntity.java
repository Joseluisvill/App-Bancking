package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movimiento")
public class MovimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "numeroCuenta")
    private CuentaEntity numeroCuenta;
    @OneToOne
    @JoinColumn(name = "idTransferencia")
    private TransferenciaEntity transferencia;
    @ManyToOne
    @JoinColumn(name = "idTipoMov")
    private TipoMovimientoEntity tipoMovimiento;

    public MovimientoEntity(Long id, CuentaEntity numeroCuenta, TipoMovimientoEntity tipoMovimiento, TransferenciaEntity transferencia) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.tipoMovimiento = tipoMovimiento;
        this.transferencia = transferencia;
    }

    public TipoMovimientoEntity getTipoMovimiento() {
		return tipoMovimiento;
	}

	public void setTipoMovimiento(TipoMovimientoEntity tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CuentaEntity getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(CuentaEntity numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public TransferenciaEntity getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(TransferenciaEntity transferencia) {
        this.transferencia = transferencia;
    }
}
