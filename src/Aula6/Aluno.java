package Aula6;

import java.time.LocalDate;

import Aula5.Date;

public class Aluno extends Pessoa {

    private static int nMecInicial =99;
    private int nMec;
    private Date dataInsc;
    

    public Aluno(String nome, int cc, Date dataNasc, Date dataInsc){

        super(nome, cc, dataNasc);
        this.dataInsc=dataInsc;
        nMec = nMecInicial++;

    }

    public Aluno(String nome, int cc, Date dataNasc) {

        super(nome, cc, dataNasc);
        LocalDate d = LocalDate.now();
        dataInsc = new Date(d.getDayOfMonth(),d.getMonthValue(),d.getYear());
        nMec = nMecInicial++;
                
    }

    public int getNMec() {
        return nMec;
    }

    public Date getDataInsc() {
        return dataInsc;
    }


}
