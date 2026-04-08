package br.com.joaocarloslima;

public class Morango {
    private int tamanho;
    private  int tempoDeVida;
    private int tempoDeCrescimento;

    public Morango(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = 1;
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = tempoDeCrescimento;
    }


    public boolean podeColher(){
        if (tamanho == 4){return true;}
        return false;
    }

    public String getImagem(){
        return "images/morango" + tamanho + ".png";
    }

}
