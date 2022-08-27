package Aula7.Ex3;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public abstract class Alojamento {
    
    private String codigo;
    private String nome;
    private String local;
    private double preco;    
    private boolean disponibilidade;
    private double avaliacao;
    private Date dataDoEstado;

    public Alojamento(String codigo, String nome, String local, double preco, double avaliacao){
        this.codigo=codigo;
        this.nome=nome;
        this.local=local;
        this.preco=preco;
        assert(preco>0):"valor invalido"; 
        disponibilidade=true;
        this.avaliacao=avaliacao;
        assert(avaliacao <= 5 && avaliacao >= 0);
        dataDoEstado=null;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getLocal() {
        return local;
    }

    public double getpreco() {
        return preco;
    }

    public boolean getDisponibilidade() {
        return disponibilidade;
    }

    public double getAvaliacao() {
        return avaliacao;
    }

    public Date getDataEstado(){
        return dataDoEstado;
    }

    public void setCodigo(String codigo) {
        this.codigo=codigo;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setLocal(String local) {
        this.local=local;
    }

    public void setpreco(double preco) {
        this.preco=preco;
    }

    private void setDisponibilidade(boolean disponibilidade) {
        this.disponibilidade=disponibilidade;
    }

    public void setAvaliacao(double avaliacao) {
        this.avaliacao=avaliacao;
    }
    
    private void setDataDoEstado(Date dataDoEstado) {
        this.dataDoEstado=dataDoEstado;
    }

    public void checkIn(Date data){
        setDisponibilidade(false);
        setDataDoEstado(data);
    }

    public void checkOut(Date data){
        setDisponibilidade(true);
        long dif = dataDoEstado.getTime()-data.getTime();
        long nDias = TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
        setDataDoEstado(data);
        double conta = preco*nDias;
        System.out.println("Conta: "+conta);
    }

    


}
