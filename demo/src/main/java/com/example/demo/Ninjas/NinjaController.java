package com.example.demo.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping("/first")
    public String ola(){
        return "meu primeiro getmapping";
    }

    @PostMapping("/create")
    public String criarNinja(){
        return "ninja criado";
    }
    @GetMapping("/readAll")
    public List<NinjaModel> mostrarNinjas(){
        return ninjaService.listarNinjas();
    }
    @PostMapping("/readId")
    public String mostrarNinjasId(){
        return "aqui esta o ninja pelo id ";
    }
    @PutMapping("/alterarId")
    public String alterarNinjaId(){
        return "ninja alterado pelo id";
    }
    @DeleteMapping("/delete")
    public String deletarId(){
        return "ninja deletado pelo id";
    }

}
