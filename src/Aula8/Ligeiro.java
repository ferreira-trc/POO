package Aula8;

import java.util.ArrayList;

public class Ligeiro extends Automovel {
    
    private int capBag;

    public Ligeiro(String matricula, String marca, String modelo, double cilindrada, int numQuadro, int capBag){
        super(matricula, marca, modelo, cilindrada, numQuadro);
        this.capBag=capBag;
        assert(capBag > 0): "Capacidade invalida";
    }


    public Ligeiro(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, int numQuadro, int capBag){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro);
        this.capBag=capBag;
        assert(capBag > 0): "Capacidade invalida";
    }

    public int getCapBag() {
        return capBag;
    }
}
