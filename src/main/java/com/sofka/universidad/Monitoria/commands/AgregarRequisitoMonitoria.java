package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.*;

public class AgregarRequisitoMonitoria implements Command {

    private final MonitoriaId monitoriaId;
    private final RequisitoMonitoriaId entityId;
    private final Materia materia;
    private final Semestre semestre;
    private final Promedio promedio;

    public AgregarRequisitoMonitoria(MonitoriaId monitoriaId, RequisitoMonitoriaId entityId, Materia materia, Semestre semestre, Promedio promedio){
        this.monitoriaId = monitoriaId;
        this.entityId = entityId;
        this.materia = materia;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public RequisitoMonitoriaId getEntityId() {
        return entityId;
    }

    public Materia getMateria() {
        return materia;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public Promedio getPromedio() {
        return promedio;
    }
}
