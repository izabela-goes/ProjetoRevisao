package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Squad {

        @Id
        private int Id;
        private String Nome;
        private int QtdPessoas;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getQtdPessoas() {
        return QtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        QtdPessoas = qtdPessoas;
    }
}
