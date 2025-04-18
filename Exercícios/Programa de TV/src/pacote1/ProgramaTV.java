//Gabriel Rodrigues da SIlva 202403072

package pacote1;

import java.util.ArrayList;

public class ProgramaTV {
    //Criei esse atributo para fazer o atributo "código" ser sequencial
    private static int proximoCodigo = 1; // Então essa variável controla o próximo código a ser atribuído
    //
    
    int codigo;
    String nome;
    ArrayList<Pessoa> artistas = new ArrayList<Pessoa>();
    Pessoa diretor;
    String categoria;
    
    ProgramaTV(String nome, String categoria) {
        this.codigo = proximoCodigo++; // Atribui o próximo código e incrementa
        this.nome = nome;
        this.categoria = categoria;
    }
    
    void setDiretor(Pessoa diretor) {
        this.diretor = diretor;
    }
    
    void setArtistas(Pessoa artista) {
        artistas.add(artista);
    }
    
    public String toString() {
        String programa = codigo + "-" + nome + " (" + categoria + ")\n";
        programa = programa + "Diretor: " + diretor + "\n";
        programa = programa + "Artistas: \n";
        for (int i = 0; i < artistas.size(); i++) {
            programa = programa + artistas.get(i) + "\n";
        }
        return programa;
    }
}