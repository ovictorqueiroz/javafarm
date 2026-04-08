package br.com.joaocarloslima;

public class Batata {
    private int tamanho;
    private  int tempoDeVida;
    private int tempoDeCrescimento;

    public Batata(int tamanho, int tempoDeVida, int tempoDeCrescimento) {
        this.tamanho = 1;
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = 6;
    }

    public void crescer(){
        tempoDeVida++;

        if(tempoDeCrescimento % tempoDeVida == 0){
            tamanho++;
        }
    }

    public boolean podeColher(){
        if (tamanho == 4){return true;}
        return false;
    }

    public String getImagem(){
        return "images/batata" + tamanho + ".png";
    }

}
