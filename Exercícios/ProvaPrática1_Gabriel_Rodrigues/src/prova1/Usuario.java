package prova1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    // a) Atributos
    private String nome;
    private String email;
    private String senha;
    // a) Relacionamento com Evento (Associação 1 -> 0..*)
    private List<Evento> eventos;

    // b) Construtor inicializando todos os atributos
    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.eventos = new ArrayList<>(); // Inicializa a lista de eventos
    }

    // f) Métodos de acesso (Getters e Setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha; // Geralmente não se expõe a senha diretamente, mas seguindo o pedido
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Evento> getEventos() {
        return eventos; // Retorna uma cópia ou a própria lista
    }

    // Método para adicionar evento ao usuário (para implementar a associação)
    public void adicionarEvento(Evento evento) {
        if (evento != null && !this.eventos.contains(evento)) {
            this.eventos.add(evento);
        }
    }

    // g) Método toString
    @Override
    public String toString() {
        return "Usuario {" +
               " nome='" + nome + '\'' +
               ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
               ", eventosParticipados=" + (eventos != null ? eventos.size() : 0) + // Mostra a quantidade
               " }";
    }
}