
package listastring;

import java.util.Scanner;

/*
Criar um programa que leia 2 valores e mostre a soma, a subtração, a multiplicação e a divisão 
entre eles. (A+B, A-B, A*B, A/B)
*/
public class Ex07 {
    public static void main(String[] args) {
        //Leitura dos números
            Scanner leitor = new Scanner(System.in);
            System.out.print("Insira o primeiro numero: ");
            int num1 = leitor.nextInt();
            System.out.print("Insira o segundo numero: ");
            int num2 = leitor.nextInt();
        //
        
        //Impressão
            System.out.println("Soma: " + (num1+num2) +
                    "\nSubtracao: " + (num1-num2) +
                    "\nMultiplicacao: " + (num1*num2) + "\nDivisao: " + (num1/num2));
        //
    }
}
