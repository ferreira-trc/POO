package Aula8;

import java.util.ArrayList;

public abstract class Viaturas implements KmPercorridosInterface{

    private String matricula;
    private String marca;
    private String modelo;
    private Double cilindrada;
    private ArrayList<Integer> kms;
    private Boolean disp;

    public Viaturas(String matricula, String marca, String modelo, Double cilindrada){
        this.matricula=matricula;
        assert(matricula.length() != 6):"matricula invalida!";
        this.marca=marca;
        this.modelo=modelo;
        this.cilindrada=cilindrada;
        assert(cilindrada>0 && cilindrada<10):"cilindrada invalida!";
        kms=null;
        disp=true;
    }

    public Viaturas(String matricula, String marca, String modelo, Double cilindrada, ArrayList<Integer> kms ){
        this.matricula=matricula;
        assert(matricula.length() == 6):"matricula invalida!";
        this.marca=marca;
        this.modelo=modelo;
        this.cilindrada=cilindrada;
        assert(cilindrada>0 && cilindrada<10):"cilindrada invalida!";
        this.kms=kms;
        disp=true;
    }



    public String getMatricula() {
        return matricula;
    }   

    public String getMarca() {
        return marca;
    }
    
    public String getModelo() {
        return modelo;
    }
        
    public double getCilindrada() {
        return cilindrada;
    }

    private ArrayList<Integer> getKms() {
        return kms;
    }

    public boolean getDisp() {
        return disp;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada=cilindrada;
    }

    public void setDisp( boolean disp) {
        this.disp=disp;
    }

    private void addKms(int quilometros) {
        kms.add(quilometros);
    }
    

    public boolean equals(Object o) {
        if (o == null) {
            return false;
        } if (o.getClass() == Viaturas.class) {
            return true;
        } else {
            return false;
        }
    }


    @Override
    public final void trajeto(int quilometros) {
        addKms(quilometros);;        
    }

    @Override
    public final int ultimoTrajeto() {

        int index = getKms().size()-1;

        return getKms().get(index);
    }

    @Override
    public final int distanciaTotal() {
        int sum = 0;

        for (int index = 0; index < getKms().size(); index++) {
            sum+= getKms().get(index);
        }
        return sum;
    }


}