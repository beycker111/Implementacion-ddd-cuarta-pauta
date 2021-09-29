package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.Especialidad;
import com.sofka.universidad.domain.programa.values.LaboratorioId;
import com.sofka.universidad.domain.programa.values.Nombre;
import com.sofka.universidad.domain.programa.values.Ubicacion;

public class LaboratorioAgregado extends DomainEvent {

    private final LaboratorioId laboratorioId;
    private final Nombre nombre;
    private final Ubicacion ubicacion;
    private final  Especialidad especialidad;

    public LaboratorioAgregado(LaboratorioId laboratorioId, Nombre nombre, Ubicacion ubicacion, Especialidad especialidad) {
        super("sofka.programa.laboratorioagregado");
        this.laboratorioId = laboratorioId;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.especialidad = especialidad;
    }

    public LaboratorioId getLaboratorioId() {
        return laboratorioId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }
}
