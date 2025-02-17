package hu.ruander.alakzatok;

public class Gomb extends FemAlakzat {
    private double r;

    public Gomb(double r) {
        super();
        this.r = r;
    }

    public double terfogat() {
        return (4 * Math.pow(r, 3) * Math.PI) / 3;
    }
}
