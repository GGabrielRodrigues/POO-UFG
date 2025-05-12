package prova1;

import java.util.ArrayList;
import java.util.List;

public class Evento {
    // a) Atributos
    private String descricao;
    private String dataInicio;
    private String dataFim;
    // a) Relacionamento com Palestra (Agregação 1 -> 0..*)
    protected List<Palestra> palestras; // protected para ser acessível pela subclasse

    // c) Construtor inicializando descrição
    public Evento(String descricao) {
        this.descricao = descricao;
        this.palestras = new ArrayList<>(); // Inicializa a lista de palestras
    }

    // f) Métodos de acesso (Getters e Setters para os demais atributos)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public List<Palestra> getPalestras() {
        return palestras;
    }

    // h) Método para adicionar uma palestra a um evento
    public void adicionarPalestra(Palestra palestra) {
        if (palestra != null && !this.palestras.contains(palestra)) {
            // Verifica se a palestra já não pertence a outro evento (Regra da Multiplicidade 1)
            if (palestra.getEvento() == null) {
                this.palestras.add(palestra);
                palestra.setEvento(this);
            } else { //Tratamento de erro
                 System.err.println("AVISO: A palestra '" + palestra.getNome() + "' já pertence ao evento '" + palestra.getEvento().getDescricao() + "'. Não foi adicionada.");
            }
        }
    }

    // g) Método toString
    @Override
    public String toString() {
        return "Evento {" +
               " descricao='" + descricao + '\'' +
               ", dataInicio='" + dataInicio + '\'' +
               ", dataFim='" + dataFim + '\'' +
               ", numPalestras=" + (palestras != null ? palestras.size() : 0) + // Mostra a quantidade
               " }";
    }
}


