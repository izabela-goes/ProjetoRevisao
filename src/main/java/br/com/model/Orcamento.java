package br.com.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orcamento {

        @Id
        private int Id;
        private String DtInicio;
        private String DtFim;
        private int QtdDias;
        private String Descricao;
        private String Titulo;
        private Modulo Modulo;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getDtInicio() {
        return DtInicio;
    }

    public void setDtInicio(String dtInicio) {
        DtInicio = dtInicio;
    }

    public String getDtFim() {
        return DtFim;
    }

    public void setDtFim(String dtFim) {
        DtFim = dtFim;
    }

    public int getQtdDias() {
        return QtdDias;
    }

    public void setQtdDias(int qtdDias) {
        QtdDias = qtdDias;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public br.com.model.Modulo getModulo() {
        return Modulo;
    }

    public void setModulo(br.com.model.Modulo modulo) {
        Modulo = modulo;
    }
}

