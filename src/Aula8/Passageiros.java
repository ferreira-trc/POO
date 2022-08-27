package Aula8;

import java.util.ArrayList;

public  class Passageiros extends Pesados {
    
    private int nMaxPassageiros;

    public Passageiros(String matricula, String marca, String modelo, double cilindrada, int numQuadro,int peso, int nMaxPassageiros){
        super(matricula, marca, modelo, cilindrada, numQuadro, peso);
        this.nMaxPassageiros=nMaxPassageiros;
    }


    public Passageiros(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, int numQuadro, int peso, int nMaxPassageiros){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro, peso);
        this.nMaxPassageiros=nMaxPassageiros;
    }

    public int getnMaxPassageiros() {
        return nMaxPassageiros;
    }
}
