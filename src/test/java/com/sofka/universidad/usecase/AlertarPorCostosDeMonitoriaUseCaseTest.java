package com.sofka.universidad.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.domain.monitoria.events.MensajeEnviado;
import com.sofka.universidad.domain.monitoria.events.MonitoriaCreada;
import com.sofka.universidad.domain.monitoria.values.Area;
import com.sofka.universidad.domain.monitoria.values.Nombre;
import com.sofka.universidad.domain.monitoria.values.SalarioHora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AlertarPorCostosDeMonitoriaUseCaseTest {

    @Mock
    private DomainEventRepository repository;

    @Test
    void alertarPorMensajeCumpleLaValidacion(){

        //arrange
        var aggregateId = "xxx-xxx";
        var event = new MonitoriaCreada(new Nombre("Monitor"), new Area("Fisica"), new SalarioHora(600000));

        event.setAggregateRootId(aggregateId);
        var useCase = new AlertarPorCostosDeMonitoriaUseCase();

        Mockito.when(repository.getEventsBy(aggregateId)).thenReturn(eventStored());
        useCase.addRepository(repository);

        //act
        var events = UseCaseHandler.getInstance()
                .setIdentifyExecutor(aggregateId)
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var mensajeEnviado = (MensajeEnviado)events.get(0);

        Assertions.assertEquals("Tiene un costo mayor o igual a $500.000", mensajeEnviado.getMensaje());
        //Esto se agrego al final
        Mockito.verify(repository).getEventsBy(aggregateId);
    }

    private List<DomainEvent> eventStored() {

        var event = new MonitoriaCreada(new Nombre("Monitor"), new Area("Fisica"), new SalarioHora(600000));

        return List.of(
                event
        );
    }


}