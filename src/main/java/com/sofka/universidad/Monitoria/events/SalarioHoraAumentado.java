package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.SalarioHora;

public class SalarioHoraAumentado extends DomainEvent {

    private final SalarioHora aumentoSalarioHora;

    public SalarioHoraAumentado(SalarioHora salarioActual, Integer aumento) {
        super("sofka.monitoria.salariohoraaumentado");
        //Falta sumar el aumento
        this.aumentoSalarioHora = salarioActual;
    }

    public SalarioHora getAumentoSalarioHora() {
        return aumentoSalarioHora;
    }
}
