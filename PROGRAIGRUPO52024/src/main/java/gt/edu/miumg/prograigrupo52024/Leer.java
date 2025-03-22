package gt.edu.miumg.prograigrupo52024;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Leer {
   private static Scanner entrada;
    
    public static void abrirArchivo(){
        try{
            entrada = new Scanner(Paths.get("ListadeAnimales.txt"));           
        } catch (IOException ioException){
            System.err.println("Error al abrir el archivo. Terminado.");
            System.exit(1);
        }
    }
    
    public static void leerRegistros(){
        System.out.printf("%-12s%-12s%10s%n", "Animal", "Tipo Animal", "Comida en KG");
        try{
            while(entrada.hasNext())
            {
                System.out.printf("%-12s%-12s%10s%n", entrada.next(), entrada.next(), entrada.nextDouble());
            }
        } catch (NoSuchElementException elementException) {
            System.err.println("El archivo no esta bien Formado. Terminado."); 
        } catch (IllegalStateException stateException) {
            System.err.println("Error al leer del archivo. Terminado.");
        }
    }
    
    public static void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        }
    }
}
