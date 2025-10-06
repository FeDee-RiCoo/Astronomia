package Astronomia;

public class Pianeta extends CorpoCeleste {

    public Pianeta(String nome, double distanzaStella, double massa, double raggio) {
        super(nome, distanzaStella, massa, raggio);

    }

    public double getPeriodo(double massaStella) {
        double G = 6.67430e-11; // gravitational constant in m^3 kg^-1 s^-2
        double p = 2 * Math.PI * Math.sqrt(Math.pow(this.distanzaStella, 3) / (G * massaStella));

        return p / 3600 / 24; // converting seconds to days
    }
}