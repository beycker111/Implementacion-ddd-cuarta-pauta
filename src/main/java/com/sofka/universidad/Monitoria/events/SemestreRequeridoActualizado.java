package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Semestre;

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
