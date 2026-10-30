package com.seduc2.gourmetfy.controller;

import com.seduc2.gourmetfy.intity.Restaurante;
import org.springframework.web.bind.annotation.*;
import com.seduc2.gourmetfy.service.RestauranteService;

import java.util.List;

@RestController
@RequestMapping("/api/restaurantes")
public class RestauranteControler {

    private final RestauranteService service;

    public RestauranteControler(RestauranteService service) {
        this.service = service;
    }

    @GetMapping
    public List<Restaurante> mostrarReserva(){
        return service.mostrarReserva();
    }

    @PostMapping
    public void cadatrarReserva(@RequestBody Restaurante r){
        service.cadastrarRestaurante(r);
    }
}
