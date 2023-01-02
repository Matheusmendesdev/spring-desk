package br.matheusdev.springdesk.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente extends Pessoa{

    @OneToMany(mappedBy = "cliente")
    List<Chamados> chamados = new ArrayList<>();

    public Cliente(){}

    public List<Chamados> getChamados() {
        return chamados;
    }

    public void setChamadosCliente(List<Chamados> chamados) {
        this.chamados = chamados;
    }
}
