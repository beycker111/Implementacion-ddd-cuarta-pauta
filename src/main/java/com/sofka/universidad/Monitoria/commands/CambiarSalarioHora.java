package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.MonitoriaId;
import com.sofka.universidad.Monitoria.values.SalarioHora;

public class CambiarSalarioHora implements Command {

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
