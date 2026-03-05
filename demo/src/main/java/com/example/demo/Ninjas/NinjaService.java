package com.example.demo.Ninjas;

import org.springframework.stereotype.Service;
import org.yaml.snakeyaml.events.Event;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinjas(){
 return   ninjaRepository.findAll();
}

public NinjaModel listarId(Long id){
    Optional<NinjaModel> idFinder= ninjaRepository.findById(id);
        return idFinder.orElse(null);
}
public void deletarNinjaId(Long id){
  ninjaRepository.deleteById(id);
}
    public NinjaModel CriarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }



}
