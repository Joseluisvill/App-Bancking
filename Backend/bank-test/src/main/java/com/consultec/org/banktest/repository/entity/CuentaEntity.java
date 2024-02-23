package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cuenta")
public class CuentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "idGenerator")
    @TableGenerator(name = "idGenerator",initialValue = 10000)
    private Long numeroCuenta;
    private String alias;
    @OneToOne
    @JoinColumn(name = "idEstatus")
    private EstatusEntity estatus;
    @OneToOne
    @JoinColumn(name = "idTipoCuenta")
    private TipoCuentaEntity tipoCuenta;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario;
    @OneToOne
    @JoinColumn(name = "idMovimento")
    private MovimientoEntity movimiento;

    public CuentaEntity() {
    }

    public CuentaEntity(Long numeroCuenta, String alias, EstatusEntity estatus, TipoCuentaEntity tipoCuenta, UsuarioEntity usuario, MovimientoEntity movimiento) {
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.estatus = estatus;
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
        this.movimiento = movimiento;
    }

    public MovimientoEntity getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(MovimientoEntity movimiento) {
        this.movimiento = movimiento;
    }

    public Long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public EstatusEntity getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusEntity estatus) {
        this.estatus = estatus;
    }

    public TipoCuentaEntity getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuentaEntity tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public UsuarioEntity getUsuario() {
        return usuario;
    }

    public void setUsuario(UsuarioEntity usuario) {
        this.usuario = usuario;
    }
}
