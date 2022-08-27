package Aula8;

import java.util.ArrayList;

public class Pesados extends Automovel {
    
    private int peso;

    public Pesados(String matricula, String marca, String modelo, double cilindrada, int numQuadro, int peso){
        super(matricula, marca, modelo, cilindrada, numQuadro);
        this.peso=peso;
        assert(peso>3500):"peso invalido!";
    }


    public Pesados(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, int numQuadro, int peso){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro);
        this.peso=peso;
        assert(peso>3500):"peso invalido!";
    }

    public int getPeso() {
        return peso;
    }

    

}
