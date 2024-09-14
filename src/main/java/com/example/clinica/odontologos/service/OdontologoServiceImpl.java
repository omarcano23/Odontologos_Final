package com.clinica.service.impl;

import com.clinica.model.Odontologo;
import com.clinica.repository.OdontologoRepository;
import com.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdontologoServiceImpl implements OdontologoService {

    @Autowired
    private OdontologoRepository repository;

    @Override
    public Odontologo guardarOdontologo(Odontologo odontologo) {
        return repository.save(odontologo);
    }

    @Override
    public List<Odontologo> listarTodos() {
        return repository.findAll();
    }
}
