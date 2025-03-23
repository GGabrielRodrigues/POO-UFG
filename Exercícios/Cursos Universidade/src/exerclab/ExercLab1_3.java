//ExercLab 1_3
package exerclab;

import java.util.Scanner;

public class ExercLab1_3 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //Leitura de quantidade de cursos e inicialização do vetor
        System.out.println("Quantos cursos deseja cadastrar?");
        int n = leitor.nextInt();
        Curso cursos[] = new Curso[n];
        int i;
        for (i = 0; i < n; i++)
            cursos[i] = new Curso();
        //
        
        //Leitura dos cursos de acordo com 'n'
        for (i = 0; i < n; i++)
        {
            System.out.println("Leitura do curso " + (i+1) + ":");
            cursos[i].leCurso(cursos[i].nome, cursos[i].turno, cursos[i].areaAtuacao,
                    cursos[i].dataCriacao);
        }
        //
   
        //Impressão dos dados dos cursos
        for (i = 0; i < n; i++)
            cursos[i].imprimeCurso();
        //
    }
}
