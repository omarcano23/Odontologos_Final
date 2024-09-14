package com.clinica.service;

import com.clinica.model.Odontologo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class OdontologoServiceTest {

    @Autowired
    private OdontologoService service;

    @Test
    public void testGuardarYListarOdontologo() {
        Odontologo odontologo = new Odontologo();
        odontologo.setNumeroMatricula("12345");
        odontologo.setNombre("Juan");
        odontologo.setApellido("Pérez");

        service.guardarOdontologo(odontologo);

        List<Odontologo> odontologos = service.listarTodos();
        assertFalse(odontologos.isEmpty());
        assertEquals("Juan", odontologos.get(0).getNombre());
    }
}
