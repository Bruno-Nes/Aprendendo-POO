package projetopessoas;

public class ProjetoPessoas {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        aluno.setNome("Cleiton");
        professor.setNome("Newton");
        funcionario.setNome("Claudia");

        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }
}
