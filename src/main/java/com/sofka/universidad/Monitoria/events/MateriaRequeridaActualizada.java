package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Materia;

public class MateriaRequeridaActualizada extends DomainEvent {

    private final Materia materia;

    public MateriaRequeridaActualizada(Materia materia) {
        super("sofka.monitoria.materiarequeridaactualizada");
        this.materia = materia;
    }

    public Materia getMateria() {
        return materia;
    }
}
