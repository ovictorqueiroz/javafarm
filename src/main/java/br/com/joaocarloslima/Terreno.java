package br.com.joaocarloslima;

public class Terreno {
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;
    private int x;
    private int y;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void plantar(Batata batata){ this.batata = batata; };
    public void plantar(Cenoura cenoura){this.cenoura = cenoura;};
    public void plantar(Morango morango){this.morango = morango;};

    public boolean estaOcupado(){
        if((morango != null) || (batata != null) || (cenoura != null)){return  true;}
        else return false;
    }


}
