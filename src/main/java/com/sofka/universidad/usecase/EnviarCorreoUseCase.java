package com.sofka.universidad.usecase;

import co.com.sofka.business.generic.BusinessException;
import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.universidad.domain.monitoria.events.MensajeEnviado;

public class EnviarCorreoUseCase extends UseCase<TriggeredEvent<MensajeEnviado>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<MensajeEnviado> mensajeEnviadoTriggeredEvent) {
        var event = mensajeEnviadoTriggeredEvent.getDomainEvent();
        var service = this.getService(EnvioDeCorreoService.class).orElseThrow();
        var isOk = service.enviarCorreo("admin@icesi.com.co", "Asunto", event.getMensaje());

        if(!isOk){
            emit().onError(new BusinessException(
                    event.aggregateRootId(),
                    "No se pudo enviar el correo"
            ));
        }
    }
}
