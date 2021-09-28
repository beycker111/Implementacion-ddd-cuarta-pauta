package com.sofka.universidad.programa;

import co.com.sofka.domain.generic.Entity;
import com.sofka.universidad.programa.values.Especialidad;
import com.sofka.universidad.programa.values.LaboratorioId;
import com.sofka.universidad.programa.values.Nombre;
import com.sofka.universidad.programa.values.Ubicacion;

public class Laboratorio extends Entity<LaboratorioId> {

    private Nombre nombre;
    private Ubicacion ubicacion;
    private Especialidad especialidad;

    public Laboratorio(LaboratorioId entityId, Nombre nombre, Ubicacion ubicacion, Especialidad especialidad) {
        super(entityId);
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.especialidad = especialidad;
    }

    public void actualizarNombre(Nombre nombre){
        this.nombre = nombre;
    }

    public void actualizarUbicacion(Ubicacion ubicacion){
        this.ubicacion = ubicacion;
    }

    public void actualizarEspecialidad(Especialidad especialidad){
        this.especialidad = especialidad;
    }

    public Nombre nombre() {
        return nombre;
    }

    public Ubicacion ubicacion() {
        return ubicacion;
    }

    public Especialidad especialidad() {
        return especialidad;
    }
}
