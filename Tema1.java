import java.util.Scanner;

public class Tema1{

    private Scanner sc= new Scanner(System.in);

    private String nombre;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void Tema(){
         sc= new Scanner(System.in);

        solicitarNombre();
        nombre = capturarDato();
        solicitarApellido();
        apellido = capturarDato();
        System.out.println(" ");
        System.out.println("----------------------------");

    
    }

    private void solicitarNombre(){
        System.out.println("Escriba su nombre:");
    }
    private void solicitarApellido(){
        System.out.println("Escriba su apellido:");
    }

    private String capturarDato(){
     return sc.nextLine();

    }
    
} 
    

