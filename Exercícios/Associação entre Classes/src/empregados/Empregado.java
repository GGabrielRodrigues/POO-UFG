package empregados;

public class Empregado 
{
    String nome;
    String matricula;
    Empresa empresa;

    Empregado(String nome, String matricula, Empresa empresa)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.empresa = empresa;
    }
    
    public String toString()
    {
     return "Empregado{" +
                "Nome='" + nome + '\'' +
                ", Matricula='" + matricula + '\'' +
                ", Empresa='" + empresa + '\'' +     
                '}';    
    }
}
