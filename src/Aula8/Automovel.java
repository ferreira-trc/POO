package Aula8;

import java.util.ArrayList;

public abstract class Automovel extends Viaturas  {

    private int numQuadro;

    public Automovel(String matricula, String marca, String modelo, double cilindrada, int numQuadro){
        super(matricula, marca, modelo, cilindrada);
        this.numQuadro=numQuadro;
        assert(numQuadro>0):"Nº de Quadro invalido!";
    }


    public Automovel(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, int numQuadro){
        super(matricula, marca, modelo, cilindrada, kms);
        this.numQuadro=numQuadro;
        assert(numQuadro>0):"Nº de Quadro invalido!";
    }

    public int getNumQuadro() {
        return numQuadro;
    }

    public void setNumQuadro(int numQuadro) {
        this.numQuadro=numQuadro;
    }

   

    
    
}
