package alunos;

public class Curso 
{
    String nome;
    String sigla;
    Departamento departamento;
    
    Curso(String nome, String sigla, Departamento departamento)
    {
        this.nome = nome;
        this.sigla = sigla;
        this.departamento = departamento;
    }
    
    public String toString()
    {
     return "Curso{" +
                "Nome='" + nome + '\'' +
                ", Sigla='" + sigla + '\'' +
                ", Departamento='" + departamento + '\'' +        
                '}';    
    }
}
