
package Ex02;


public class Contatos {
    String nome;
    String telefone;
    int sexo;
    String email;
    
    public Contatos(String nome, String telefone, int sexo, String email)
    {
    this.nome = nome;
    this.telefone = telefone;
    this.sexo = sexo;
    this.email = email;
    }
    
    public String toString() {
        return "Contato: " +
                "Nome='" + nome + '\'' +
                ", Telefone='" + telefone + '\'' +
                ", Sexo='" + sexo + '\'' +
                ", Email='" + email + '\'' +
                '}';
    }
    
    
}

