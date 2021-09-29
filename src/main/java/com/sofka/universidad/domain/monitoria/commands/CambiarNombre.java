package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;
import com.sofka.universidad.domain.monitoria.values.Nombre;

public class CambiarNombre extends Command {

    private final MonitoriaId monitoriaId;
    private final Nombre nombre;

    public CambiarNombre(MonitoriaId monitoriaId, Nombre nombre){
        this.monitoriaId = monitoriaId;
        this.nombre = nombre;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
