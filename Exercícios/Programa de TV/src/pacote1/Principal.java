//Gabriel Rodrigues da SIlva 202403072

package pacote1;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<ProgramaTV> programas = new ArrayList<ProgramaTV>();
        
        ProgramaTV p = new ProgramaTV("O outro lado do paraíso", "Novela");
        p.setDiretor(new Pessoa("Diretor 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 1", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 2", "Brasileiro"));
        programas.add(p);
        
        p = new ProgramaTV("Orgulho e Paixão", "Novela");
        p.setDiretor(new Pessoa("Diretor 2", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 3", "Brasileiro"));
        p.setArtistas(new Pessoa("Artista 4", "Brasileiro"));
        programas.add(p);
        
        p = new ProgramaTV("Marley e eu","Filme");
	p.diretor = new Pessoa("Diretor 3", "Brasileiro");
	p.setArtistas(new Pessoa("Artista 5", "Brasileiro"));
	p.setArtistas(new Pessoa("Artista 6", "Brasileiro"));
	programas.add(p);
		
	p = new ProgramaTV("Show Ivete Sangalo","Show");
	p.diretor = new Pessoa("Diretor 4", "Brasileiro");
	p.setArtistas(new Pessoa("Artista 7", "Brasileiro"));
	p.setArtistas(new Pessoa("Artista 8", "Brasileiro"));
	programas.add(p);

        for (int i=0;i<programas.size();i++) {
			System.out.println(programas.get(i));
		}
    }
}
