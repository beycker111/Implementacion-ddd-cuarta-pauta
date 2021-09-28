package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.MonitoriaId;
import com.sofka.universidad.Monitoria.values.Nombre;

public class CambiarNombre implements Command {

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
