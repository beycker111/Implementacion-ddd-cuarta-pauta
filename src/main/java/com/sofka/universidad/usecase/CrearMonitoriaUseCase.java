package com.sofka.universidad.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.universidad.domain.monitoria.Monitoria;
import com.sofka.universidad.domain.monitoria.commands.CrearMonitoria;
import com.sofka.universidad.domain.monitoria.values.Nombre;
import com.sofka.universidad.domain.monitoria.values.SalarioHora;

public class CrearMonitoriaUseCase  extends UseCase<RequestCommand<CrearMonitoria>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CrearMonitoria> crearMonitoriaRequestCommand) {

        var command = crearMonitoriaRequestCommand.getCommand();

        Monitoria monitoria;

        if(command.getSalarioHora().value() == 0){
            monitoria =new Monitoria(
                    command.getEntityId(),
                    command.getNombre(),
                    command.getArea(),
                    new SalarioHora(500000)
            );
        }else{
            monitoria =new Monitoria(
                    command.getEntityId(),
                    command.getNombre(),
                    command.getArea(),
                    command.getSalarioHora()
            );
        }

        monitoria.cambiarNombre(new Nombre("Alexis"));

        emit().onResponse(new ResponseEvents(monitoria.getUncommittedChanges()));
    }


    /*
    public static class Request implements UseCase.RequestValues{
        private final String nombre;
        private final String id;
        private final String area;
        private final Integer salarioHora;

        public Request(String nombre, String id, String area, Integer salarioHora) {
            this.nombre = nombre;
            this.id = id;
            this.area = area;
            this.salarioHora = salarioHora;
        }

        public String getNombre() {
            return nombre;
        }

        public String getId() {
            return id;
        }

        public String getArea() {
            return area;
        }

        public Integer getSalarioHora() {
            return salarioHora;
        }
    }

    public static class Response implements UseCase.ResponseValues{
        private final List<DomainEvent> eventList;

        public Response(List<DomainEvent> eventList) {
            this.eventList = eventList;
        }

        public List<DomainEvent> getEventList() {
            return eventList;
        }
    }
     */
}
