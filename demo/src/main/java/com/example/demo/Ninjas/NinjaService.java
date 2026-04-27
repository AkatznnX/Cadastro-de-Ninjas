package com.example.demo.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
private NinjaRepository ninjaRepository;
private NinjaMapper ninjaMapper;

    public NinjaService(NinjaMapper ninjaMapper, NinjaRepository ninjaRepository) {
        this.ninjaMapper = ninjaMapper;
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

    public NinjaDTO CriarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }

    public NinjaModel UpdateNinjasId(Long id, NinjaModel ninjaAtt){
        if(ninjaRepository.existsById(id)){
            ninjaRepository.save(ninjaAtt);
        }
        return null;
    }
}
