package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.Area;

public class AreaCambiada extends DomainEvent {

    private final Area area;
    public AreaCambiada(Area area) {
        super("sofka.monitoria.areacambiada");
        this.area = area;
    }

    public Area getArea() {
        return area;
    }
}
