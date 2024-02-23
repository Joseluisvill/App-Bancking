package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class UsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String correo;
    private String contrasena;
    @OneToOne
    @JoinColumn(name = "idEstatus")
    private EstatusEntity estatus;
    private Date fechaIn;
    private Date fechaOut;
    private Date fechaNacimiento;
    @OneToMany(mappedBy = "usuario")
    private List<TipoUsuarioEntity> listaTipoUsuario;
    @OneToMany(mappedBy = "usuario")
    private List<CuentaEntity> listaCuentas;

    public UsuarioEntity(Long id, String nombre, String apellidos, String dni, String correo, String contrasena, EstatusEntity estatus, Date fechaIn, Date fechaOut, Date fechaNacimiento, List<TipoUsuarioEntity> listaTipoUsuario, List<CuentaEntity> listaCuentas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estatus = estatus;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
        this.fechaNacimiento = fechaNacimiento;
        this.listaTipoUsuario = listaTipoUsuario;
        this.listaCuentas = listaCuentas;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public EstatusEntity getEstatus() {
        return estatus;
    }

    public void setEstatus(EstatusEntity estatus) {
        this.estatus = estatus;
    }

    public Date getFechaIn() {
        return fechaIn;
    }

    public void setFechaIn(Date fechaIn) {
        this.fechaIn = fechaIn;
    }

    public Date getFechaOut() {
        return fechaOut;
    }

    public void setFechaOut(Date fechaOut) {
        this.fechaOut = fechaOut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public List<TipoUsuarioEntity> getListaTipoUsuario() {
        return listaTipoUsuario;
    }

    public void setListaTipoUsuario(List<TipoUsuarioEntity> listaTipoUsuario) {
        this.listaTipoUsuario = listaTipoUsuario;
    }

    public List<CuentaEntity> getListaCuentas() {
        return listaCuentas;
    }

    public void setListaCuentas(List<CuentaEntity> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
}
