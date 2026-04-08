package br.com.joaocarloslima;

public class Morango {
    private int tamanho = 1;
    private int tempoDeVida = 0;
    private int tempoDeCrescimento = 3;


    public void crescer() {
        tempoDeVida++;

        if (tempoDeCrescimento % tempoDeVida == 0) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        if (tamanho == 4) {
            return true;
        }
        return false;
    }

    public String getImagem() {
        return "images/morango" + tamanho + ".png";
    }

}
