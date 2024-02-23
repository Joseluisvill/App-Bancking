package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "movimiento")
public class MovimientoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne(mappedBy = "movimiento")
    private CuentaEntity numeroCuenta;
    @OneToOne(mappedBy = "movimiento")
    private TipoMovimientoEntity tipoMovimiento;
    private double monto;
    @ManyToOne
    @JoinColumn(name = "idTransferencia")
    private TransferenciaEntity transferencia;

    public MovimientoEntity(Long id, CuentaEntity numeroCuenta, TipoMovimientoEntity tipoMovimiento, double monto, TransferenciaEntity transferencia) {
        this.id = id;
        this.numeroCuenta = numeroCuenta;
        this.tipoMovimiento = tipoMovimiento;
        this.monto = monto;
        this.transferencia = transferencia;
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

    public TipoMovimientoEntity getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimientoEntity tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TransferenciaEntity getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(TransferenciaEntity transferencia) {
        this.transferencia = transferencia;
    }
}
