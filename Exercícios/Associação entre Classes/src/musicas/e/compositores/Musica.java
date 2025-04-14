package musicas.e.compositores;

public class Musica 
{
    String nome;
    String ano;
    String tipo;
    Compositor compositor;
    
    Musica(String nome, String ano, String tipo, Compositor compositor)
    {
        this.nome = nome;
        this.ano = ano;
        this.tipo = tipo;
        this.compositor = compositor;
        
    }
    
    public String toString()
    {
     return "Musica{" +
                "Nome='" + nome + '\'' +
                ", Ano='" + ano + '\'' +
                ", Tipo='" + tipo + '\'' +
                ", Nome do compositor='" + compositor.nome + '\'' +
                ", Nacionalidade do compositor='" + compositor.nacionalidade + '\'' +
                '}';    
    }
}


