package com.exercicio.exercicio_de_fixacao.Repository;

import com.exercicio.exercicio_de_fixacao.Model.FaturaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FaturaRepository extends JpaRepository<FaturaModel, Long> {

}

