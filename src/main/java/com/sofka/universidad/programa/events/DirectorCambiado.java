package com.sofka.universidad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.programa.values.Director;

public class DirectorCambiado extends DomainEvent {

    private final Director director;

    public DirectorCambiado(Director director) {
        super("sofka.programa.directorcambiado");
        this.director = director;
    }

    public Director getDirector() {
        return director;
    }
}
