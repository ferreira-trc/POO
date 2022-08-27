package Aula7.Ex1;

public class Retangulo extends Forma {

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura, String cor){
        super(cor);
        this.comprimento=comprimento;
        assert(comprimento < 0):"valor invalido";
        this.largura=largura;
        assert(largura < 0):"valor invalido";
    }

    public double getComprimento() {
        return comprimento;        
    }

    public double getLargura() {
        return largura;        
    }

    public String toString() {

        String c = Double.toString(comprimento);
        String l = Double.toString(largura);
        String s = String.format("Tipo: Retangulo\n comprimento: s% \nlargura: s%",c,l);

        return s;
    }

    public static Retangulo set(double comprimento, double largura, String cor) {

        Retangulo retangulo = new Retangulo(comprimento, largura, cor);

        return retangulo;
        
    }

    public double perimetro() {

        double p = 2*comprimento+2*largura;

        return p;        
    }

    public double area() {
       
        double area = comprimento*largura;

        return area;
        
    }
    
}
