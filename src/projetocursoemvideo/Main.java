package projetocursoemvideo;

public class Main {
    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] =  new Video("Curso POO");
        v[1] =  new Video("Curso POO Parte 2");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Rogerio", 17, "M", "Rog123");
        g[1] = new Gafanhoto("Lucas", 26, "M", "Lobogawa");

        Visualizacao visu = new Visualizacao(g[1], v[0]);
        System.out.println(visu.toString());
    }
}
