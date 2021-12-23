package P1_Arreglos_Paralelos_Nombres_Edades;

import java.util.Scanner;

public class P1_Resgistro_Nombres_Edades {

    public static void main(String[] args) {

        // declarar el arreglo
        int n = 0;
 int  posicion;
        Class_Acciones f = new Class_Acciones();
        n = f.Numero(n);
        f.NuevoElemento(n);
        f.SalidaPantallaValidos();
        System.out.println("\n\t---AGENDA----");
        System.out.println("\n<<Menú de opciones>>");
        System.out.println("1. Registrar por busqueda");
        System.out.println("0. Salir");
        int opcion = 0;
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();

        switch (opcion) {
            case 1 -> {
                String buscar = "";
                   System.out.println("Ingrese nombre a buscar");
                Scanner leer2 = new Scanner(System.in);
                buscar = leer2.nextLine();
                
                posicion=Integer.parseInt(f.BuscarElemento(buscar));
              
              if (posicion >=0)
                {
                    System.out.println("El número "+buscar+" está en ubicación: "+(posicion+1));
                     f.InsertarElemento(posicion);
                     System.out.println();
                     f.SalidaPantallaValidos(); 
                }
                else
                    System.out.println(buscar+" no existe en arreglo");
            }

            case 2 -> {
                break;

            }
            case 3 -> {

            }
        }

    }
}
