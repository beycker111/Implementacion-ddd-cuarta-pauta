package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;
import com.sofka.universidad.domain.monitoria.values.Promedio;

public class ActualizarPromedioRequerido extends Command {

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
