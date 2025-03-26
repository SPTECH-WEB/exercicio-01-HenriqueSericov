package com.exercicio.exercicio_de_fixacao.Service;

import com.exercicio.exercicio_de_fixacao.Model.FaturaModel;
import com.exercicio.exercicio_de_fixacao.Repository.FaturaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {
    private final FaturaRepository faturaRepository;

    public FaturaService(FaturaRepository faturaRepository) {
        this.faturaRepository = faturaRepository;
    }

    public List<FaturaModel> ListarFaturas(){
        return faturaRepository.findAll();
    }

    public FaturaModel salvar(FaturaModel fatura){
        return faturaRepository.save(fatura);
    }
}
