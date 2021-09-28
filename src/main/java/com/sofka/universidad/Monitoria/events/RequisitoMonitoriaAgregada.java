package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Materia;
import com.sofka.universidad.Monitoria.values.Promedio;
import com.sofka.universidad.Monitoria.values.RequisitoMonitoriaId;
import com.sofka.universidad.Monitoria.values.Semestre;

public class RequisitoMonitoriaAgregada extends DomainEvent {

    private final RequisitoMonitoriaId entityId;
    private final Materia materia;
    private final Semestre semestre;
    private final Promedio promedio;

    public RequisitoMonitoriaAgregada(RequisitoMonitoriaId entityId, Materia materia, Semestre semestre, Promedio promedio) {
        super("sofka.monitoria.requisitomonitoriaagregada");
        this.entityId = entityId;
        this.materia = materia;
        this.semestre = semestre;
        this.promedio = promedio;
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
