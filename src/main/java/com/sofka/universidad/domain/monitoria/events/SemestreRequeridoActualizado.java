package com.sofka.universidad.domain.monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.monitoria.values.Semestre;

public class SemestreRequeridoActualizado extends DomainEvent {

    private final Semestre semestre;

    public SemestreRequeridoActualizado(Semestre semestre) {
        super("sofka.monitoria.semestrerequeridoactualizado");
        this.semestre = semestre;
    }

    public Semestre getSemestre() {
        return semestre;
    }
}
