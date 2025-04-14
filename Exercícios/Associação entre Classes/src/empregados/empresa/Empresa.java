package empregados.empresa;

public class Empresa 
{
    String cnpj;
    String razaoSocial;
    Endereço endereço;

    Empresa(String cnpj, String razaoSocial, Endereço endereço)
    {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.endereço = endereço;               
    }
    
    public String toString()
    {
     return "Empresa{" +
                "CNPJ='" + cnpj + '\'' +
                ", Razao Social='" + razaoSocial + '\'' +
                ", Endereco='" + endereço + '\'' +     
                '}';    
    }
}