package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.Area;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;
import com.sofka.universidad.domain.monitoria.values.Nombre;
import com.sofka.universidad.domain.monitoria.values.SalarioHora;

public class CrearMonitoria extends Command {

    private final MonitoriaId entityId;
    private final Nombre nombre;
    private final Area area;
    private final SalarioHora salarioHora;

    public CrearMonitoria(MonitoriaId entityId, Nombre nombre, Area area, SalarioHora salarioHora) {
        this.entityId = entityId;
        this.nombre = nombre;
        this.area = area;
        this.salarioHora = salarioHora;
    }

    public MonitoriaId getEntityId() {
        return entityId;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Area getArea() {
        return area;
    }

    public SalarioHora getSalarioHora() {
        return salarioHora;
    }
}
