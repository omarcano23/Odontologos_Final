package com.clinica.repository;

import com.clinica.model.Odontologo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OdontologoDAOCollection {
    private List<Odontologo> odontologos = new ArrayList<>();

    public void guardar(Odontologo odontologo) {
        odontologos.add(odontologo);
    }

    public List<Odontologo> listarTodos() {
        return odontologos;
    }
}
