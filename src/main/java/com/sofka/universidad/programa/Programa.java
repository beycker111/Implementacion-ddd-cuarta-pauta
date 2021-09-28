package com.sofka.universidad.programa;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.universidad.programa.events.*;
import com.sofka.universidad.programa.values.*;

import java.util.List;
import java.util.Objects;

public class Programa extends AggregateEvent<ProgramaId> {

    protected Nombre nombre;
    protected Snies snies;
    protected Director director;
    protected Pensum pensum;
    protected List<Laboratorio> laboratorios; //No se ha inicializado

    public Programa(ProgramaId entityId, Nombre nombre, Snies snies, Director director) {
        super(entityId);
        appendChange(new ProgramaCreado(entityId, nombre, snies, director)).apply();
    }

    public void agregarPensum(PensumId pensumId){
        Objects.requireNonNull(pensumId);
        appendChange(new PensumAgregado(pensumId)).apply();
    }

    public void agregarLaboratorio(LaboratorioId laboratorioId, Nombre nombre, Ubicacion ubicacion, Especialidad especialidad){
        Objects.requireNonNull(laboratorioId);
        Objects.requireNonNull(nombre);
        Objects.requireNonNull(ubicacion);
        Objects.requireNonNull(especialidad);
        appendChange(new LaboratorioAgregado(laboratorioId, nombre, ubicacion, especialidad)).apply();
    }

    public void agregarCursoAlPensum(Curso curso){
        appendChange(new CursoAgregado(curso)).apply();
    }

    public void cambiarNombre(Nombre nombre){
        appendChange(new NombreCambiado(nombre)).apply();
    }

    public void cambiarSnies(Snies snies){
        appendChange(new SniesCambiado(snies)).apply();
    }

    public void cambiarDirector(Director director){
        appendChange(new DirectorCambiado(director)).apply();
    }

    public void ActualizarNombreLaboratorio(LaboratorioId laboratorioId, Nombre nombre){
        appendChange(new NombreLaboratorioActualizado(laboratorioId, nombre)).apply();
    }

    public void ActualizarUbicacionLaboratorio(LaboratorioId laboratorioId, Ubicacion ubicacion){
        appendChange(new UbicacionLaboratorioActualizado(laboratorioId, ubicacion)).apply();
    }
    public void ActualizarEspecialidadLaboratorio(LaboratorioId laboratorioId, Especialidad especialidad){
        appendChange(new EspecialidadLaboratorioActualizado(laboratorioId, especialidad)).apply();
    }

    public Nombre nombre() {
        return nombre;
    }

    public Snies snies() {
        return snies;
    }

    public Director director() {
        return director;
    }

    public Pensum pensum() {
        return pensum;
    }

    public List<Laboratorio> laboratorios() {
        return laboratorios;
    }
}
