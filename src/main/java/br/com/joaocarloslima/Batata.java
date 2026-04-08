package br.com.joaocarloslima;

public class Batata {
    private int tamanho = 1;
    private int tempoDeVida = 0;
    private int tempoDeCrescimento = 6;


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
        return "images/batata" + tamanho + ".png";
    }

}
