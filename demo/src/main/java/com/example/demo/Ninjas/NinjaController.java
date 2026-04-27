package com.example.demo.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
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
    public NinjaDTO CriarNinjas( @RequestBody NinjaDTO ninjaDTO){
        return ninjaService.CriarNinja(ninjaDTO);
    }


    @GetMapping("/readAll")
    public List<NinjaModel> mostrarNinjas(){
        return ninjaService.listarNinjas();
    }


    @GetMapping("/readId/{id}")
    public NinjaModel mostrarNinjasId(@PathVariable Long id){
        return ninjaService.listarId(id);
    }


    @PatchMapping("/alterar/{id}")
    public String alterarNinjaId(@PathVariable Long id){
        return "ninja alterado pelo id";
    }


    @DeleteMapping("/delete/{id}")
    public void deletarId(@PathVariable Long id){
        ninjaService.deletarNinjaId(id);
    }

}
