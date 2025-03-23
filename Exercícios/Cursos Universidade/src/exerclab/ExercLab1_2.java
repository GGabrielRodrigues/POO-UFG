//ExercLab 1_2
package exerclab;

import java.util.Scanner;

public class ExercLab1_2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Leitura do primeiro curso
        System.out.println("Insira os dados do primeiro curso:");
        Curso primeiroCurso = new Curso();
        primeiroCurso.leCurso(primeiroCurso.nome, primeiroCurso.turno,
                primeiroCurso.areaAtuacao, primeiroCurso.dataCriacao);
        //
        
        //Leitura do segundo curso
        System.out.println("Insira os dados do segundo curso:");
        Curso segundoCurso = new Curso();
        segundoCurso.leCurso(segundoCurso.nome, segundoCurso.turno,
                segundoCurso.areaAtuacao, segundoCurso.dataCriacao);
        //
      
        //Leitura do terceiro curso
        System.out.println("Insira os dados do terceiro curso:");
        Curso terceiroCurso = new Curso();
        terceiroCurso.leCurso(terceiroCurso.nome, terceiroCurso.turno,
                terceiroCurso.areaAtuacao, terceiroCurso.dataCriacao);
        //
    
        //Leitura do quarto curso
        System.out.println("Insira os dados do quarto curso:");
        Curso quartoCurso = new Curso();
        quartoCurso.leCurso(quartoCurso.nome, quartoCurso.turno,
                quartoCurso.areaAtuacao, quartoCurso.dataCriacao);
        //
        
        //Impressão dos cursos:
        primeiroCurso.imprimeCurso();
        segundoCurso.imprimeCurso();
        terceiroCurso.imprimeCurso();
        quartoCurso.imprimeCurso();
        //
    }
}
