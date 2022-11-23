import java.util.Scanner;

public class Tema5 {

    private Scanner sc= new Scanner(System.in);

    private String nombreMascota;
    public String getNombreMascota() {
        return nombreMascota;
    }
    public void setNombre(String nombreMascota) {
        this.nombreMascota = nombreMascota;
    }

    private String edadMascota;
    public String getedadMascota() {
        return edadMascota;
    }
    public void setedadMascota(String edadMascota) {
        this.edadMascota = edadMascota;
    }

    private String tipoMascota;
    public String gettipoMascota() {
        return tipoMascota;
    }
    public void tipoMascota(String tipoMascota){
        this.tipoMascota = tipoMascota;
    }

    private String nombreCompleto;
    public String getnombreCompleto() {
        return nombreCompleto;
    }
    public void setnombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    public void Mascota(){
        sc= new Scanner(System.in);

        solicitarNombremascota();
        nombreMascota= capturarDatoString();
        solicitarTipo();
        tipoMascota = capturarDatoString();
        edadMascota();
        edadMascota = capturarDatoString();
        nombreCompleto();
        nombreCompleto = leerNombre();
        
        System.out.println(" ");
        System.out.println(nombreMascota + " es un " + tipoMascota + " el cual tiene " + edadMascota + " años de edad,");
        System.out.println("y " + nombreCompleto + " es su dueño.");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------------------");

    }

    private void solicitarNombremascota(){
        System.out.println("Escriba el nombre de su Mascota:");
    }
    private void solicitarTipo(){
        System.out.println("Escriba que tipo de Mascota tiene:");

    }
    private void edadMascota(){
        System.out.println("Escriba la edad de su Mascota:");
    }
    private void nombreCompleto(){
        System.out.println("Escriba su nombre completo:");
    }
 
    private String capturarDatoString(){
        return sc.nextLine();
     }
    private String leerNombre(){
        return sc.nextLine();

    }


}
