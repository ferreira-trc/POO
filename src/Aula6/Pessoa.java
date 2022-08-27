package Aula6;
import Aula5.Date;

public class Pessoa {

    private String nome;
    private int cc;
    private Date dataNasc;

    public Pessoa(String nome, int cc, Date dataNasc) {
        this.nome=nome;
        assert(nome.length()>1):"nome invalido";

        this.cc=cc;
        assert(cc>1):"Nº invalido";

        this.dataNasc = dataNasc;
        
        
    }

    public String getName() {
       return nome;
   } 

    public int getCC() {
       return cc;
   }

    public Date getDataNasc() {
       return dataNasc;
   }

   public String toString() {
       return "("+ nome+ " / " + Integer.toString(cc) + " / " + dataNasc.toString()+ ")";
   }


}
