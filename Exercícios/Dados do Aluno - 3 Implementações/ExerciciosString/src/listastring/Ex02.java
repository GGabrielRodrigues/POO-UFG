package listastring;

import java.util.Scanner;

/*
Criar um programa que leia um nome e use todos os métodos mostrados na teoria
*/


public class Ex02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = leitor.nextLine();
        //Aplicação dos métodos:
            //equals()
            System.out.println("equals(Jairo): " + nome.equals("Jairo"));
            //
            
            //equalsIgnoreCase()
            System.out.println("equalsIgnoreCase(c): "
                    + nome.equalsIgnoreCase("c"));            
            //
            
            //length()
            System.out.println("lenght(): " + nome.length());
            //
            
            //chatAt()
            System.out.println("charAt(3): " + nome.charAt(3));
            //
            
            //substring()
            System.out.println("substring(2, 4): " + nome.substring(2,4));
            //
            
            //toUpperCase()
            System.out.println("toUpperCase(): " + nome.toUpperCase());
            //
            
            //toLowerCase()
            System.out.println("toLowerCase(): " + nome.toLowerCase());
            //
            
            //trim()
            System.out.println("trim(): " + nome.trim());
            //
            
            //replace()
            System.out.println("replace(a, b): " +
            nome.replace("a", "b"));
            //
            
            //indexOf()
            System.out.println("indexOf(a): " + nome.indexOf("a"));            
            //
            
            //lastIndexOf()
            System.out.println("lastIndexOf(b): " + nome.lastIndexOf("b"));            
            //
        //
    }
}
