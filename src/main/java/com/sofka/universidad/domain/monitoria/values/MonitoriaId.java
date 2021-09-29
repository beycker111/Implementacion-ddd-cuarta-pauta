package com.sofka.universidad.domain.monitoria.values;

import co.com.sofka.domain.generic.Identity;

public class MonitoriaId extends Identity {

    public MonitoriaId(String id) {
        super(id);
    }

    public MonitoriaId(){

    }

    public static MonitoriaId of(String id) {
        return new MonitoriaId(id);
    }
}
