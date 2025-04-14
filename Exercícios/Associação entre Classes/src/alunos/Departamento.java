
package alunos;

public class Departamento {
    String nome;
    String sigla;
    
    Departamento(String nome, String sigla)
    {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public String toString()
    {
     return "Departamento{" +
                "Nome='" + nome + '\'' +
                ", Sigla='" + sigla + '\'' +
                '}';    
    }
}
