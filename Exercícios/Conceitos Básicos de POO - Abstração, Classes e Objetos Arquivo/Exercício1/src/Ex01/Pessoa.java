package Ex01;

public class Pessoa {
    String nome;
    int idade;
    int sexo; //Masculino = 1, Feminino = 0
    String telefone;
    
    public void retornaDados()
    {
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " 
                + sexo + "\nTelefone: " + telefone + "\n\n");
    }
}


