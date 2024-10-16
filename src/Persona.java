import java.util.Scanner;

public class Persona {
    Scanner scanner = new Scanner(System.in);

    public String nombre;
    public int edad;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = scanner.nextLine();
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = scanner.nextInt();
    }


    public Persona() {

    }
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }



    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }
    
}
