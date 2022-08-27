package Aula5;

public class Retangulo {

    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura){
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

    public static Retangulo set(double comprimento, double largura) {

        Retangulo retangulo = new Retangulo(comprimento, largura);

        return retangulo;
        
    }

    public double perimetro(double comprimento, double largura) {

        double p = 2*comprimento+2*largura;

        return p;        
    }

    public double area(double comprimento, double largura) {
       
        double area = comprimento*largura;

        return area;
        
    }
    
}
