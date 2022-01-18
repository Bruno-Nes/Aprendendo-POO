package encapsulameto;

import java.util.Random;

public class Fight {
    private fighter desafiado;
    private fighter desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(fighter f1, fighter f2) {
        if (f1.getCategoria().equals(f2.getCategoria())  && f1 != f2) {
            this.aprovada = true;
            this.desafiado = f1;
            this.desafiante = f2;
        }else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    public void lutar() {
        if (aprovada) {
            desafiante.apresentar();
            desafiado.apresentar();
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    desafiado.empateLuta();
                    desafiante.empateLuta();
                    break;
                case 1:
                    System.out.println(desafiado.getNome());
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println(desafiante.getNome());
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
            }
        }else {
            System.out.println("A luta não pode acontecer");
        }
    }

    public fighter getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(fighter desafiado) {
        this.desafiado = desafiado;
    }

    public fighter getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(fighter desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
