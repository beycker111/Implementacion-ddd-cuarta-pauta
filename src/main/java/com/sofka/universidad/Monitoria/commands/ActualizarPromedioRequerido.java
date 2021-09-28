package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.MonitoriaId;
import com.sofka.universidad.Monitoria.values.Promedio;

public class ActualizarPromedioRequerido implements Command {

    private final MonitoriaId monitoriaId;
    private final Promedio promedio;

    public ActualizarPromedioRequerido(MonitoriaId monitoriaId, Promedio promedio){
        this.monitoriaId = monitoriaId;
        this.promedio = promedio;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public Promedio getPromedio() {
        return promedio;
    }
}
