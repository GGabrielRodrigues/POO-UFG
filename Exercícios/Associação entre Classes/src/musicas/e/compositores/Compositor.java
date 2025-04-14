package musicas.e.compositores;

public class Compositor 
{
    String nome;
    String nacionalidade;
    
    Compositor(String nome, String nacionalidade)
    {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }
    
    public String toString()
    {
     return "Compositor{" +
            "Nome='" + nome + '\'' +
            ", Nacionalidade='" + nacionalidade + '\'' +
            '}';    
    }
}
