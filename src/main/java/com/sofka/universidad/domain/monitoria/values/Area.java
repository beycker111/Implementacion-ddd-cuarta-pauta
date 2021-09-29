package com.sofka.universidad.domain.monitoria.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Area implements ValueObject<String> {
    private final String area;

    public Area(String area) {

        this.area = Objects.requireNonNull(area);
    }

    @Override
    public String value() {
        return area;
    }
}
