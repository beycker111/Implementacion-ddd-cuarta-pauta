package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;
import com.sofka.universidad.domain.monitoria.values.SalarioHora;

public class CambiarSalarioHora extends Command {

    private final MonitoriaId monitoriaId;
    private final SalarioHora salarioHora;

    public CambiarSalarioHora(MonitoriaId monitoriaId, SalarioHora salarioHora){
        this.monitoriaId = monitoriaId;
        this.salarioHora = salarioHora;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public SalarioHora getSalarioHora() {
        return salarioHora;
    }
}
