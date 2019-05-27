package com.cice.gestionproductos.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
public class ProductosResource {

    @RequestMapping(path = "/productos", method = RequestMethod.GET)
    public ResponseEntity getProductos(){
        return ResponseEntity.ok(Collections.EMPTY_LIST);
    }
}
