package com.example.demo.Ninjas;

import com.example.demo.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table(name="tb_cadastro")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
    private String nome;
    private String email;
    private int idade;
    //varios Ninjas para uma missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

    public MissoesModel getMissoes() {
        return missoes;
    }

    public void setMissoes(MissoesModel missoes) {
        this.missoes = missoes;
    }

    public NinjaModel() {
    }

    public NinjaModel(String email, int idade, String nome) {
        this.email = email;
        this.idade = idade;
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
