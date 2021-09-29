package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.Especialidad;
import com.sofka.universidad.domain.programa.values.LaboratorioId;

public class EspecialidadLaboratorioActualizado extends DomainEvent {

    private final LaboratorioId laboratorioId;
    private final Especialidad especialidad;

    public EspecialidadLaboratorioActualizado(LaboratorioId laboratorioId, Especialidad especialidad) {
        super("sofka.programa.especialidadlaboratorioactualizado");
        this.laboratorioId = laboratorioId;
        this.especialidad = especialidad;
    }

    public LaboratorioId getLaboratorioId() {
        return laboratorioId;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
