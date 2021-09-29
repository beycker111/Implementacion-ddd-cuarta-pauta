package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.Nombre;

public class NombreCambiado extends DomainEvent {

    private final Nombre nombre;

    public NombreCambiado(Nombre nombre) {
        super("sofka.programa.nombrecambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
