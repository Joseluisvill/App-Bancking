package com.consultec.org.banktest.repository.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "transferencia")
public class TransferenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private Date fechaTransferencia;
    @OneToMany(mappedBy = "transferencia")
    private List<MovimientoEntity> movimientos;

    public TransferenciaEntity(UUID id, Date fechaTransferencia) {
        this.id = id;
        this.fechaTransferencia = fechaTransferencia;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

	public Date getFechaTransferencia() {
        return fechaTransferencia;
    }

    public void setFechaTransferencia(Date fechaTransferencia) {
        this.fechaTransferencia = fechaTransferencia;
    }

}
