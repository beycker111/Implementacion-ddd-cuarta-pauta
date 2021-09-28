package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Promedio;

public class PromedioRequeridoActualizado extends DomainEvent {

    private final Promedio promedio;

    public PromedioRequeridoActualizado(Promedio promedio) {
        super("sofka.monitoria.promediorequeridoactualizado");
        this.promedio = promedio;
    }

    public Promedio getPromedio() {
        return promedio;
    }
}
