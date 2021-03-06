package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;

public class AumentarSalarioHora extends Command {

    private final MonitoriaId monitoriaId;
    private final Integer aumento;

    public AumentarSalarioHora(MonitoriaId monitoriaId, Integer aumento){
        this.monitoriaId = monitoriaId;
        this.aumento = aumento;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public Integer getAumento() {
        return aumento;
    }
}
