package Aula8;

import java.util.ArrayList;

public  class Taxi extends Ligeiro {

    private Integer nLicenca;
    
    public Taxi(String matricula, String marca, String modelo, Double cilindrada, Integer numQuadro, Integer capBag, Integer nLicenca){
        super(matricula, marca, modelo, cilindrada, numQuadro, capBag);
        this.nLicenca=nLicenca;
        assert(nLicenca>0):"licença invalida!";
    }


    public Taxi(String matricula, String marca, String modelo, Double cilindrada, ArrayList<Integer> kms, Integer numQuadro, Integer capBag, Integer nLicenca){
        super(matricula, marca, modelo, cilindrada, numQuadro, capBag);
        this.nLicenca=nLicenca;
        assert(nLicenca>0):"licença invalida!";
    }

    public int getNLiceca() {
        return nLicenca;
    }
}
