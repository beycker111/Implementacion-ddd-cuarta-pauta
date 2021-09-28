package com.sofka.universidad.programa;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.universidad.programa.values.ProgramaId;

public class Programa extends AggregateEvent<ProgramaId> {

    public Programa(ProgramaId entityId) {
        super(entityId);
    }
}
