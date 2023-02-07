package Aula11.Ex2;

import java.sql.Time;

public class Voo {
    
    private Time hora;
    private String voo;
    private String companhia;
    private String origem;
    private Time atraso;
    private String obs;

    public Voo(Time hora, String voo, String companhia, String origem, Time atraso, String obs){
        this.hora = hora;
        this.voo = voo;
        this.companhia = companhia;
        this.origem = origem;
        this.atraso = atraso;
        this.obs = obs;
    }

    /**
     * @return Time return the hora
     */
    public Time getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(Time hora) {
        this.hora = hora;
    }

    /**
     * @return String return the voo
     */
    public String getVoo() {
        return voo;
    }

    /**
     * @param voo the voo to set
     */
    public void setVoo(String voo) {
        this.voo = voo;
    }

    /**
     * @return String return the companhia
     */
    public String getCompanhia() {
        return companhia;
    }

    /**
     * @param companhia the companhia to set
     */
    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    /**
     * @return String return the origem
     */
    public String getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(String origem) {
        this.origem = origem;
    }

    /**
     * @return Time return the atraso
     */
    public Time getAtraso() {
        return atraso;
    }

    /**
     * @param atraso the atraso to set
     */
    public void setAtraso(Time atraso) {
        this.atraso = atraso;
    }

    /**
     * @return String return the obs
     */
    public String getObs() {
        return obs;
    }

    /**
     * @param obs the obs to set
     */
    public void setObs(String obs) {
        this.obs = obs;
    }

    @Override
    public String toString() {
        String s = getHora() + "\t" + getVoo() + "\t" + getCompanhia() + "\t" + getOrigem() + "\t" + getAtraso() + "\t" + getObs();
        return s;
    }

}
