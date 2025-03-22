package gt.edu.miumg.prograigrupo52024;

import java.util.Scanner;

/**
 *Menu Principal con Opciones 
 * @author loren
  */
public class PROGRAIGRUPO52024 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        int eleccion;
        do{
           System.out.println(" Menu Principal ");
           System.out.println("1.Zoo");
           System.out.println("2. Fase II");
           System.out.println("3. Fase III");
           System.out.println("4. Salir");
           System.out.println("Ingrese un numero para elegir una Opcion");
           
           eleccion = sc.nextInt();
           
           switch (eleccion) {
               case 1:
                   menuZoo(sc);
                   break;
               case 2:
                   System.out.println("2");
                   break;
               case 3:
                   System.out.println("3");
                   break;
               case 4:
                   System.out.println("Saliendo del programa");
                   System.out.println("Adios, vuelve pronto");
                   break;
               default:
                   System.out.println("opcion no valida, selecciona un numero del 1 al 4");
                             }
           
           }while (eleccion !=4);
        
      
        }
    
    public static void menuZoo(Scanner sc) {
        int opcion;
        Archivo ob = new Archivo();
        Leer le = new Leer();
        do {
            System.out.println("\n Menú Zoo ");
            System.out.println("1. Agregar nuevo animal y cantidad de comida que come");
            System.out.println("2. Ver todos los animales del Zoo");
            System.out.println("3. Exportar datos a CSV");
            System.out.println("4. Volver al menú principal");
            System.out.print("Ingrese un numero para elegir una Opcion");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Opción 1: Agregar nuevo animal y la cantidad de comida que come.");
                      Archivo.abrirArchivo();
                      Archivo.agregarRegistros();
                      Archivo.cerrarArchivos();
                    
                    break;
                case 2:
                    System.out.println("Opción 2: Mostrar todos los animales del Zoo.");
                      Leer.abrirArchivo();
                      Leer.leerRegistros();
                      Leer.cerrarArchivo();
                    break;
                case 3:
                    System.out.println("Opción 3: Exportar datos a CSV.");
                    // Aquí iría el código para exportar los datos a un archivo CSV.
                    break;
                case 4:
                    System.out.println("Volviendo al menú principal...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor seleccione entre 1 y 4.");
            }
        } while (opcion != 4);
    }
    
}