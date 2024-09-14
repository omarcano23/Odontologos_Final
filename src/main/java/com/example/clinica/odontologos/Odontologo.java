package com.clinica.odontologos.model;

import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "odontologos")
@Data
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String matricula;
    private String nombre;
    private String apellido;
}
