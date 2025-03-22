package gt.edu.miumg.prograigrupo52024;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Archivo {
    
private static Formatter salida;
    
    public static void abrirArchivo() {
        try{
            salida = new Formatter("ListadeAnimales.txt");
        } catch (SecurityException securityException) {
            System.err.println("Permiso de escritura denegado. Termintado");
            System.exit(1);
        } catch (FileNotFoundException fileNotFoundException) {
            System.err.println("Error al abrir el archivo.Terminado.");
            System.exit(1);
        }
    }
    
    public static void agregarRegistros() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Para finalizar el ingreso teclee \"salir\"");
        System.out.println("Escriba un animal, tipo de animal, cuanto come en KG");
        
        while (!entrada.hasNext("salir"))
        {
            try{
                salida.format("%s %s %.2f%n", entrada.next(), 
                        entrada.next(), entrada.nextDouble());                
            } catch (FormatterClosedException formatterClosedException) {
                System.err.println("Error al escroibir en el Archivo. Terminado.");
                break;               
            } catch (NoSuchElementException elemtException) {
                System.err.println("Entrada invalida. Intente de nuevo");
                entrada.nextLine();
            }
            
            System.out.println("Ingrese un nuevo registro o teclee \"salir\" para finalizar el programa400");
        }
    }
    
    public static void cerrarArchivos() {
        if (salida != null) {
            salida.close();
        }
    }
}
