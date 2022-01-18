package encapsulameto;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        fighter f[] = new fighter[6];

        f[0] = new fighter("Pretty Boy", "França", 31, 1.75f, 68.9f, 11, 2, 1);
        f[1] = new fighter("Putscript", "Brasil", 22, 1.68f, 57.8f, 14, 2, 3);
        f[2] = new fighter("Snapshadow", "Eua", 29, 1.65f, 80.9f, 12, 2, 1);
        f[3] = new fighter("Dead Code", "Espanha", 26, 1.93f, 81.6f, 13, 0, 2);
        f[4] = new fighter("UFOcobol", "Japão", 33, 1.70f, 119.3f, 5, 4, 3);
        f[5] = new fighter("Nerdaart", "Australia", 25, 1.81f, 105.7f, 12, 2, 4);

        Fight UEC01 = new Fight();
        UEC01.marcarLuta(f[0], f[1]);
    }
}
