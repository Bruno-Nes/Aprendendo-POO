package projetolivro;

public class ProjetoLivro {
    public static void main(String[] args) {
        //Exercicio prático para exercitar os conceitos de encapsulamento
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Pedro","Souza", 22, 'M');
        p[1] = new Pessoa("Maria","Clara", 27, 'F');

        l[0] = new Livro("Arsene Lupin", "Maurice Leblanc", 235, p[1]);
        l[1] = new Livro("Computacao em nuvem", "Brian J.S e Curtis Franklin", 220, p[0]);

        l[1].abrir();
        l[1].folhear(218);
        l[1].voltarPag();
        System.out.println(l[1].detalhes());

    }
}
