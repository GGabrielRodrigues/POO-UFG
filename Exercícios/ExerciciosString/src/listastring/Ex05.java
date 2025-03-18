package listastring;

/*
Criar um programa que retorne um número aleatório entre 0 e 100
*/

public class Ex05 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        System.out.println("Numero aleatorio entre 0 e 100: " + random);
    }
}
