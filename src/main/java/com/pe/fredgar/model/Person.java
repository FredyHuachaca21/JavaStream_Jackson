package com.pe.fredgar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String identificador;
    private int id;
    private String nombre;
    private String apellido;
    private String email;
    private String gender;
    private String color;
    private String pais;
    private String telefono;
    private String moneda;
    private boolean activo;
    private String fecha_nac;
    private String password;

}
