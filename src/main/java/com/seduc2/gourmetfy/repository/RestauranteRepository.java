package com.seduc2.gourmetfy.repository;

import com.seduc2.gourmetfy.intity.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {

}
