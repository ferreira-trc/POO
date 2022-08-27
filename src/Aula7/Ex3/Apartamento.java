package Aula7.Ex3;

public class Apartamento extends Alojamento {

    private int nQuartos;

    public Apartamento(String codigo, String nome, String local, double preco, double avaliacao, int nQuartos){
        super(codigo, nome, local, preco, avaliacao);
        this.nQuartos=nQuartos;
    }

    public int getNQuartos() {
        return nQuartos;        
    }

    public void setNQuartos(int nQuartos) {
        this.nQuartos=nQuartos;
    }
    
}
