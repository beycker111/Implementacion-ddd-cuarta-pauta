package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.Snies;

public class SniesCambiado extends DomainEvent {

    private final Snies snies;

    public SniesCambiado(Snies snies) {
        super("sofka.programa.sniescambiado");
        this.snies = snies;
    }

    public Snies getSnies() {
        return snies;
    }
}
