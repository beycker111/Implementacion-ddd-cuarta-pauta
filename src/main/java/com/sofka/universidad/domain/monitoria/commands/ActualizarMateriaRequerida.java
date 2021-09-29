package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.Materia;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;

public class ActualizarMateriaRequerida extends Command {

    private final Materia materia;
    private final MonitoriaId monitoriaId;

    public ActualizarMateriaRequerida(MonitoriaId monitoriaId, Materia materia){
        this.monitoriaId = monitoriaId;
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }
}
