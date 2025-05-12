package prova1;

public class Palestra {
    // a) Atributos
    private String nome;
    private String data;
    private String horaInicial;
    private String horaFinal;
    private String comentario;
    // a) Relacionamento com Evento (Agregação - lado da parte, aponta para 1 Evento)
    private Evento evento; // Referência ao evento ao qual pertence

    // d) Construtor inicializando nome e data
    public Palestra(String nome, String data) {
        this.nome = nome;
        this.data = data;
        this.evento = null; // Uma palestra começa sem evento definido
    }

    // f) Métodos de acesso (Getters e Setters para os demais atributos)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicial() {
        return horaInicial;
    }

    public void setHoraInicial(String horaInicial) {
        this.horaInicial = horaInicial;
    }

    public String getHoraFinal() {
        return horaFinal;
    }

    public void setHoraFinal(String horaFinal) {
        this.horaFinal = horaFinal;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Evento getEvento() {
        return evento;
    }

    // Setter para o evento - geralmente chamado pelo método adicionarPalestra de Evento
    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    // g) Método toString
    @Override
    public String toString() {
        return "Palestra {" +
               "\n    nome = '" + nome + '\'' +
               ",\n    data = '" + data + '\'' +
               ",\n    horaInicial = '" + horaInicial + '\'' +
               ",\n    horaFinal = '" + horaFinal + '\'' +
               ",\n    comentario = '" + comentario + '\'' +
               "\n  }";
    }
}