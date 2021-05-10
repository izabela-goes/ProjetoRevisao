package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Modulo {
        @Id
        private int Id;
        private Ambiente Ambiente;
        private Squad Squad;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public br.com.model.Ambiente getAmbiente() {
        return Ambiente;
    }

    public void setAmbiente(br.com.model.Ambiente ambiente) {
        Ambiente = ambiente;
    }

    public br.com.model.Squad getSquad() {
        return Squad;
    }

    public void setSquad(br.com.model.Squad squad) {
        Squad = squad;
    }
}
