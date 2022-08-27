package Aula8;

import java.util.ArrayList;

public class Mercadorias extends Pesados {
    
    private int cargaMax;

    public Mercadorias(String matricula, String marca, String modelo, double cilindrada, int numQuadro,int peso, int cargaMax){
        super(matricula, marca, modelo, cilindrada, numQuadro, peso);
        this.cargaMax=cargaMax;
        assert(cargaMax > 500):"Carga maxima invalida";
    }


    public Mercadorias(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, int numQuadro, int peso, int cargaMax){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro, peso);
        this.cargaMax=cargaMax;
        assert(cargaMax > 500):"Carga maxima invalida";
    }

    public int getCargaMax() {
        return cargaMax;
    }

    

}