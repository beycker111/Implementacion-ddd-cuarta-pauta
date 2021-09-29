package com.sofka.universidad.domain.programa;

import co.com.sofka.domain.generic.Entity;
import com.sofka.universidad.domain.programa.values.Credito;
import com.sofka.universidad.domain.programa.values.CursoId;
import com.sofka.universidad.domain.programa.values.Nombre;

public class Curso extends Entity<CursoId> {

    private Nombre nombre;
    private Credito creditos;

    public Curso(CursoId entityId, Nombre nombre, Credito creditos) {
        super(entityId);
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void actualizaCreditos(Credito credito){
        this.creditos = credito;
    }

    public void cambiarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Credito getCreditos() {
        return creditos;
    }
}
