
package listastring;

import java.util.Scanner;

/*
Crie um programa que leia um número e retorne o seu quadrado e a sua raiz
*/
public class Ex06 {
    public static void main(String[] args) {
        //Leitura do inteiro
            Scanner leitor = new Scanner(System.in);
            System.out.print("Insira o seu numero: ");
            int numero = leitor.nextInt();
        //
        
        //Retorno do quadrado e da raiz
            System.out.println("Quadrado: " + Math.pow(numero, 2));
            System.out.println("Raiz: " + Math.sqrt(numero));
        //
    }
}
