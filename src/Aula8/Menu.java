package Aula8;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Escolha um nome para a sua empresa.");
    System.out.print("Nome: ");
    String nome = sc.nextLine();
      
      
    System.out.println("Insira o codigo-postal.");
    System.out.print("codigo-postal: ");
    int codigoPostal = sc.nextInt();
    sc.nextLine();


    String email = nome+"@"+nome+".pt";
    ArrayList<Viaturas> listaViaturas = new ArrayList<>();
    Empresa empresa = new Empresa(nome, codigoPostal, email, listaViaturas);
        
    System.out.println("1- Gerir Empresa");
    System.out.println("2-Gerir Viaturas");
    System.out.println("0- Sair\n\n");

    boolean exit = true;      

    while (exit) {

      int key = escolherMenu(3, sc);

      switch (key) {
        case 1: // Gerir empresa
          menuGerirEmpresa(empresa, sc);                  
        break;

        case 2: // Gerir viaturas
          menuGerirViaturas(empresa, sc);    
        break;               
    
        case 3: // Terminar
          System.out.print("progrma fechado");
          exit = false;
        break;           
      }

      key = escolherMenu(3, sc);
            
    }

    sc.close();
    
  }

    public static int escolherMenu(int nOp, Scanner sc) {        
      
      System.out.print("Escolha: ");
      int escolha = sc.nextInt();

      while (escolha >= nOp && escolha < 0 ) {
          System.out.println("Essa opessão nao existe!\n Escolha outra");
          System.out.print("Escolha: ");
          escolha = sc.nextInt();
          sc.nextLine();
          System.out.println();
          System.out.println();
          
      }     
              
      return escolha;
    }

    public static void menuGerirEmpresa(Empresa empresa, Scanner sc){    
      
      boolean exit = true;

      System.out.println( "1- Ver Nome\n"+
                          "2- Mudar Nome\n"+
                          "3- Mudar codigo-Postal\n"+
                          "4- Ver codigo-postal\n"+
                          "5- Ver e-mail\n"+
                          "0- Sair");
                    
      while (exit) {
                        
      int key = escolherMenu(6, sc);  

      switch (key) {
        case 1: // Ver Nome
          System.out.println(empresa.getNome());
          break;

        case 2: // Mudar Nome
          String n = sc.nextLine();
          empresa.setNome(n);
          empresa.setEmail(n+"@"+n+".pt");
          System.out.printf("O nome da empresa passou a ser: %s\n", empresa.getNome());
          break; 

        case 3: // Ver Codigo Postal
          System.out.println(empresa.getCodigoPostal());
          break;

        case 4: // Mudar Codigo Postal
          int codigo = sc.nextInt();
          empresa.setCodigoPostal(codigo);
          System.out.printf("O codigo-postal da empresa passou a ser: %d\n", empresa.getCodigoPostal());
          break; 

        case 5: // Ver E-mail
          System.out.println(empresa.getEmail());
          break;

        case 0: // Sair
          exit=false;
          System.out.println("1- Ver Nome\n2- Mudar Nome\n3- Mudar codigo-Postal\n4- Ver codigo-postal\n5- Ver e-mail \n0- Sair");
          break;          
        } 
        
      key = escolherMenu(6, sc); 

      }
      
    }

    public static void menuGerirViaturas(Empresa empresa, Scanner sc) {      
      boolean exit = true;
      String matricula;

      System.out.println("1- Listar Viatura");
      System.out.println("2- Adicionar Viaturas");
      System.out.println("3- Remover Viaturas");
      System.out.println("4- Alugar Viaturas");
      System.out.println("5- Receber Viatura");                                 
      System.out.println("0- Sair");
      
      while (exit) {
          
        int key = escolherMenu(6, sc);  

        switch (key) {

          case 1: // Listar Viaturas
            menuListarViaturas(empresa, sc);
          break;

          case 2: // Adicionar Viaturas
            menuAddViaturas(empresa, sc);
          break; 

          case 3: // Remover Viaturas
            System.out.println("Escolha a viatura que quer remover");
            matricula = validMatricula(sc);
            empresa.removeViatura(matricula);
          break;          

          case 4: // Alugar Viaturas
            System.out.println("Escolha a viatura que quer Alugar");
            matricula = validMatricula(sc); 
            empresa.levantar(matricula); 
          break; 

          case 5: // Receber Viatura
            System.out.println("Viatura a receber");
            matricula = validMatricula(sc);
            System.out.println("Quantos km's tem no momento?");
            
            System.out.print("Km's: ");
            int quilometros = sc.nextInt();
            int kmAnteriores = empresa.getViatura(matricula).distanciaTotal();

            boolean cond = quilometros>kmAnteriores;

            while (cond == false) {
              System.out.println("Km's invalidos! Os km's atuais tem de ser maior que os km's anteriores");
              System.out.print("Km's: ");
              quilometros = sc.nextInt();
            }

            empresa.entregar(matricula, quilometros);  
          break;
          
          case 6: // Viatura com mais quilometros
            Viaturas viaturaComMaisKms = empresa.viaturaComMaisKms();
            System.out.println("A viatura com mais Km's é:");
            System.out.println("Matricula: " + viaturaComMaisKms.getMatricula());
            System.out.println("Marca: " + viaturaComMaisKms.getMarca());
            System.out.println("Modelo: " + viaturaComMaisKms.getModelo());
            System.out.println("Km's: " + viaturaComMaisKms.distanciaTotal());
            System.out.println("Tipo: " + viaturaComMaisKms.getClass().toString());
          break;

          case 0: // Sair
            exit=false;
            System.out.println("1- Gerir Empresa");
            System.out.println("2-Gerir Viaturas");
            System.out.println("0- Sair");
          break;          
               
         }

        key = escolherMenu(6, sc);

      }
    }

    public static void menuListarViaturas(Empresa empresa, Scanner sc) {
      boolean exit = true;

      System.out.println("1- Lista de todas as Viaturas");
      System.out.println("2- Lista de todas as Viaturas Disponiveis");
      System.out.println("3- Lista de todas as Viaturas Indisponiveis");
      System.out.println("4- Lista de um tipo as Viaturas");
      System.out.println("5- Lista de um tipo as Viaturas Disponiveis");
      System.out.println("6- Lista de um tipo as Viaturas Indisponivel");
      System.out.println("0- Sair");
      
      
      while (exit) {
          
        int key = escolherMenu(6, sc);  

        switch (key) {
          case 1: // Lista de todas as Viaturas
            printListaGeral(empresa);
          break;               

          case 2: // Lista de todas as Viaturas Disponiveis
            printListaGeralDisp(empresa, true);                
          break;                               

          case 3: // Lista de todas as Viaturas Indisponiveis
            printListaGeralDisp(empresa, false);                                                 
          break;  
                

          case 4: // Lista de um tipo as Viaturas
            menuListaTipoViaturas(empresa, sc);
          break;  
            
          case 5: // Lista de um tipo as Viaturas Disponiveis
            menuListaTipoViaturasDisp(empresa, true, sc);
          break;

          case 6: // Lista de um tipo as Viaturas Indisponivel
            menuListaTipoViaturasDisp(empresa, false, sc);
          break;
           
          case 0: // Sair
            exit=false;
            System.out.println("1- Listar Viatura");
            System.out.println("2- Adicionar Viaturas");
            System.out.println("3- Remover Viaturas");
            System.out.println("4- Alugar Viaturas");
            System.out.println("5- Receber Viatura");                                                
            System.out.println("0- Sair");
          break;          
               
        }
      }
    }

    public static void menuListaTipoViaturas(Empresa empresa, Scanner sc) {

      System.out.println("Escolha o tipo de Viatura");
      System.out.println("1- Motociclo");
      System.out.println("2- Taxi");
      System.out.println("3- Mercadorias");
      System.out.println("4- Passageiro");
      System.out.println("0- Voltar atras");
      System.out.print("Escolha: ");
      int k = escolherMenu(4, sc);
      boolean exit = true;
      
      while (exit) {

        switch (k) {

          case 1://Lista Motociclos
            printListaMotociclos(empresa);
          break;

          case 2://Lista Taxis
            printListaTaxis(empresa);     
          break;
         

          case 3://Lista Pesados de Mercadorias
            printListaPMercadorias(empresa);                                                   
          break;

          case 4://Lista Pesados de Passageiros
            printListaPPassageiros(empresa);        
          break;         
        
          case 0://Sair
            exit = false;
            System.out.println("1- Lista de todas as Viaturas");
            System.out.println("2- Lista de todas as Viaturas Disponiveis");
            System.out.println("3- Lista de todas as Viaturas Indisponiveis");
            System.out.println("4- Lista de um tipo as Viaturas");
            System.out.println("5- Lista de um tipo as Viaturas Disponiveis");
            System.out.println("6- Lista de um tipo as Viaturas Indisponivel");
            System.out.println("0- Sair");
            break;
        }
      }          
    }
    
    public static void menuListaTipoViaturasDisp(Empresa empresa, boolean disp, Scanner sc) {
      System.out.println("Escolha o tipo de Viatura");
      System.out.println("1- Motociclo");
      System.out.println("2- Taxi");
      System.out.println("3- Mercadorias");
      System.out.println("4- Passageiro");
      System.out.println("0- Voltar atras");
      System.out.print("Escolha: ");
      int k = escolherMenu(4, sc);
      boolean exit = true;
      
      while (exit) {

        switch (k) {

          case 1://Lista Motociclos
            printListaMotociclosDisp(empresa,disp);
          break;          

          case 2://Lista Taxis
            printListaTaxisDisp(empresa,disp);
          break;         

          case 3://Lista Pesados de Mercadorias
            printListaMotociclosDisp(empresa,disp);
          break;        

          case 4://Lista Pesados de Passageiros            
            printListaPPassageirosDisp(empresa, disp);
           break;         
        
          case 0://Sair
            exit = false;
            System.out.println("1- Lista de todas as Viaturas");
            System.out.println("2- Lista de todas as Viaturas Disponiveis");
            System.out.println("3- Lista de todas as Viaturas Indisponiveis");
            System.out.println("4- Lista de um tipo as Viaturas");
            System.out.println("5- Lista de um tipo as Viaturas Disponiveis");
            System.out.println("6- Lista de um tipo as Viaturas Indisponivel");
            System.out.println("0- Sair");
            break;
        }
      }          
    }   
    
    public static void printListaGeral(Empresa empresa) {
      ArrayList<Viaturas> lista = empresa.getListaGeral();
                
      for (int index = 0; index < lista.size(); index++) {                     
        Viaturas v = lista.get(index);                                                                               
        System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f\n", v.getMatricula(), v.getMarca(), v.getModelo(), v.getCilindrada());
      }
    }

    public static void printListaGeralDisp(Empresa empresa, boolean disp) {
      ArrayList<Viaturas> listaDisp = empresa.getListaGeral();                           

      for (int index = 0; index < listaDisp.size(); index++) {
        Viaturas v = listaDisp.get(index);

        if (v.getDisp() == disp) {
          System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f\n", v.getMatricula(), v.getMarca(), v.getModelo(), v.getCilindrada());
        }
      }          
    }
   
    public static void printListaMotociclos(Empresa empresa) {
      ArrayList<Motociclo> listaMotociclos = empresa.getListaMotociclos();

      for (int index = 0; index < listaMotociclos.size(); index++) {
        Motociclo m = listaMotociclos.get(index);                                                                               
        System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f" , m.getMatricula(), m.getMarca(), m.getModelo(), m.getCilindrada());
        System.out.printf("/ Tipo: %s\n", m.getTipo());
      }
    }

    public static void printListaMotociclosDisp(Empresa empresa, boolean disp) {       
      ArrayList<Motociclo> listaMotociclos = empresa.getListaMotociclos();

      for (int index = 0; index < listaMotociclos.size(); index++) {
        Motociclo m = listaMotociclos.get(index); 
        
        if (m.getDisp() == disp) {
          System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f" , m.getMatricula(), m.getMarca(), m.getModelo(), m.getCilindrada());
          System.out.printf("/ Tipo: %s\n", m.getTipo());

        }              
      }
    }
    
    public static void printListaTaxis(Empresa empresa) {
      ArrayList<Taxi> listaTaxis = empresa.getListaTaxis();

      for (int index = 0; index < listaTaxis.size(); index++) {
        Taxi t = listaTaxis.get(index);                                                                               
        System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f", t.getMatricula(), t.getMarca(), t.getModelo(), t.getCilindrada());
        System.out.printf("Nº Quadro: %d / Capacidade da Bagageira: %d kg / Nº Licença: %d\n", t.getNumQuadro(), t.getCapBag(), t.getNLiceca());
      }
    }

    public static void printListaTaxisDisp(Empresa empresa, boolean disp) {
      ArrayList<Taxi> listaTaxis = empresa.getListaTaxis();

      for (int index = 0; index < listaTaxis.size(); index++) {
        Taxi t = listaTaxis.get(index);
              
        if (t.getDisp() == true) {
          System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f", t.getMatricula(), t.getMarca(), t.getModelo(), t.getCilindrada());
          System.out.printf("Nº Quadro: %d / Capacidade da Bagageira: %d kg / Nº Licença: %d\n", t.getNumQuadro(), t.getCapBag(), t.getNLiceca());

        }              
      }      
    }
    
    public static void printListaPMercadorias(Empresa empresa) {
      ArrayList<Mercadorias> listaPMercadorias = empresa.getListaMercadorias();

      for (int index = 0; index < listaPMercadorias.size(); index++) {
        Mercadorias pM = listaPMercadorias.get(index);                                                                               
        System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f", pM.getMatricula(), pM.getMarca(), pM.getModelo(), pM.getCilindrada());
        System.out.printf("Nº Quadro: %d / Peso: %d kg / Caraga Max: %d kg \n", pM.getNumQuadro(), pM.getPeso(), pM.getCargaMax());
      }
    }

    public static void printListaPMercadoriasDisp(Empresa empresa, boolean disp) {
      ArrayList<Mercadorias> listaPMercadorias = empresa.getListaMercadorias();

      for (int index = 0; index < listaPMercadorias.size(); index++) {
        Mercadorias pM = listaPMercadorias.get(index);
        
        if (pM.getDisp() == disp) {
          System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f", pM.getMatricula(), pM.getMarca(), pM.getModelo(), pM.getCilindrada());
          System.out.printf("Nº Quadro: %d / Peso: %d kg / Caraga Max: %d kg \n", pM.getNumQuadro(), pM.getPeso(), pM.getCargaMax());
        }
      }
    }
    
    public static void printListaPPassageiros(Empresa empresa) {
      ArrayList<Passageiros> listaPPassageiro = empresa.getListaPassageiros();

        for (int index = 0; index < listaPPassageiro.size(); index++) {
          Passageiros pP = listaPPassageiro.get(index);                                                                               
          System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f", pP.getMatricula(), pP.getMarca(), pP.getModelo(), pP.getCilindrada());
          System.out.printf("Nº Quadro: %d / Peso: %d kg / Nº max Passageiros: %d \n", pP.getNumQuadro(), pP.getPeso(), pP.getnMaxPassageiros());
        }
      }    

    public static void printListaPPassageirosDisp(Empresa empresa, boolean disp) {
      ArrayList<Passageiros> listaPPassageiro = empresa.getListaPassageiros();

      for (int index = 0; index < listaPPassageiro.size(); index++) {
        Passageiros pP = listaPPassageiro.get(index);

        if (pP.getDisp() == disp) {
          System.out.printf("Matricul: %s / Marca: %s / Modelo: %s / Cilindrada: %f", pP.getMatricula(), pP.getMarca(), pP.getModelo(), pP.getCilindrada());
          System.out.printf("Nº Quadro: %d / Peso: %d kg / Nº max Passageiros: %d \n", pP.getNumQuadro(), pP.getPeso(), pP.getnMaxPassageiros()); 
        }        
      }        
    }

    public static void menuAddViaturas(Empresa empresa, Scanner sc) {
      System.out.println("Escolha o tipo de Viatura");
      System.out.println("1- Motociclo");
      System.out.println("2- Taxi");
      System.out.println("3- Mercadorias");
      System.out.println("4- Passageiro");
      System.out.println("0- Voltar atras");
      System.out.print("Escolha: ");
      int k = escolherMenu(4, sc);
      boolean exit = true;
      
      while (exit) {

        switch (k) {

          case 1://adicionar Motociclos
            addMota(empresa, sc);
          break;

          case 2://adicionar Taxis
            addTaxi(empresa, sc);     
          break;         

          case 3://adicionar Pesados de Mercadorias
            addMercadorias(empresa, sc);                                                   
          break;

          case 4://adicionar Pesados de Passageiros
            addPassageiros(empresa, sc);        
          break;         
        
          case 0://Sair
            exit = false;
            System.out.println("1- Listar Viatura");
            System.out.println("2- Adicionar Viaturas");
            System.out.println("3- Remover Viaturas");
            System.out.println("4- Alugar Viaturas");
            System.out.println("5- Receber Viatura");                                 
            System.out.println("0- Sair");
            break;
        }

        k = escolherMenu(4, sc);
      }          
    }

    public static void addMota(Empresa empresa, Scanner sc) {
      ArrayList<String> viatura = validViatura(sc);

      Viaturas v;
      String matricula = viatura.get(0);
      String marca = viatura.get(1);
      String modelo = viatura.get(2);
      double cilindrada= Double.valueOf(viatura.get(3));

      System.out.print("Tipologia: ");
      String tipo = sc.nextLine();

      boolean cond = tipo.equalsIgnoreCase("desportivo") || tipo.equalsIgnoreCase("estrada");

      while (cond == false) {
        System.out.println("Tipologia invalida! A mota so pode ser do tipo desportivo ou estrada");
        System.out.print("Tipologia: ");
        matricula = sc.nextLine();
      }         

      System.out.println("1- Nova\n2- Usada");
      int key = escolherMenu(2, sc);
      

      switch (key) {
        case 1: // Mota nova          
          v = new Motociclo(matricula, marca, modelo, cilindrada, tipo);
          empresa.addViatura(v);
        break;
          
      
        case 2: // Mota Usada
          ArrayList<Integer> kms = new ArrayList<>();
          kms.add(viaturaUsada(sc));
          v = new Motociclo(matricula, marca, modelo, cilindrada, kms, tipo);
          empresa.addViatura(v);
        break;  

      }
    }

    public static void addTaxi(Empresa empresa, Scanner sc) {
      ArrayList<String> viatura = validAutomovel(sc);

      Viaturas v;
      String matricula = viatura.get(0);
      String marca = viatura.get(1);
      String modelo = viatura.get(2);
      double cilindrada= Double.valueOf(viatura.get(3));
      int numQuadro = Integer.valueOf(viatura.get(4));

      System.out.print("Capacidade da Bagagem: ");
      int capBag = sc.nextInt();

      boolean cond1 = capBag > 500;

      while (cond1 ) {
        System.out.println("Capacidade da bagagem têm de ser maior que 500L!");
        System.out.print("Capacidade da Bagagem: ");
        capBag = sc.nextInt();
      }  

      System.out.print("Nº da Licença: ");
      int nLicenca = sc.nextInt();
      
      boolean cond2 = nLicenca>0;

      while (cond2 ) {
        System.out.println("Nº da Licença têm de ser maior que 0!");
        System.out.print("Nº da Licença: ");
        nLicenca = sc.nextInt();
      }  

      System.out.println("1- Nova\n2- Usada");
      int key = escolherMenu(2, sc);     

      switch (key) {
        case 1: // Mota nova          
          v = new Taxi(matricula, marca, modelo, cilindrada, numQuadro, capBag, nLicenca);
          empresa.addViatura(v);
        break;
          
      
        case 2: // Mota Usada
          ArrayList<Integer> kms = new ArrayList<>();
          kms.add(viaturaUsada(sc));
          v = new Taxi(matricula, marca, modelo, cilindrada, kms, numQuadro, capBag, nLicenca);
          empresa.addViatura(v);
        break;        
      }
      
      

    }

    public static void addMercadorias(Empresa empresa, Scanner sc) {      
      ArrayList<String> viatura = validPesado(sc);

      Viaturas v;
      String matricula = viatura.get(0);
      String marca = viatura.get(1);
      String modelo = viatura.get(2);
      double cilindrada= Double.valueOf(viatura.get(3));
      int numQuadro = Integer.valueOf(viatura.get(4));
      int peso = Integer.valueOf(viatura.get(5));

      System.out.print("Carga Maxima: ");
      int cargaMax = sc.nextInt();

      boolean cond1 = cargaMax > 500;

      while (cond1 ) {
        System.out.println("Carga maxima têm de ser maior que 750!");
        System.out.print("Carga Maxima: ");
        cargaMax = sc.nextInt();
      } 
      
      System.out.println("1- Nova\n2- Usada");
      int key = escolherMenu(2, sc);

      switch (key) {
        case 1: // Mercadorias Novo
          v = new Mercadorias(matricula, marca, modelo, cilindrada, numQuadro, peso, cargaMax);
          empresa.addViatura(v);
        break;
      
        case 2: // Mercadorias Usada
          ArrayList<Integer> kms = new ArrayList<>();
          kms.add(viaturaUsada(sc));
          v = new Mercadorias(matricula, marca, modelo, cilindrada, kms, numQuadro, peso, cargaMax);
          empresa.addViatura(v);
        break;               
      }
    }
    
    public static void addPassageiros(Empresa empresa, Scanner sc) {     
      ArrayList<String> viatura = validPesado(sc);

      Viaturas v;
      String matricula = viatura.get(0);
      String marca = viatura.get(1);
      String modelo = viatura.get(2);
      double cilindrada= Double.valueOf(viatura.get(3));
      int numQuadro = Integer.valueOf(viatura.get(4));
      int peso = Integer.valueOf(viatura.get(5));

      System.out.print("Nº Maximo de Passageiros: ");
      int nMaxPassageiros = sc.nextInt();

      boolean cond1 = nMaxPassageiros > 9;

      while (cond1 ) {
        System.out.println("Nº Maximo de Passageiros de ser maior que 9!");
        System.out.print("Nº Maximo de Passageiros: ");
        nMaxPassageiros = sc.nextInt();
      } 
      
      System.out.println("1- Nova\n2- Usada");
      int key = escolherMenu(2, sc);

      switch (key) {
        case 1: // Mercadorias Novo
          v = new Passageiros(matricula, marca, modelo, cilindrada, numQuadro, peso, nMaxPassageiros);
          empresa.addViatura(v);
        break;
      
        case 2: // Mercadorias Usada
          ArrayList<Integer> kms = new ArrayList<>();
          kms.add(viaturaUsada(sc));
          v = new Passageiros(matricula, marca, modelo, cilindrada, kms, numQuadro, peso, nMaxPassageiros);
          empresa.addViatura(v);
        break;               
      }

     
    
    }

    public static String validMatricula(Scanner sc){
      
      System.out.print("Matricula: ");
      String matricula = sc.nextLine();
      int n = matricula.length();
      System.out.println(n);
      boolean cond1 = matricula.length() == 6;

      while (cond1 == false) {
        System.out.println(n);
        System.out.println("matricula invalida! Escreva uma nova apenas com 6 digitos");
        System.out.print("Matricula: ");
        matricula = sc.nextLine();
      }      

      return matricula;

    }
    
    public static ArrayList<String> validViatura(Scanner sc) {
      
      ArrayList<String> viatura = new ArrayList<>();      
      String matricula = validMatricula(sc);      

      System.out.print("Marca: ");
      String marca = sc.nextLine();
     
      System.out.print("Modelo: ");
      String modelo = sc.nextLine();


      System.out.print("Cilindrada: ");
      double cilindrada = sc.nextDouble();

      boolean cond2 = cilindrada>0 && cilindrada<10;

      while (cond2 == false) {
        System.out.println("Cilindrada invalida! Escreva uma nova entre 0 e 10");
        System.out.print("Cilindrada: ");        
        cilindrada = sc.nextDouble();
      }

      viatura.add(matricula);
      viatura.add(marca);
      viatura.add(modelo);
      viatura.add(Double.toString(cilindrada));      
      
      return viatura;

    }

    public static ArrayList<String> validAutomovel(Scanner sc) {
      
      ArrayList<String> automovel = validViatura(sc);

      System.out.print("Nº de Quadro: ");
      int numQuadro = sc.nextInt();

      boolean cond = numQuadro>0;

      while (cond == false) {
        System.out.println("Nº de Quadro têm de ser maior que 0!");
        System.out.print("Nº de Quadro: ");        
        numQuadro = sc.nextInt();
      }     

      automovel.add(Integer.toString(numQuadro));
      
      return automovel;

    }

    public static ArrayList<String> validPesado(Scanner sc) {
      
      ArrayList<String> pesado = validViatura(sc);

      System.out.print("Peso: ");
      int peso = sc.nextInt();

      boolean cond = peso>3500;

      while (cond == false) {
        System.out.println("Peso têm de ser maior que 3500 kg!");
        System.out.print("Peso: ");        
        peso = sc.nextInt();
      }      

      pesado.add(Integer.toString(peso));
      
      return pesado;

    }   

    public static int viaturaUsada(Scanner sc) {
           
      System.out.print("Km's: ");
      int km = sc.nextInt();

      boolean cond3 = km > 0;

      while (cond3 == false) {
        System.out.println("Km's invalida! Têm de ser maior que 0");
        System.out.print("Cilindrada: ");        
        km = sc.nextInt();
      }    

      return km;

    }






    

    



    




      
      


      
    

}
