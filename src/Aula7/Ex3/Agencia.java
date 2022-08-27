package Aula7.Ex3;

import java.util.ArrayList;
import java.util.Date;

public class Agencia {
    
    private String nome;
    private String endereco;
    private ArrayList<QuartoHotel> quartos;
    private ArrayList<Apartamento> apartamentos;
    private ArrayList<Carro> carros;
    

    public Agencia(String nome, String endereco, ArrayList<QuartoHotel> quartos, ArrayList<Apartamento> apartamentos, ArrayList<Carro> carros ){
        this.nome=nome;
        this.endereco=endereco;  
        this.quartos=quartos;
        this.apartamentos=apartamentos;
        this.carros=carros;      
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<QuartoHotel> getQuartos() {
        return quartos;
    }

    public ArrayList<Apartamento> getApartamento() {
        return apartamentos;
    }

    public ArrayList<Carro> getCarros() {
        return carros;
    }

    

    public void setNome(String nome) {
        this.nome=nome;        
    }

    public void setEndereco(String endereco) {
        this.endereco=endereco;
    }

    public void novoApartamento(String codigo, String nome, String local, double preco, double avaliacao, int nQuartos) {
        Apartamento apar = new Apartamento(codigo, nome, local, preco, avaliacao, nQuartos);
        apartamentos.add(apar);
        System.out.printf("O Apartamento com o codigo: %d foi adicionado", apar.getCodigo());        
    }

    public void novoQuartoHotel(String codigo, String nome, String local, double preco, double avaliacao, int tipologia) {
        QuartoHotel quarto = new QuartoHotel(codigo, nome, local, preco, avaliacao, tipologia);
        quartos.add(quarto);
        System.out.printf("O Quarto de Hotel com o codigo: %d foi adicionado", quarto.getCodigo());
    }

    public void novoCarro(String matricula, char classe, String tipologia, double preco) {
        Carro carro = new Carro(matricula, classe, tipologia, preco);
        carros.add(carro);
        System.out.printf("O Carro com o codigo: %d foi adicionado", carro.getMatricula());
    }

    public void abateApartamento(String Codigo){

        for (int index = 0; index < apartamentos.size(); index++) {
            
            if (Codigo == apartamentos.get(index).getCodigo()) {
                apartamentos.remove(index);
            }
        }
    }

    public void abateQuarto(String Codigo){

        for (int index = 0; index < quartos.size(); index++) {
            
            if (Codigo == quartos.get(index).getCodigo()) {
                quartos.remove(index);
            }
        }
    }

    public void abateCarro(String matricula){

        for (int index = 0; index < carros.size(); index++) {
            
            if (matricula == carros.get(index).getMatricula()) {
                carros.remove(index);
            }
        }
    }

    public void checkInApartamento(Apartamento a, Date data) {
        a.checkIn(data);
        System.out.printf("O partamento com o codigo: %d foi ocupado", a.getCodigo());
    }

    public void checkOutApartamento(Apartamento a, Date data) {
        a.checkOut(data);
        System.out.printf("O partamento com o codigo: %d foi desocupado", a.getCodigo());
    }

    public void checkInQuarto(QuartoHotel q, Date data) {
        q.checkIn(data);
        System.out.printf("O Quarto com o codigo: %d foi ocupado", q.getCodigo());
    }

    public void checkOutQuarto(QuartoHotel q, Date data) {
        q.checkOut(data);
        System.out.printf("O Quarto com o codigo: %d foi desocupado", q.getCodigo());
    }

    public void levantarCarro(Carro c, Date data) {
        c.levantar(data);
        System.out.printf("O Carro com a matricula: %d foi levantado", c.getMatricula());
    }

    public void entregarCarro(Carro c, Date data) {
        c.entregar(data);
        System.out.printf("O Carro com a matricula: %d foi entregue", c.getMatricula());
    }

    public void getApartamentoDisp() {

        System.out.print("Apartamentos Disponiveis:\n\n");

        for (int index = 0; index < apartamentos.size(); index++) {

            if (apartamentos.get(index).getDisponibilidade() == true) {
                System.out.printf("Apartamento\ncodigo: %d\nnome: %s\nlocal: %s\npreço: %f\nquartos: %d\navaliação: f%\n\n", 
                apartamentos.get(index).getCodigo(),
                apartamentos.get(index).getNome(),
                apartamentos.get(index).getLocal(),
                apartamentos.get(index).getpreco(),
                apartamentos.get(index).getNQuartos(), 
                apartamentos.get(index).getAvaliacao());
            }

        }
        
    }

    public void getApartamentoOcupados() {

        System.out.print("Apartamentos Disponiveis:\n\n");

        for (int index = 0; index < apartamentos.size(); index++) {

            if (apartamentos.get(index).getDisponibilidade() == false) {
                System.out.printf("Apartamento\ncodigo: %d\nnome: %s\nlocal: %s\npreço: %f\nquartos: %d\navaliação: f%\n\n", 
                apartamentos.get(index).getCodigo(),
                apartamentos.get(index).getNome(),
                apartamentos.get(index).getLocal(),
                apartamentos.get(index).getpreco(),
                apartamentos.get(index).getNQuartos(), 
                apartamentos.get(index).getAvaliacao());
            }

        }
        
    }    

    public void getQuartosDisp() {

        System.out.print("Quartos Disponiveis:\n\n");

        for (int index = 0; index < quartos.size(); index++) {

            if (quartos.get(index).getDisponibilidade() == true) {
                System.out.printf("Quartos\ncodigo: %d\nnome: %s\nlocal: %s\npreço: %f\ntipo: %d\navaliação: f%\n\n", 
                quartos.get(index).getCodigo(),
                quartos.get(index).getNome(),
                quartos.get(index).getLocal(),
                quartos.get(index).getpreco(),
                quartos.get(index).getTipologia(),
                quartos.get(index).getAvaliacao());
            }

        }
        
    }

    public void getQuartosOcupados() {

        System.out.print("Quartos Disponiveis:\n\n");

        for (int index = 0; index < quartos.size(); index++) {

            if (quartos.get(index).getDisponibilidade() == false) {
                System.out.printf("Quartos\ncodigo: %d\nnome: %s\nlocal: %s\npreço: %f\ntipo: %d\navaliação: f%\n\n", 
                quartos.get(index).getCodigo(),
                quartos.get(index).getNome(),
                quartos.get(index).getLocal(),
                quartos.get(index).getpreco(),
                quartos.get(index).getTipologia(),
                quartos.get(index).getAvaliacao());
            }

        }
        
    }

    public void getCarrosDisp() {

        System.out.print("Carros Disponiveis:\n\n");

        for (int index = 0; index < carros.size(); index++) {

            if (carros.get(index).getDisponibilidade() == true) {
                System.out.printf("Carros\nmatricula: %s\nclasse: %c\ntipologia: %s\n\n", 
                carros.get(index).getMatricula(),
                carros.get(index).getClasse(),
                carros.get(index).getTipologia());                
            }

        }
        
    }

    public void getCarrosOcupado() {

        System.out.print("Carros Disponiveis:\n\n");

        for (int index = 0; index < carros.size(); index++) {

            if (carros.get(index).getDisponibilidade() == false) {
                System.out.printf("Carros\nmatricula: %s\nclasse: %c\ntipologia: %s\n\n", 
                carros.get(index).getMatricula(),
                carros.get(index).getClasse(),
                carros.get(index).getTipologia());                
            }

        }
        
    }

    public int getNumApartDisp() {
        int count = 0;

        for (int index = 0; index < apartamentos.size(); index++) {
            if (apartamentos.get(index).getDisponibilidade()==true) {
                count++;
            }
        }

        return count;
    }

    public int getNumApartOcup(){
        return apartamentos.size()-getNumApartDisp();
        }

    public int getNumQuartDisp() {
        int count = 0;
    
        for (int index = 0; index < quartos.size(); index++) {
            if (quartos.get(index).getDisponibilidade()==true) {
                count++;
            }
        }
    
        return count;
    }
    
    public int getNumQuartOcup(){
        return quartos.size()-getNumApartDisp();
    }

    public int getNumCarrDisp() {
        int count = 0;
    
        for (int index = 0; index < carros.size(); index++) {
            if (carros.get(index).getDisponibilidade()==true) {
                count++;
            }
        }
    
        return count;
    }
    
    public int getNumCarrOcup(){
        return carros.size()-getNumApartDisp();
    }


    


    




}
