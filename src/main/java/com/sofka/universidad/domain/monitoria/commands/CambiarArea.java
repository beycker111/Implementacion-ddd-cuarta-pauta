package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.Area;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;

public class CambiarArea extends Command {

    private final MonitoriaId monitoriaId;
    private final Area area;

    public CambiarArea(MonitoriaId monitoriaId, Area area){
        this.monitoriaId = monitoriaId;
        this.area = area;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public Area getArea() {
        return area;
    }
}
