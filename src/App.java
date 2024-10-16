import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas: ");
        int cantidadPersonas = sc.nextInt();
        sc.nextLine();

        Persona[] personas = new Persona[cantidadPersonas];

        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\nIngrese datos de persona " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            personas[i] = new Persona(nombre, edad);
        }

        sortByEdad(personas);

        System.out.println("Personas ordenadas por edad:");
        System.out.println("\nPersonas ordenadas por edad:");
        printArray(personas);

        System.out.println("\nIngrese la edad a buscar:");
        int edadBuscada = sc.nextInt();
        int indice = findByEdad(personas, edadBuscada);
        if (indice != -1) {
            System.out.println("Persona encontrada: " + personas[indice]);
            System.out.println("\nLa persona con la edad " + personas[indice]+" se llama: ");
        } else {
            System.out.println("No se encontró ninguna persona con la edad ingresada.");
        }

        sc.close();
    }

    public static void sortByEdad(Persona[] personas) {
        int n = personas.length;
        for (int i = 1; i < n; i++) {
            Persona actual = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > actual.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = actual;
        }
    }

    public static void printArray(Persona[] personas) {
        for (Persona persona : personas) {
            System.out.print("| " + persona + " |");
        }
        System.out.println();
    }

    public static int findByEdad(Persona[] personas, int edad) {
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getEdad() == edad) {
                return i;
            }
        }
        return -1;
    }
}