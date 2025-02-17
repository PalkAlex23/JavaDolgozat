package hu.ruander.alakzatok;

public class Hasab extends FemAlakzat {

    private int a, b, m;
    private double d, d1, d2;

    public Hasab(int a, int b, int m) {
        this((double) a, (double) b, (double) m);
    }

    public Hasab(double d, double d1, double d2) {
        super();
        this.d = d;
        this.d1 = d1;
        this.d2 = d2;
    }

    public double terfogat() {
        return a*b*m;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getM() {
        return m;
    }
}
