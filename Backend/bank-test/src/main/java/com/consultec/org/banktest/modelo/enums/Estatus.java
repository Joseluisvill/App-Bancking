package com.consultec.org.banktest.modelo.enums;

import com.consultec.org.banktest.repository.entity.EstatusEntity;

public enum Estatus {
    ACTIVO(1),INACTIVO(2);
    int estatusId;
    private Estatus(int estatusId){
        this.estatusId=estatusId;
    }
    public int getEstatusId(){
        return estatusId;
    }
}
