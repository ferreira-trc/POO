package Aula7.Ex1;

public class Triangulo extends Forma  {

    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3, String cor){
        super(cor);
        this.lado1=lado1;
        assert(lado1 < 0):"valor invalido";
        this.lado2=lado2;
        assert(lado2 < 0):"valor invalido";
        this.lado3=lado3;
        assert(lado3 < 0):"valor invalido";
    }

    public double perimetro() {

        double p = lado1+lado2+lado3;

        return p;        
    }    

    public double area() {

        double semiPerimetro = perimetro()/2;
        double area = Math.sqrt(semiPerimetro*(semiPerimetro-lado1)*(semiPerimetro-lado2)*(semiPerimetro-lado3));

        return area;
    }

    
    public double getLado1() {
        return lado1;        
    }

    public double getLado2() {
        return lado2;        
    }

    public double getLado3() {
        return lado3;        
    }

    public String toString() {

        String l1 = Double.toString(lado1);
        String l2 = Double.toString(lado2);
        String l3 = Double.toString(lado3);
        String s = String.format("Tipo: Triangulo\ncor: %s lado1: s% \nlado2: s% \nlado3: s%",cor,l1,l2,l3 );

        return s;
    }

    public static boolean equals(Triangulo t1, Triangulo t2) {

        boolean cond = t1.lado1 == t2.lado1 &&  t1.lado2 == t2.lado2 && t1.lado3 == t2.lado3 && t1.cor == t2.cor;

        if (cond == true) {            
            return true;
        } 

        return false;
    }

    public static Triangulo set(double lado1, double lado2, double lado3, String cor) {

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3, cor);

        return triangulo;
        
    }
    
}
