package com.clinica.odontologos.service.impl;

import com.clinica.odontologos.model.Odontologo;
import com.clinica.odontologos.repository.OdontologoRepository;
import com.clinica.odontologos.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {

    @Autowired
    private OdontologoRepository repository;

    @Override
    public Odontologo save(Odontologo odontologo) {
        return repository.save(odontologo);
    }

    @Override
    public List<Odontologo> findAll() {
        return repository.findAll();
    }
}
