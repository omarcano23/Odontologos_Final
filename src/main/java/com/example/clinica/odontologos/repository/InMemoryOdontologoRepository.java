package com.clinica.odontologos.repository;

import com.clinica.odontologos.model.Odontologo;
import java.util.ArrayList;
import java.util.List;

public class InMemoryOdontologoRepository {
    private List<Odontologo> odontologos = new ArrayList<>();

    public Odontologo save(Odontologo odontologo) {
        odontologos.add(odontologo);
        return odontologo;
    }

    public List<Odontologo> findAll() {
        return odontologos;
    }
}
