package com.seduc2.gourmetfy.service;

import com.seduc2.gourmetfy.intity.Restaurante;
import org.springframework.stereotype.Service;
import com.seduc2.gourmetfy.repository.RestauranteRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestauranteService {


    private final RestauranteRepository repository;

    public RestauranteService(RestauranteRepository repository) {
        this.repository = repository;
    }

    public List<Restaurante> mostrarReserva() {
        List<Restaurante> restauranteList = new ArrayList<>();
        restauranteList = repository.findAll();
        return restauranteList;
    }

    public void cadastrarRestaurante(Restaurante reserva) {
        Restaurante restaurante = new Restaurante();
        restaurante.setNome(reserva.getNome());
        restaurante.setTelefone(reserva.getTelefone());
        restaurante.setQuantidadePessoas(reserva.getQuantidadePessoas());
        restaurante.setData(reserva.getData());
        restaurante.setHorario(reserva.getHorario());
        restaurante.setObservacao(reserva.getObservacao());
        repository.save(restaurante);

    }
}