package com.sofka.universidad.domain.monitoria.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;
import com.sofka.universidad.domain.programa.values.ProgramaId;

public class AsociarPrograma extends Command {

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
