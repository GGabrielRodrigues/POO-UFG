package alunos.cursos.e.departamentos;


public class Alunos {
    String nome;
    String matricula;
    String ano;
    Curso curso;
    
    Alunos(String nome, String matricula, String ano, Curso curso)
    {
        this.nome = nome;
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }
    
    public String toString()
    {
     return "Aluno{" +
                "Nome='" + nome + '\'' +
                ", Matricula='" + matricula + '\'' +
                ", Ano='" + ano + '\'' +
                ", Curso='" + curso + '\'' +                
                '}';    
    }
}
