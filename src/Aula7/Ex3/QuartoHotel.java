package Aula7.Ex3;

public class QuartoHotel extends Alojamento {
    
    private int tipologia;

    public QuartoHotel(String codigo, String nome, String local, double preco, double avaliacao, int tipologia){
        super(codigo, nome, local, preco, avaliacao);
        this.tipologia=tipologia;
        assert(tipologia == 1 || tipologia == 2 || tipologia == 3 || tipologia == 4 ):"valor invalido";
    }

    public int getTipologia() {
        return tipologia;        
    }

    public void setTipologia(int tipologia) {
        this.tipologia=tipologia;
    }



}
