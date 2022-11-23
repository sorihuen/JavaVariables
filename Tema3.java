import java.util.Scanner;

public class Tema3{

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

    private String nombreMama;
    public String getnombreMama() {
        return nombreMama;
    }
    public void nombreMama(String nombreMama){
        this.nombreMama = nombreMama;
    }

    private String nombrePapa;
    public String getnombrePapa() {
        return nombrePapa;
    }
    public void setnombrePapa(String nombrePapa) {
        this.nombrePapa = nombrePapa;
    }

    public void Padres(){
        sc= new Scanner(System.in);
        solicitarNombre();
        nombre = capturarDato();
        solicitarApellido();
        apellido= capturarDato();
        nombreMon();
        nombreMama = capturarDato();
        nombreDad();
        nombrePapa = capturarDato();
        System.out.println( " ");
        System.out.println("Yo " + nombre + " " + apellido + " soy hijo de " + nombreMama + "  y de " + nombrePapa + ".");
        System.out.println("-----------------------------------------------------------------------");
        

    }

    private void solicitarNombre(){
        System.out.println("Escriba su nombre:");
    }
    private void solicitarApellido(){
        System.out.println("Escriba su apellido:");

    }
    private void nombreMon(){
        System.out.println("Escriba el nombre completo de su mama:");
    }
    private void nombreDad(){
        System.out.println("Escriba el nombre completo de su papa:");
    }

    private String capturarDato(){
       return sc.nextLine();
    }
}




