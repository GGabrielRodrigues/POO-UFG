package Ex01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //Definição do scanner
        Scanner leitor = new Scanner(System.in);
        //
        
        //Objeto 1
        Pessoa pessoaUm = new Pessoa();
        System.out.print("Nome: ");
        pessoaUm.nome = leitor.nextLine();
        System.out.print("Idade: ");
        pessoaUm.idade = leitor.nextInt();
        System.out.print("Sexo: ");
        pessoaUm.sexo = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Telefone: ");
        pessoaUm.telefone = leitor.nextLine();
        //
        System.out.println("");
        //Objeto 2
        Pessoa pessoaDois = new Pessoa();
        System.out.print("Nome: ");
        pessoaDois.nome = leitor.nextLine();
        System.out.print("Idade: ");
        pessoaDois.idade = leitor.nextInt();
        System.out.print("Sexo: ");
        pessoaDois.sexo = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Telefone: ");
        pessoaDois.telefone = leitor.nextLine();
        //
        System.out.println("");
        //Objeto 3
        Pessoa pessoaTres = new Pessoa();
        System.out.print("Nome: ");
        pessoaTres.nome = leitor.nextLine();
        System.out.print("Idade: ");
        pessoaTres.idade = leitor.nextInt();
        System.out.print("Sexo: ");
        pessoaTres.sexo = leitor.nextInt();
        leitor.nextLine();
        System.out.print("Telefone: ");
        pessoaTres.telefone = leitor.nextLine();
        //
        System.out.println("");
        
        pessoaUm.retornaDados();
        pessoaDois.retornaDados();
        pessoaTres.retornaDados();
    }
}
