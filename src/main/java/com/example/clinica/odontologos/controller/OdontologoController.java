package com.clinica.controller;

import com.clinica.model.Odontologo;
import com.clinica.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    private OdontologoService service;

    @PostMapping("/guardar")
    public Odontologo guardar(@RequestBody Odontologo odontologo) {
        return service.guardarOdontologo(odontologo);
    }

    @GetMapping("/listar")
    public List<Odontologo> listar() {
        return service.listarTodos();
    }
}
