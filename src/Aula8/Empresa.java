package Aula8;

import java.util.ArrayList;

public class Empresa {
    
    private String nome;
    private Integer codigoPostal;
    private String email;
    private ArrayList <Viaturas> listaViaturas;    

    public Empresa(String nome, Integer codigoPostal, String email, ArrayList <Viaturas> listaViaturas){
        this.nome=nome;
        this.codigoPostal=codigoPostal;
        this.email=email;
        this.listaViaturas=listaViaturas;        
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public String getEmail() {
        return email;
    }

    public Viaturas getViatura(String matricula){
        
        for (int index = 0; index < listaViaturas.size(); index++) {

            Viaturas v = listaViaturas.get(index);             
            boolean cond = matricula.equals(v.getMatricula());

            if (cond) {
                return v;
            }            
        }

        System.out.println("A Viatura não existe");
        return null; 
        }

    public ArrayList <Viaturas> getListaGeral() {
        return listaViaturas;
    }

    public ArrayList<Motociclo> getListaMotociclos() {
        
        ArrayList<Motociclo> listaMotociclos = new ArrayList<>();

        for (Viaturas v : listaViaturas) {
            if (v instanceof Motociclo) {
                listaMotociclos.add((Motociclo) v);
            }
        }        
        
        return listaMotociclos;
    }

    public ArrayList<Taxi> getListaTaxis() {
        
        ArrayList<Taxi> listaTaxi = new ArrayList<>();

        for (Viaturas v : listaViaturas) {
            if (v instanceof Taxi) {
                listaTaxi.add((Taxi)v);
            }
        }        
        
        return listaTaxi;
    }

    public ArrayList<Mercadorias> getListaMercadorias() {
        
        ArrayList<Mercadorias> listaMercadorias = new ArrayList<>();

        for (Viaturas v : listaViaturas) {
            if (v instanceof Mercadorias) {
                listaMercadorias.add((Mercadorias)v);
            }
        }        
        
        return listaMercadorias;
    }

    public ArrayList<Passageiros> getListaPassageiros() {
        
        ArrayList<Passageiros> listaPassageiros = new ArrayList<>();

        for (Viaturas v : listaViaturas) {
            if (v instanceof Passageiros) {
                listaPassageiros.add((Passageiros)v);
            }
        }        
        
        return listaPassageiros;
    }

    public void setNome(String nome) {
        this.nome=nome;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal=codigoPostal;
    }

    public void setEmail(String email) {
        this.email=email;
    }

    public void addViatura(Viaturas v) {
        this.listaViaturas.add(v);
    }   

    public void removeViatura(String matricula) {
        for (int index = 0; index < listaViaturas.size(); index++) {

            boolean cond = listaViaturas.get(index).getMatricula().equals(matricula);
            
            if (cond) { 
                listaViaturas.remove(index);
                System.out.println("Viatura Abatida");
            } else{
                System.out.println("Viatura nao existe");
            }
        }
    }
   
    public void levantar(String matricula) {

        for (int index = 0; index < listaViaturas.size(); index++) {

            Viaturas v = listaViaturas.get(index);            
            boolean cond = matricula.equals(v.getMatricula());

            if (cond) {
                v.setDisp(false);
                System.out.println("Viatura: " + v.getMatricula()+ "levantada");
            }            
        } 
    }

    public void entregar(String matricula, int quilometros) {        

        Viaturas v = getViatura(matricula);
        v.setDisp(true);
        int kms =quilometros - v.distanciaTotal();
        v.trajeto(kms);
        System.out.println("Viatura: " + v.getMatricula() + "entregue");
    }  
    
    public Viaturas viaturaComMaisKms() {

        Viaturas v = listaViaturas.get(0);
        
        for (int index = 1; index <= listaViaturas.size(); index++) {           
            boolean cond = listaViaturas.get(index-1).distanciaTotal()<listaViaturas.get(index).distanciaTotal();
            
            if (cond) {
              v = listaViaturas.get(index);  
            }
        }
        
        return v;
    }
                      
     

}







