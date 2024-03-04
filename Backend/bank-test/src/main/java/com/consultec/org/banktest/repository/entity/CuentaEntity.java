package com.consultec.org.banktest.repository.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "cuenta")
public class CuentaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "idGenerator")
    @TableGenerator(name = "idGenerator",initialValue = 10000)
    private Long numeroCuenta;
    private String alias;
    private Double saldo;
    @ManyToOne
    @JoinColumn(name = "idEstatus")
    private EstatusEntity estatus;
    @ManyToOne
    @JoinColumn(name = "idTipoCuenta")
    private TipoCuentaEntity tipoCuenta;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario;
    @OneToMany(mappedBy = "numeroCuenta")
    private List <MovimientoEntity> movimiento;
    @OneToMany(mappedBy = "numeroCuenta")
    private List <TransferenciaEntity> transferencia;

    public CuentaEntity() {
    }

    public CuentaEntity(Long numeroCuenta, String alias, Double saldo, EstatusEntity estatus, TipoCuentaEntity tipoCuenta, UsuarioEntity usuario) {
        this.numeroCuenta = numeroCuenta;
        this.alias = alias;
        this.saldo = saldo;
        this.estatus = estatus;
        this.tipoCuenta = tipoCuenta;
        this.usuario = usuario;
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

    public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
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
