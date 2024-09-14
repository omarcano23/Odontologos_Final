package com.example.clinica.service;

import com.example.clinica.model.Domicilio;
import com.example.clinica.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DomicilioService {

    @Autowired
    private DomicilioRepository domicilioRepository;

    public List<Domicilio> listarTodos() {
        return domicilioRepository.findAll();
    }

    public Optional<Domicilio> buscarPorId(Long id) {
        return domicilioRepository.findById(id);
    }

    public Domicilio guardar(Domicilio domicilio) {
        return domicilioRepository.save(domicilio);
    }

    public void eliminar(Long id) {
        domicilioRepository.deleteById(id);
    }
}
