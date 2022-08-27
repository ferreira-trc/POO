package Aula8;

import java.util.ArrayList;

public class Motociclo extends Viaturas {

    private String tipo;


    public Motociclo(String matricula, String marca, String modelo, double cilindrada, String tipo){
        super(matricula, marca, modelo, cilindrada);
        this.tipo=tipo;
        assert(tipo.equalsIgnoreCase("desportivo") || tipo.equalsIgnoreCase("estrada")):"Tipo invalido!";
    }
    
    public Motociclo(String matricula, String marca, String modelo, double cilindrada, ArrayList<Integer> kms, String tipo ){
        super(matricula, marca, modelo, cilindrada, kms);
        this.tipo=tipo;
        assert(tipo.equalsIgnoreCase("desportivo") || tipo.equalsIgnoreCase("estrada")):"Tipo invalido!";
    }

    public String getTipo() {
        return tipo;
    }

   
   
    


}
