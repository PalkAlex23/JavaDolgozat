package hu.ruander;

import hu.ruander.alakzatok.FemAlakzat;
import hu.ruander.alakzatok.Gomb;
import hu.ruander.alakzatok.Hasab;

import java.util.ArrayList;

public class FemAlakzatokProgram {

    private ArrayList<FemAlakzat> lista;

    public void ujAlakzat(FemAlakzat femalakzat) {
        lista.add(femalakzat);
    }

    public double osszSuly() {
        return 0;
    }

    public double gombokOsszSuly() {
        return 0;
    }

    public Hasab minV() {
        return new Hasab(1.0, 1.0, 1.0);
    }

    public Gomb maxV() {
        return new Gomb(2);
    }

    public ArrayList<FemAlakzat> getLista() {
        return lista;
    }
}
