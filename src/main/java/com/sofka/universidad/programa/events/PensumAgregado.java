package com.sofka.universidad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.programa.values.PensumId;

public class PensumAgregado extends DomainEvent {

    private final PensumId pensumId;

    public PensumAgregado(PensumId pensumId) {
        super("sofka.programa.pensumagregado");
        this.pensumId = pensumId;
    }

    public PensumId getPensumId() {
        return pensumId;
    }
}
