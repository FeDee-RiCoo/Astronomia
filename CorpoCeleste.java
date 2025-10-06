package Astronomia;

public abstract class CorpoCeleste {
    protected String nome;
    protected double distanzaStella, massa, raggio;

    public CorpoCeleste(String nome, double distanzaStella, double massa, double raggio) {
        this.nome = nome;
        this.distanzaStella = distanzaStella;
        this.massa = massa;
        this.raggio = raggio;
    }

    public String getNome() {
        return nome;
    }

    public double getDistanzaStella() {
        return distanzaStella;
    }

    public final double getGravita(){
        return 9.81* this.massa  / Math.pow(raggio,2);
    }

}
