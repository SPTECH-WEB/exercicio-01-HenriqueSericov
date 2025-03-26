package com.exercicio.exercicio_de_fixacao.Controller;

import com.exercicio.exercicio_de_fixacao.Model.FaturaModel;
import com.exercicio.exercicio_de_fixacao.Repository.FaturaRepository;
import com.exercicio.exercicio_de_fixacao.Service.FaturaService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Faturas")
public class FaturaController {
    private final FaturaService faturaService;

    public FaturaController(FaturaService faturaService) {
        this.faturaService = faturaService;
    }

    @PostMapping
    public FaturaModel CriarFatura(@Valid @RequestBody FaturaModel fatura){
        return faturaService.salvar(fatura);
    }

    @GetMapping
    public List<FaturaModel> ListarFaturas(){
        return faturaService.ListarFaturas();
    }
}
