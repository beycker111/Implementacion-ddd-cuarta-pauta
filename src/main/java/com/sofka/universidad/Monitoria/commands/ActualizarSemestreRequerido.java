package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.MonitoriaId;
import com.sofka.universidad.Monitoria.values.Semestre;

public class ActualizarSemestreRequerido implements Command {

    private final MonitoriaId monitoriaId;
    private final Semestre semestre;

    public ActualizarSemestreRequerido(MonitoriaId monitoriaId, Semestre semestre){
        this.monitoriaId = monitoriaId;
        this.semestre = semestre;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public Semestre getSemestre() {
        return semestre;
    }
}
