import java.util.Scanner;

public class Tema2{

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

    private int edad;
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;

    }

    private double altura;
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void Titulo(){

        sc= new Scanner(System.in);
        solicitarNombre();
        nombre = capturarDatoString();
        solicitarApellido();
        apellido = capturarDatoString();
        solicitarEdad();
        edad = capturarDatoInt();
        solicitarAltura();
        altura = capturarDatoDouble();
        System.out.println(" ");
        System.out.println("----------------------------");

      

    }

    private void solicitarNombre(){
        System.out.println("Escriba su nombre:");
    }
    private void solicitarApellido(){
        System.out.println("Escriba su apellido:");

    }
    private void solicitarEdad(){
        System.out.println("Escriba su Edad:");

    }
    private void solicitarAltura(){
        System.out.println("Escriba su Estatura:");
    }

    private String capturarDatoString(){
       return sc.nextLine();

    }
    private int capturarDatoInt(){
        return sc.nextInt();
    }
    private double capturarDatoDouble(){
        return sc.nextDouble();
    }




}
    
    





    