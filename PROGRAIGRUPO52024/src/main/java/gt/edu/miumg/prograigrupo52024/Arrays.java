package gt.edu.miumg.prograigrupo52024;
import java.util.Scanner;

public class Arrays {
    
public static void Array() {
        Scanner sc = new Scanner(System.in);
        Animal[] animales = new Animal[20];
        int number = 0;
        
        while (number < animales.length) {
            System.out.print("Ingrese el nombre del animal: ");
            String nombre = sc.nextLine();
            System.out.print("Ingrese la edad del animal: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese el peso del animal (kg): ");
            double peso = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingrese la dieta del animal: ");
            String dieta = sc.nextLine();

            animales[number] = new Animal(nombre, edad, peso, dieta) {};
            number++;

            if (number < animales.length) {
                System.out.print("¿Desea continuar agregando animales? (sí/no): ");
                String respuesta = sc.nextLine().toLowerCase();
                if (!respuesta.equals("si")) {
                    break;
                }
            } else {
                System.out.println("El array está lleno.");
            }
        }

        System.out.println("\nAnimales almacenados:");
        for (int i = 0; i < number; i++) {
            System.out.println(animales[i]);
        }
    }
}     
         
