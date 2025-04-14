package clientes;

public class Cliente {
    String nome;
    String cpf;
    Endereço endereço;
    
    Cliente(String nome, String cpf, Endereço endereço)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.endereço = endereço;
    }
    
    public String toString()
    {
     return "Cliente{" +
                "Nome='" + nome + '\'' +
                ", CPF='" + cpf + '\'' +
                ", Endereço='" + endereço + '\'' +   
                '}';    
    }
}
