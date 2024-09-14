package com.example.clinica.controller;

import com.example.clinica.model.Domicilio;
import com.example.clinica.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    private DomicilioService domicilioService;

    @GetMapping
    public List<Domicilio> listarTodos() {
        return domicilioService.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Domicilio> buscarPorId(@PathVariable Long id) {
        Optional<Domicilio> domicilio = domicilioService.buscarPorId(id);
        return domicilio.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Domicilio> guardar(@RequestBody Domicilio domicilio) {
        return new ResponseEntity<>(domicilioService.guardar(domicilio), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        domicilioService.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
