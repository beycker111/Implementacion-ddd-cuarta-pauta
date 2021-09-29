package com.sofka.universidad.domain.monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.monitoria.values.Area;
import com.sofka.universidad.domain.monitoria.values.Nombre;
import com.sofka.universidad.domain.monitoria.values.SalarioHora;

public class MonitoriaCreada extends DomainEvent {

    private final Nombre nombre;
    private final Area area;
    private final SalarioHora salarioHora;

    public MonitoriaCreada(Nombre nombre, Area area, SalarioHora salarioHora) {
        super("sofka.monitoria.monitoriacreada");
        this.nombre = nombre;
        this.area = area;
        this.salarioHora = salarioHora;
    }

    public Nombre getNombre(){
        return nombre;
    }

    public Area getArea() {
        return area;
    }

    public SalarioHora getSalarioHora() {
        return salarioHora;
    }
}
