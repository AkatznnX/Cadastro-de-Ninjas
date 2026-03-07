package com.example.demo.Ninjas;

import com.example.demo.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private Long id;
    private String nome;
    private String email;
    private int idade;
    private String rank;
    private MissoesModel missoes;

}
