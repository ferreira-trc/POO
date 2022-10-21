package Aula8;

import java.util.ArrayList;

public class Mercadorias extends Pesados {
    
    private Integer cargaMax;

    public Mercadorias(String matricula, String marca, String modelo, Double cilindrada, Integer numQuadro,Integer peso, Integer cargaMax){
        super(matricula, marca, modelo, cilindrada, numQuadro, peso);
        this.cargaMax=cargaMax;
        assert(cargaMax > 500):"Carga maxima invalida";
    }


    public Mercadorias(String matricula, String marca, String modelo, Double cilindrada, ArrayList<Integer> kms, Integer numQuadro, Integer peso, Integer cargaMax){
        super(matricula, marca, modelo, cilindrada, kms, numQuadro, peso);
        this.cargaMax=cargaMax;
        assert(cargaMax > 500):"Carga maxima invalida";
    }

    public int getCargaMax() {
        return cargaMax;
    }

    

}