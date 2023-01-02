package br.matheusdev.springdesk.model;

import br.matheusdev.springdesk.enums.Prioridade;
import br.matheusdev.springdesk.enums.Status;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Chamados {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private LocalDate dataAbertura = LocalDate.now();
    private LocalDate dataFechamento = LocalDate.now();
    private Status status;
    private Prioridade prioridade;

    @ManyToOne
    @JoinColumn(name = "cliente_id_fk")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "tecnico_id_fk")
    private Tecnico tecnico;

    public Chamados(){}

    public Chamados(Integer id, String titulo, LocalDate dataAbertura, LocalDate dataFechamento, Status status, Prioridade prioridade) {
        this.id = id;
        this.titulo = titulo;
        this.dataAbertura = dataAbertura;
        this.dataFechamento = dataFechamento;
        this.status = status;
        this.prioridade = prioridade;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(LocalDate dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public LocalDate getDataFechamento() {
        return dataFechamento;
    }

    public void setDataFechamento(LocalDate dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
