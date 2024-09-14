package com.example.clinica.service;

import com.example.clinica.model.Paciente;
import com.example.clinica.repository.PacienteRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class PacienteServiceTest {

    @Mock
    private PacienteRepository pacienteRepository;

    @InjectMocks
    private PacienteService pacienteService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testListarTodos() {
        Paciente paciente = new Paciente();
        when(pacienteRepository.findAll()).thenReturn(Arrays.asList(paciente));
        List<Paciente> pacientes = pacienteService.listarTodos();
        assertNotNull(pacientes);
        assertEquals(1, pacientes.size());
    }

    @Test
    void testBuscarPorId() {
        Paciente paciente = new Paciente();
        when(pacienteRepository.findById(1L)).thenReturn(Optional.of(paciente));
        Optional<Paciente> foundPaciente = pacienteService.buscarPorId(1L);
        assertTrue(foundPaciente.isPresent());
    }

    // Añadir más pruebas para guardar y eliminar
}
