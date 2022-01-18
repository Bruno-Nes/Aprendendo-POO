package projetopessoas;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista, pagamento realizado");
    }
}
