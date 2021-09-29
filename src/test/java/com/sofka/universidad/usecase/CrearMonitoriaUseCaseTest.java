package com.sofka.universidad.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.universidad.domain.monitoria.commands.CrearMonitoria;
import com.sofka.universidad.domain.monitoria.events.MonitoriaCreada;
import com.sofka.universidad.domain.monitoria.events.NombreMonitoriaCambiado;
import com.sofka.universidad.domain.monitoria.values.Area;
import com.sofka.universidad.domain.monitoria.values.MonitoriaId;
import com.sofka.universidad.domain.monitoria.values.Nombre;
import com.sofka.universidad.domain.monitoria.values.SalarioHora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CrearMonitoriaUseCaseTest {

    @Test
    void crearMonitorEscenarioConSalarioPorDefecto(){
        //arrange
        var command = new CrearMonitoria(
                MonitoriaId.of("xxxx"),
                new Nombre("Beycker"),
                new Area("Sistemas"),
                new SalarioHora(0)
        );
        var useCase = new CrearMonitoriaUseCase();

        //act
        var events = UseCaseHandler
                .getInstance()
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow()
                .getDomainEvents();

        //assert
        var eventCreacion = (MonitoriaCreada)events.get(0);
        var eventActualizacion = (NombreMonitoriaCambiado)events.get(1);

        Assertions.assertEquals("Beycker", eventCreacion.getNombre().value());
        Assertions.assertEquals("Sistemas", eventCreacion.getArea().value());
        Assertions.assertEquals(500000, eventCreacion.getSalarioHora().value());

        Assertions.assertEquals("Alexis", eventActualizacion.getNombre().value());

        Assertions.assertEquals(2, events.size());
    }

    @Test
    void crearMonitorEscenarioExplicito(){

    }
}