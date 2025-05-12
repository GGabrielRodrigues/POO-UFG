
package prova1;

// e) Classe especializada EventoPatrocinado
public class EventoPatrocinado extends Evento { // Herda de Evento
    private String nomePatrocinador;
    private double valor;

    // e) Construtor que inicializa nome do patrocinador e valor (e descrição do evento pai)
    public EventoPatrocinado(String descricao, String nomePatrocinador, double valor) {
        super(descricao); // Chama o construtor da superclasse (Evento)
        this.nomePatrocinador = nomePatrocinador;
        this.valor = valor;
    }

    // e) Construtor que inicializa nome do patrocinador (e descrição) e valor padrão 0.00
    public EventoPatrocinado(String descricao, String nomePatrocinador) {
        super(descricao); // Chama o construtor da superclasse (Evento)
        this.nomePatrocinador = nomePatrocinador;
        this.valor = 0.0; // Valor padrão
    }

    // f) Métodos de acesso para os novos atributos
    public String getNomePatrocinador() {
        return nomePatrocinador;
    }

    public void setNomePatrocinador(String nomePatrocinador) {
        this.nomePatrocinador = nomePatrocinador;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // g) Método toString (sobrescrevendo e adicionando informações)
    @Override
    public String toString() {
        String infoBase = super.toString().substring(0, super.toString().length() - 2); // Remove o '}' final

        return infoBase + // Informações do Evento
               ",\n  tipo = 'Patrocinado'" +
               ",\n  nomePatrocinador = '" + nomePatrocinador + '\'' +
               ",\n  valor = " + String.format("%.2f", valor) + // Formata o valor
               "\n}";
    }
}






