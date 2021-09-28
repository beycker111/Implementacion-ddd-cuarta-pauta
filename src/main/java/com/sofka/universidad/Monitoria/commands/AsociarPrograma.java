package com.sofka.universidad.Monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.Monitoria.values.MonitoriaId;
import com.sofka.universidad.programa.values.ProgramaId;

public class AsociarPrograma implements Command {

    private final MonitoriaId monitoriaId;
    private final ProgramaId programaId;

    public AsociarPrograma(MonitoriaId monitoriaId, ProgramaId programaId){
        this.monitoriaId = monitoriaId;
        this.programaId = programaId;
    }

    public MonitoriaId getMonitoriaId() {
        return monitoriaId;
    }

    public ProgramaId getProgramaId() {
        return programaId;
    }
}
