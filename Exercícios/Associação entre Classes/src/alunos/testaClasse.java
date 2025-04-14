package alunos;

public class testaClasse 
{
    public static void main(String[] args) {
        Departamento INF = new Departamento("Instituto de Informatica", "INF");
        Curso ES = new Curso("Engenharia de Software", "ES", INF);
        Alunos gabriel = new Alunos("Gabriel Rodrigues", "202403072", "2024", ES);
        
        System.out.println(INF);
        System.out.println(ES);
        System.out.println(gabriel);
    }
}
