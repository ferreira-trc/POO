package Aula7.Ex1;

public class Circulo extends Forma {
    
    private double raio;

    public double area(){
        return pi*Math.pow(raio, 2);
    }

    public double perimetro(){
        return 2*pi*raio;
    }

    public Circulo(double raio, String cor){
        super(cor); 
        this.raio=raio;
        assert(raio < 0):"valor invalido";        
    }

    public double getRaio() {
        return raio;        
    }

    public String toString() {

        String r = Double.toString(raio);
        String s = String.format("Tipo: Circulo\n raio: s%", r);

        return s;
    }

    public static boolean equals(Circulo c1, Circulo c2) {

        boolean cond = c1.raio == c2.raio && c1.cor == c2.cor;

        if (cond == true) {            
            return true;
        } 

        return false;
    }

    public static Circulo set(double raio, String cor) {

        Circulo circulo = new Circulo(raio, cor);

        return circulo;
        
    }

        
}
