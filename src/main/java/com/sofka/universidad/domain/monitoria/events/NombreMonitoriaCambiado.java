package com.sofka.universidad.domain.monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.monitoria.values.Nombre;

public class NombreMonitoriaCambiado extends DomainEvent {

    private final Nombre nombre;
    public NombreMonitoriaCambiado(Nombre nombre) {
        super("sofka.monitoria.nombremonitoriacambiado");
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }
}
