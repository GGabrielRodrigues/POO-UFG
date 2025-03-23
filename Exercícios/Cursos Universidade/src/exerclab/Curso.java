//ExercLab 1_1

/*
O senhor não pediu, mas achei que seria melhor para o entendimento criar os métodos
"imprimeCurso" e "leCurso"
*/
package exerclab;

import java.util.Scanner;

public class Curso {
    String nome; //Nome do curso
    String turno; //Turno do curso (Matutino, Vespertino ou Noturno)
    String areaAtuacao; //Em que área o curso está presente (educação, saúde, informática e etc.)
    int dataCriacao; //Quando o curso foi criado.
    
    public void imprimeCurso()
    {
      System.out.println("\n\n------------------------------------------");
      System.out.printf("Nome do curso: %s\nTurno: %s\nArea de atuacao: %s\nData de criacao: %d\n", nome, turno, areaAtuacao, dataCriacao);
      System.out.println("------------------------------------------");
    }
    
    public void leCurso(String nome, String turno, String areaAtuacao, int dataCriacao)
    {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Nome: ");
        this.nome = leitor.nextLine();
        System.out.print("Turno: ");
        this.turno = leitor.nextLine();
        System.out.print("Area de atuacao: ");
        this.areaAtuacao = leitor.nextLine();
        System.out.print("Data de criacao: ");
        this.dataCriacao = leitor.nextInt();
    }
}
