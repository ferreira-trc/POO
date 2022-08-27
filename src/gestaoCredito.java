import java.util.Scanner;

public class gestaoCredito {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Capital Inicial: ");
        double capitalInicial = sc.nextDouble();
        System.out.print("\nCapital Imprestado: ");
        double capitalImprestado = sc.nextDouble();
        System.out.print("\nNº de Dias da app: ");
        int dias = sc.nextInt();
        System.out.print("\nReforço Mensal: ");
        double ref = sc.nextDouble();
        System.out.println();

        sc.close();

        double cF = capitalFinal(capitalInicial, capitalImprestado, dias,ref);

        System.out.println("\n\n\nCapital Final: "+cF);       
    }

    public static double taxaJuroDiaria(double c0, double cI) {

        double taxaJuroAnual = 0.1;

        if (c0+cI >= 2000 && c0+cI < 75000) {
            taxaJuroAnual += 0.03;
        } else {
            taxaJuroAnual += 0.04;            
        }

        double tJD = taxaJuroAnual/365;

        return tJD;
        
    }

    public static double juroDiario(double c0, double cI) {

        double juroD = (c0+cI)*taxaJuroDiaria(c0, cI);

        return juroD;
    
    }

    public static double capitalFinal(double c0, double cI, int dias, double ref ) {

        double juro = 0;
        double capitalAtual = c0;
        double juroAcumulado = 0;
        double capitalInvestido = c0;
        
        for (int dia = 1; dia <= dias; dia++) {

            if (dia%30 == 0) {
                capitalAtual+=ref; 
                capitalInvestido+=ref;               
            }
            

            juro = juroDiario(capitalAtual, cI);
            juroAcumulado+=juro;
            capitalAtual +=juro;
            System.out.printf("Dia %d\nJuro: %.8f\nJuro Acumulado: %.8f\nCapital Atual: %.8f\nCapitalInvestido: %.8f\n\n", dia,juro,juroAcumulado,capitalAtual,capitalInvestido); 
            
        }

        return capitalAtual;
    }
    
}
