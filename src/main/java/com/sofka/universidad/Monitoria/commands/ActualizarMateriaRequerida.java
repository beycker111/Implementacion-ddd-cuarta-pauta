package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.Materia;
import com.sofka.universidad.Monitoria.values.MonitoriaId;

public class ActualizarMateriaRequerida implements Command {

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
