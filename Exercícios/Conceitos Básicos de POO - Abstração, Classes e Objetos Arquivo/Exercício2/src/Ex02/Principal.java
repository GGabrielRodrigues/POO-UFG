package Ex02;

public class Principal {
    public static void main(String[] args) {
        Contatos contatoUm = new Contatos("Ana", "(62)986359630", 0, "ana@gmail.com" );
        Contatos contatoDois = new Contatos("Joao", "(62)982339630", 0, "joao@gmail.com" );
        Contatos contatoTres = new Contatos("Marcelo", "(62)986129630", 0, "marcelo@gmail.com" );
        
        System.out.println(contatoUm);
        System.out.println(contatoDois);
        System.out.println(contatoTres);
    }
}
