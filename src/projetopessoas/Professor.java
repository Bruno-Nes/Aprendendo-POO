package projetopessoas;

public class Professor extends Pessoa{
    private char especialidade;
    private int salario;

    public double receberAumento(int porcen) {
        double aumento = (porcen / 100) * getSalario();
        return aumento;
    }

    public char getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(char especialidade) {
        this.especialidade = especialidade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
