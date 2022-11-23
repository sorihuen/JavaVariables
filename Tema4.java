import java.util.Scanner;

public class Tema4 {

    private Scanner sc= new Scanner(System.in);
    private String ciudad;

    public String getciudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    private String pais;

    public String getPais() {
        return pais;
    }

    public void setPais (String pais) {
        this.pais = pais;
    }
    public void Lugar(){
        sc= new Scanner(System.in);

        solicitarCiudad();
        ciudad = capturarDato();
        solicitarPais();
        pais = capturarDato();
        System.out.println("  ");
        System.out.println ("La Ciudad " + ciudad +  " es la capital del Pais de " + pais);
        System.out.println("");
        System.out.println("-------------------------------------------");

       
        
    

    }
    private void solicitarCiudad(){
        System.out.println("Escriba el nombre de una Ciudad:");
    }

    private void solicitarPais(){
        System.out.println("A cual Pais pertenece esa Ciudad:");
    }
    private String capturarDato(){
        return sc.nextLine();
     }





}   
