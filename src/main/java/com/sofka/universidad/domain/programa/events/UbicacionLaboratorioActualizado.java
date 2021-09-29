package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.LaboratorioId;
import com.sofka.universidad.domain.programa.values.Ubicacion;

public class UbicacionLaboratorioActualizado extends DomainEvent {

    private final LaboratorioId laboratorioId;
    private final Ubicacion ubicacion;

    public UbicacionLaboratorioActualizado(LaboratorioId laboratorioId, Ubicacion ubicacion) {
        super("sofka.programa.ubicacionlaboratorioactualizado");
        this.laboratorioId = laboratorioId;
        this.ubicacion = ubicacion;
    }

    public LaboratorioId getLaboratorioId() {
        return laboratorioId;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }
}
