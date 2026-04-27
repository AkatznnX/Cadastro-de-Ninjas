package com.example.demo.Ninjas;

import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {
 public NinjaModel map(NinjaDTO ninjaDTO){
     NinjaModel ninjaModel = new NinjaModel();
     ninjaModel.setId(ninjaDTO.getId());
     ninjaModel.setNome(ninjaDTO.getNome());
     ninjaModel.setEmail(ninjaDTO.getEmail());
     ninjaModel.setIdade(ninjaDTO.getIdade());
     ninjaModel.setMissoes(ninjaDTO.getMissoes());
     ninjaModel.setRank(ninjaModel.getRank());
     return ninjaModel;
 }

 public NinjaDTO map(NinjaModel ninjaModel){
     NinjaDTO ninjaDTO = new NinjaDTO();
     ninjaDTO.setEmail(ninjaModel.getEmail());
     ninjaDTO.setId(ninjaModel.getId());
     ninjaDTO.setNome(ninjaModel.getNome());
     ninjaDTO.setMissoes(ninjaModel.getMissoes());
     ninjaDTO.setIdade(ninjaModel.getIdade());
     ninjaDTO.setRank(ninjaModel.getRank());
     return ninjaDTO;
 }
}
