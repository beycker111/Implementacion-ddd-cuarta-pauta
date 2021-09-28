package com.sofka.universidad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.programa.values.LaboratorioId;
import com.sofka.universidad.programa.values.Nombre;

public class NombreLaboratorioActualizado extends DomainEvent {

    private final LaboratorioId laboratorioId;
    private final Nombre nombre;

    public NombreLaboratorioActualizado(LaboratorioId laboratorioId, Nombre nombre) {
        super("sofka.programa.nombrelaboratorioactualizado");
        this.laboratorioId = laboratorioId;
        this.nombre = nombre;
    }

    public LaboratorioId getLaboratorioId() {
        return laboratorioId;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
