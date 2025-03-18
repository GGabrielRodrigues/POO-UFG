package listastring;

import java.util.Scanner;

/*
Crie um programa que leia dois números e retorne o maior e o menor
*/

public class Ex04 {
    public static void main(String[] args) {
        //Leitura dos números
            Scanner leitor = new Scanner(System.in);
            System.out.print("Insira o primeiro numero: ");
            int num1 = leitor.nextInt();
            System.out.print("Insira o segundo numero: ");
            int num2 = leitor.nextInt();
        //
        
        //Retorno do maior e menor
            System.out.println("Maior: " + Math.max(num1, num2) + "\nMenor: " + Math.min(num1, num2));
        //
    }
}
