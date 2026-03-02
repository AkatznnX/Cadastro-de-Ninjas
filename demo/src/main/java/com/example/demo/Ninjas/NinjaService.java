package com.example.demo.Ninjas;

import org.springframework.stereotype.Service;

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
/*public NinjaModel deletarNinjaId(Long id){
    Optional<NinjaModel> idDeleter= ninjaRepository.deleteById(id);
    return idDeleter.orElse(null);
}*/



}
