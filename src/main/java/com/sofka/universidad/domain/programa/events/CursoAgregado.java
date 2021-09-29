package com.sofka.universidad.domain.programa.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.programa.values.Credito;
import com.sofka.universidad.domain.programa.values.CursoId;
import com.sofka.universidad.domain.programa.values.Nombre;

public class CursoAgregado extends DomainEvent {

    private final CursoId cursoId;
    private final Nombre nombre;
    private final Credito credito;

    public CursoAgregado(CursoId cursoId, Nombre nombre, Credito credito) {
        super("sofka.programa.cursoagregado");
        this.cursoId = cursoId;
        this.nombre = nombre;
        this.credito = credito;
    }

    public CursoId getCursoId() {
        return cursoId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Credito getCredito() {
        return credito;
    }
}
