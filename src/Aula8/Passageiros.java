package Aula8;

import java.util.ArrayList;

public  class Passageiros extends Pesados {
    
    private Integer nMaxPassageiros;

    public Passageiros(String matricula, String marca, String modelo, Double cilindrada, Integer numQuadro, Integer peso, Integer nMaxPassageiros){
        super(matricula, marca, modelo, cilindrada, numQuadro, peso);
        this.nMaxPassageiros=nMaxPassageiros;
    }


    public Passageiros(String matricula, String marca, String modelo, Double cilindrada, ArrayList<Integer> kms, Integer numQuadro, Integer peso, Integer nMaxPassageiros){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro, peso);
        this.nMaxPassageiros=nMaxPassageiros;
    }

    public int getnMaxPassageiros() {
        return nMaxPassageiros;
    }
}
