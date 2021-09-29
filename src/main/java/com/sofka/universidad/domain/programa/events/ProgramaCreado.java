package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.Director;
import com.sofka.universidad.domain.programa.values.Nombre;
import com.sofka.universidad.domain.programa.values.ProgramaId;
import com.sofka.universidad.domain.programa.values.Snies;

public class ProgramaCreado extends DomainEvent {

    private final ProgramaId entityId;
    private final Nombre nombre;
    private final Snies snies;
    private final Director director;

    public ProgramaCreado(ProgramaId entityId, Nombre nombre, Snies snies, Director director) {
        super("sofka.programa.programacreado");
        this.entityId = entityId;
        this.nombre = nombre;
        this.snies = snies;
        this.director = director;
    }

    public ProgramaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Snies getSnies() {
        return snies;
    }

    public Director getDirector() {
        return director;
    }
}
