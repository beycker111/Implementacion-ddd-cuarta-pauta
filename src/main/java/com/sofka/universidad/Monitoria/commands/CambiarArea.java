package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.Area;
import com.sofka.universidad.Monitoria.values.MonitoriaId;

public class CambiarArea implements Command {

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
