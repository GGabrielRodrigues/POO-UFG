package listastring;

import java.util.Scanner;

/*
Criar um programa que leia um valor decimal e retorne esse valor arredondado usando os três 
métodos de arredondamento da classe Math
*/

public class Ex03 {
    public static void main(String[] args) {
        //Leitura do decimal
            Scanner leitor = new Scanner(System.in);
            System.out.print("Insira o seu decimal: ");
            float decimal = leitor.nextFloat();
        //
        
        //Métodos de arredondamento
            //Math.ceil()
                System.out.println("Math.ceil(" + decimal + "): "
                        + Math.ceil(decimal));
            //
            
            //Math.floor()
                System.out.println("Math.floor(" + decimal + "): "
                        + Math.floor(decimal));
            //
            
            //Math.floor()
                System.out.println("Math.round(" + decimal + "): "
                        + Math.round(decimal));
            //
        //
        
    }
}
