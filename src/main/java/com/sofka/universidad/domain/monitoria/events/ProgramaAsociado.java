package com.sofka.universidad.domain.monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.ProgramaId;

public class ProgramaAsociado extends DomainEvent {

    private final ProgramaId programaId;
    public ProgramaAsociado(ProgramaId programaId) {
        super("sofka.monitoria.programaasociado");
        this.programaId = programaId;
    }

    public ProgramaId getProgramaId() {
        return programaId;
    }
}
