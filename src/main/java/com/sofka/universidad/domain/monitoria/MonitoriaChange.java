package com.sofka.universidad.domain.monitoria;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.universidad.domain.monitoria.events.*;

public class MonitoriaChange extends EventChange {

    public MonitoriaChange(Monitoria monitoria){

        apply((MonitoriaCreada event) -> {
            monitoria.nombre = event.getNombre();
            monitoria.area = event.getArea();
            monitoria.salarioHora = event.getSalarioHora();
        });

        apply((ProgramaAsociado event) -> {
            monitoria.programaId = event.getProgramaId();
        });

        apply((RequisitoMonitoriaAgregada event) -> {
            monitoria.requisitoMonitoria = new RequisitoMonitoria(
                    event.getEntityId(),
                    event.getMateria(),
                    event.getSemestre(),
                    event.getPromedio()
            );
        });

        apply((NombreMonitoriaCambiado event) -> {
            monitoria.nombre = event.getNombre();
        });

        apply((AreaCambiada event) -> {
            monitoria.area = event.getArea();
        });

        apply((SalarioHoraCambiado event) -> {
            monitoria.salarioHora = event.getSalarioHora();
        });

        apply((SalarioHoraAumentado event) -> {
            monitoria.salarioHora = event.getAumentoSalarioHora();
        });

        apply((MateriaRequeridaActualizada event) -> {
            monitoria.requisitoMonitoria.actualizarMateria(event.getMateria());
        });

        apply((SemestreRequeridoActualizado event) -> {
            monitoria.requisitoMonitoria.actualizarSemestre(event.getSemestre());
        });

        apply((PromedioRequeridoActualizado event) -> {
            monitoria.requisitoMonitoria.actualizarPromedio(event.getPromedio());
        });
    }
}
