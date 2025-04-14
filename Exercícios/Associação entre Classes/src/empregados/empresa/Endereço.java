package empregados.empresa;

public class Endereço 
{
    String rua;
    int numero;
    String complemento;
    String cep;
    String bairro;
    String cidade;
    String estado;     
    
    Endereço(String rua, int numero, String complemento, String cep, String bairro,
            String cidade, String estado)
    {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.bairro = cep;
        this.cidade = cidade;
        this.estado = estado;
        
    }
    public String toString()
    {
     return "Endereco{" +
                "Rua='" + rua + '\'' +
                ", Numero='" + numero + '\'' +
                ", Complemento='" + complemento + '\'' +
                ", CEP='" + cep + '\'' +
                ", Bairro='" + bairro + '\'' +
                ", Cidade='" + cidade + '\'' +
                ", Estado='" + estado + '\'' +
                '}';    
    }
}
