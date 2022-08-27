package Aula8;

import java.util.ArrayList;

public  class Taxi extends Ligeiro {

    private int nLicenca;
    
    public Taxi(String matricula, String marca, String modelo, double cilindrada, int numQuadro, int capBag, int nLicenca){
        super(matricula, marca, modelo, cilindrada, numQuadro, capBag);
        this.nLicenca=nLicenca;
        assert(nLicenca>0):"licença invalida!";
    }


    public Taxi(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, int numQuadro, int capBag, int nLicenca){
        super(matricula, marca, modelo, cilindrada, numQuadro, capBag);
        this.nLicenca=nLicenca;
        assert(nLicenca>0):"licença invalida!";
    }

    public int getNLiceca() {
        return nLicenca;
    }
}
