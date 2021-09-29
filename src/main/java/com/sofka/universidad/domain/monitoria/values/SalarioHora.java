package com.sofka.universidad.domain.monitoria.values;

import co.com.sofka.domain.generic.ValueObject;

public class SalarioHora implements ValueObject<Integer> {

    private final Integer salarioHora;

    public SalarioHora(Integer salarioHora) {

        this.salarioHora = salarioHora;
    }

    @Override
    public Integer value() {
        return salarioHora;
    }
}
