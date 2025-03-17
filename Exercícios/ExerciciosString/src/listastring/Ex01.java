package listastring;

import java.util.Scanner;


/*
Criar um programa que leia um nome e retorne a quantidade de letras desse nome 
e o nome em  maiúsculo
*/
public class Ex01 {
    public static void main(String[] args) {
        System.out.print("Escreva o seu nome: ");
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        System.out.print("Seu nome em maiusculo: ");
        System.out.println(nome.toUpperCase());
    }
    
}
