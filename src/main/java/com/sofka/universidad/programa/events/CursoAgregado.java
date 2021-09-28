package com.sofka.universidad.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.programa.Curso;

public class CursoAgregado extends DomainEvent {

    private final Curso curso;

    public CursoAgregado(Curso curso) {
        super("sofka.programa.cursoagregado");
        this.curso = curso;
    }

    public Curso getCurso() {
        return curso;
    }
}
