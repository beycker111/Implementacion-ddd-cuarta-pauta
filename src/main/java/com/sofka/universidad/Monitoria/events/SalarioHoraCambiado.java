package com.sofka.universidad.Monitoria.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.universidad.Monitoria.values.SalarioHora;

public class SalarioHoraCambiado extends DomainEvent {

    private final SalarioHora salarioHora;

    public SalarioHoraCambiado(SalarioHora salarioHora) {
        super("sofka.monitoria.salarihoracambiado");
        this.salarioHora = salarioHora;
    }

    public SalarioHora getSalarioHora() {
        return salarioHora;
    }
}
