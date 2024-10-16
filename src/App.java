import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Persona> listaPersonas = new ArrayList<>();  

        System.out.print("Cantidad de personas que se dea ordenar");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\nPersona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Edad: ");
            int edad = scanner.nextInt();
            scanner.nextLine();  

            Persona persona = new Persona(nombre, edad);
            listaPersonas.add(persona);
        }

        System.out.println("\nLista de personas ingresadas:");
        for (Persona persona : listaPersonas) {
            persona.mostrarDatos();
        }
        

        
    }

}
