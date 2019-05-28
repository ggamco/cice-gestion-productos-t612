package com.cice.gestionproductos.resource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class CursoDTO implements Serializable {
    @JsonProperty
    private String nombre;

    public CursoDTO(String nombre) {
        this.nombre = nombre;
    }
}
