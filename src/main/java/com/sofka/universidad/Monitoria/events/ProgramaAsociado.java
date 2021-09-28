package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.programa.values.ProgramaId;

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
