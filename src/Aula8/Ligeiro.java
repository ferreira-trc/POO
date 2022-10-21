package Aula8;

import java.util.ArrayList;

public class Ligeiro extends Automovel {
    
    private Integer capBag;

    public Ligeiro(String matricula, String marca, String modelo, Double cilindrada, Integer numQuadro, Integer capBag){
        super(matricula, marca, modelo, cilindrada, numQuadro);
        this.capBag=capBag;
        assert(capBag > 0): "Capacidade invalida";
    }


    public Ligeiro(String matricula, String marca, String modelo, Double cilindrada, ArrayList<Integer> kms, Integer numQuadro, Integer capBag){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro);
        this.capBag=capBag;
        assert(capBag > 0): "Capacidade invalida";
    }

    public int getCapBag() {
        return capBag;
    }
}
