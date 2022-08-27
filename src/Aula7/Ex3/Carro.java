package Aula7.Ex3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Carro {

    private String matricula;
    private char classe;
    private String tipologia;
    private boolean disponibilidade;
    private double preco;
    private Date dataDoEstado;

    public Carro(String matricula, char classe, String tipologia, double preco) {
        this.matricula=matricula;
        assert(matricula.length() == 6): "Matricula invalida";
        
        this.tipologia=tipologia;
        assert(tipologia.equalsIgnoreCase("Gasolina") ||
               tipologia.equalsIgnoreCase("Disel")    || 
               tipologia.equalsIgnoreCase("Hibrido")  || 
               tipologia.equalsIgnoreCase("Electrico")  ): "Tipologia incorreta";

        this.classe=classe;
        assert(classe == 'A' || 
               classe == 'B' ||
               classe == 'C' ||
               classe == 'D' ||
               classe == 'E' ||
               classe == 'F'  ):"Classe invalido";

        this.preco=preco;
        disponibilidade = true;
        dataDoEstado = null;
    }

    public String getMatricula(){
        return matricula;
    }

    public char getClasse() {
        return classe;
    }

    public String getTipologia(){
        return tipologia;
    }
    
    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public Date getDataEstado(){
        return dataDoEstado;
    }


    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    public void setClasse( char classe) {
        this.classe=classe;
    }

    public void setTipologia(String tipologia) {
        this.tipologia=tipologia;
    }

    private void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade=disponibilidade;
    }  

    private void setDataDoEstado(Date dataDoEstado) {
        this.dataDoEstado=dataDoEstado;
    }
    
    public void levantar(Date data) {
        setDisponibilidade(false);
        setDataDoEstado(data);

    }

    public void entregar(Date data) {

        setDisponibilidade(true);
        long dif = dataDoEstado.getTime()-data.getTime();
        long nDias = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
        setDataDoEstado(data);
        double conta = preco*nDias;
        System.out.println("Conta: "+conta);
        
    }
}
