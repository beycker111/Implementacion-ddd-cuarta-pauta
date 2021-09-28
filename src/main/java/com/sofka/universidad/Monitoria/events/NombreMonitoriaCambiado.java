package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Nombre;

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
