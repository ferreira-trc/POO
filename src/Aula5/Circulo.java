package Aula5;

public class Circulo {

    private double raio;

    public Circulo(double raio){
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

        boolean cond = c1.raio == c2.raio;

        if (cond == true) {            
            return true;
        } 

        return false;
    }

    public static Circulo set(double raio) {

        Circulo circulo = new Circulo(raio);

        return circulo;
        
    }

    public double perimetro(double raio) {

        double p = 2*raio*Math.PI;

        return p;        
    }

    public double area(double raio) {

        double area = perimetro(raio)*(Math.PI/2);

        return area;        
    }

    
    
}
