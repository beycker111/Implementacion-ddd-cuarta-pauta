package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Area;
import com.sofka.universidad.Monitoria.values.Nombre;
import com.sofka.universidad.Monitoria.values.SalarioHora;

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
