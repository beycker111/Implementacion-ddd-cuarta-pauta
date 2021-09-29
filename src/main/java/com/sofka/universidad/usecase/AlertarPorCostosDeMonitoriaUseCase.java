package com.sofka.universidad.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.universidad.domain.monitoria.Monitoria;
import com.sofka.universidad.domain.monitoria.events.MonitoriaCreada;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;

public class AlertarPorCostosDeMonitoriaUseCase extends UseCase<TriggeredEvent<MonitoriaCreada>, ResponseEvents> {

    private final String MENSAJE = "Tiene un costo mayor o igual a $500.000";

    @Override
    public void executeUseCase(TriggeredEvent<MonitoriaCreada> monitoriaCreadaTriggeredEvent) {
        var event = monitoriaCreadaTriggeredEvent.getDomainEvent();
        var monitoria = Monitoria.from(MonitoriaId.of(event.aggregateRootId()), this.retrieveEvents());


        if(event.getSalarioHora().value() >= 500000){
            monitoria.enviarAlerta(MENSAJE);

            emit().onResponse(new ResponseEvents(monitoria.getUncommittedChanges()));
        }

    }
}
