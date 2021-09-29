package com.sofka.universidad.domain.monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.monitoria.values.Area;

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
