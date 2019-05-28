package com.cice.gestionproductos.resource;

import com.cice.gestionproductos.resource.dto.CursoDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@RestController
public class ProductosResource {

    @RequestMapping(path = "/productos", method = RequestMethod.GET)
    public ResponseEntity getProductos(){
        return ResponseEntity.ok(Arrays.asList(new CursoDTO[] {
                new CursoDTO("A"),
                new CursoDTO("B"),
                new CursoDTO("C")
        }));
    }

    @RequestMapping(path = "/productos/info", method = RequestMethod.GET)
    public ResponseEntity<String> getInfo(){
        RestTemplate restTemplate = new RestTemplate();
        String URL_MS = "http://localhost:8081/cursos/info";
        ResponseEntity<String> forEntity = restTemplate.getForEntity(URL_MS, String.class);
        return forEntity;
    }
}
