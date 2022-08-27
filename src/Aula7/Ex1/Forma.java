package Aula7.Ex1;

public abstract class Forma {

    protected String cor;
    protected static final double pi = Math.PI;

    public Forma(String cor){
        this.cor=cor;
    }

    public String getCor() {
        return cor;
    }

    public abstract double perimetro();
    
    public abstract double area();
    
}
