package com.sofka.universidad.domain.programa;

import co.com.sofka.domain.generic.Entity;
import com.sofka.universidad.domain.programa.values.CursoId;
import com.sofka.universidad.domain.programa.values.PensumId;

import java.util.ArrayList;
import java.util.Optional;

public class Pensum extends Entity<PensumId> {

    private ArrayList<Curso> cursos;

    public Pensum(PensumId entityId) {
        super(entityId);
        cursos = new ArrayList<>();
    }

    public Pensum(PensumId entityId, ArrayList<Curso> cursos) {
        super(entityId);
        this.cursos = cursos;
    }

    public Optional<Curso> encontrarCurso(CursoId cursoId){
        return cursos
                .stream()
                .filter(curso -> curso.identity().equals(cursoId))
                .findFirst();
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }

    public ArrayList<Curso> cursos() {
        return cursos;
    }
}
