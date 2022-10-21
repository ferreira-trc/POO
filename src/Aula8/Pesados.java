package Aula8;

import java.util.ArrayList;

public class Pesados extends Automovel {
    
    private Integer peso;

    public Pesados(String matricula, String marca, String modelo, Double cilindrada, Integer numQuadro, Integer peso){
        super(matricula, marca, modelo, cilindrada, numQuadro);
        this.peso=peso;
        assert(peso>3500):"peso invalido!";
    }


    public Pesados(String matricula, String marca, String modelo, Double cilindrada, ArrayList<Integer> kms, Integer numQuadro, Integer peso){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro);
        this.peso=peso;
        assert(peso>3500):"peso invalido!";
    }

    public int getPeso() {
        return peso;
    }

    

}
