
import java.util.Scanner;

public class Main {


    public static void main(String[] arg){ 
        
        boolean respuesta = true;
         int opcion ;
         clearScreen();

        do{
            
            menu();
            opcion = capturarOpcion();
            respuesta = evaluarOpcion(opcion);


        }while(respuesta == true);

       
    }
    private static void clearScreen(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static void menu(){
        System.out.println("Seleccione una opcion del Taller:");
        System.out.println("1. Tema 1: *** Nombre y Apellido ***");
        System.out.println("2. Tema 2: *** Edad y Estatura ***");
        System.out.println("3. Tema 3: *** Padres ***");
        System.out.println("4. Tema 4: *** Un Lugar ***");
        System.out.println("5. Tema 5: *** Mi Mascota ***");
        System.out.println("0. *** Salir del Taller ****");

    }
    private static int capturarOpcion(){
         Scanner sc = new Scanner (System.in);
        return sc.nextInt();
    }
  
    
    
    private static boolean evaluarOpcion(int opcion){
        switch(opcion){
            case 1:
               Tema1 t1 = new Tema1();
               t1.Tema();
               return true;

            case 2:
               Tema2 t2 = new Tema2();

               t2.Titulo();
               return true;

            case 3:
               Tema3 t3 = new Tema3();
               t3.Padres();
               return true;
            //break;

            case 4:
               Tema4 t4 = new Tema4();
               t4.Lugar();
               return true;

            case 5:
                Tema5 t5 = new Tema5();
                t5.Mascota();
                return true;


            case 0:
               return false;
            //break;<
            default:
            System.out.println(" Opcion Invalida");

        }
        return true;



    }
    @Override
    public String toString() {
        return "Main []";
    }
}

    


    

   
