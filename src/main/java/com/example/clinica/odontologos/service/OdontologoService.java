package com.clinica.service;

import com.clinica.model.Odontologo;
import java.util.List;

public interface OdontologoService {
    Odontologo guardarOdontologo(Odontologo odontologo);
    List<Odontologo> listarTodos();
}
