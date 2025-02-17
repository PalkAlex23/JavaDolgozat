package hu.ruander.alakzatok;

public abstract class FemAlakzat {
    private static double fajsuly;

    public abstract double terfogat();

    public FemAlakzat() {
        fajsuly = 1.15;
    }

    public static double getFajsuly() {
        return fajsuly;
    }
//
//    public double suly() {
//    }
}
