package com.sofka.universidad.Monitoria;

import co.com.sofka.domain.generic.Entity;
import com.sofka.universidad.Monitoria.values.Materia;
import com.sofka.universidad.Monitoria.values.Promedio;
import com.sofka.universidad.Monitoria.values.RequisitoMonitoriaId;
import com.sofka.universidad.Monitoria.values.Semestre;

import java.util.Objects;

public class RequisitoMonitoria extends Entity<RequisitoMonitoriaId> {

    private Materia materia;
    private Semestre semestre;
    private Promedio promedio;

    public RequisitoMonitoria(RequisitoMonitoriaId entityId, Materia materia, Semestre semestre, Promedio promedio) {
        super(entityId);
        this.materia = materia;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public void actualizarMateria(Materia materia){
        this.materia = Objects.requireNonNull(materia);
    }

    public void actualizarSemestre(Semestre semestre){
        this.semestre = Objects.requireNonNull(semestre);
    }

    public void actualizarPromedio(Promedio promedio){
        this.promedio = Objects.requireNonNull(promedio);
    }

    public void cambiarPromedio(Promedio promedio){
        this.promedio = Objects.requireNonNull(promedio);
    }

    public Materia materia() {
        return materia;
    }

    public Semestre semestre() {
        return semestre;
    }

    public Promedio promedio() {
        return promedio;
    }
}
