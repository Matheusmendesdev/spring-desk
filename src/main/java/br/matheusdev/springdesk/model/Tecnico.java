package br.matheusdev.springdesk.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tecnico extends Pessoa{

    @OneToMany(mappedBy = "tecnico")
    private List<Chamados> chamados = new ArrayList<>();

    public Tecnico(){}

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamados(List<Chamados> chamados) {
        this.chamados = chamados;
    }
}
