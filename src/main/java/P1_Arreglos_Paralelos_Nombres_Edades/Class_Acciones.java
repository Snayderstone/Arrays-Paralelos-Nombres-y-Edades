package P1_Arreglos_Paralelos_Nombres_Edades;

import java.util.Scanner;

public class Class_Acciones {

    private String[] nombre;
    private int[] edades;

    public int Numero(int num) {
        do {
            try {
                Scanner leer = new Scanner(System.in);
                System.out.println("Introduzca el tamaño de la  LISTA");
                num = leer.nextInt();
                if (num <= 0) {
                    System.out.println("   Error! debe ser número positivo y mayor a 0");
                }
            } catch (Exception e) {
                System.out.println("    Error! debe ser número entero positivo");
            }
        } while (num <= 0);
        return num;
    }

    public void Encerar(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) //encerar o inicializar el arreglo
        {
            arreglo[i] = 0;
        }
    }

    public void SalidaPantallaValidos() {
        int i = 0;  
        
        System.out.print("\nNOMBRES: ");
        while ((i < nombre.length) && (nombre[i] != null)) {
            System.out.print(nombre[i] + "|");
            i++;
        }
        System.out.print("\nEDADES: ");
        int i2 = 0;
        while ((i2 < edades.length) && (edades[i2] != 0)) {
            
            System.out.print(" "+edades[i2] + " |");
            i2++;
        }

    }

    public static String contieneSoloLetras(String cadena) {

        String mensaje = "Exito";
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {

                System.out.println("Error! Solo se admiten LETRAS");
                mensaje = "Error! Solo se admiten LETRAS";
                return mensaje;

            }
        }
        return mensaje;
    }

    public void NuevoElemento(int rango) {

        int i = 0;

        char siguiente;
        nombre = new String[rango];
        edades = new int[rango];

        do {
            Scanner leer = new Scanner(System.in);
            do {
                System.out.println("\nIngrese el nombre ");
                nombre[i] = leer.nextLine();
                contieneSoloLetras(nombre[i]);

            } while (contieneSoloLetras(nombre[i]) != "Exito");

            Scanner leer2 = new Scanner(System.in);
            do {
                System.out.println("\nIngresar una Edad ");
                edades[i] = leer2.nextInt();

            } while (edades[i] <= 0);
            System.out.println("¿ Desea ingresar otro registro ? S/N: ");
            siguiente = leer.next().charAt(0);
            if (siguiente == 's' || siguiente == 'S') {
                i++;
            }
        } while ((siguiente == 's' || siguiente == 'S') && (i < nombre.length));

        /////////////////////////////
    }

    public String BuscarElemento(String buscar) {
        int posicion = 0;
        while (nombre[posicion] == buscar) {
            posicion++;
            if (posicion == nombre.length) {
                posicion = -1;
                break;
            }
        }
        return posicion + "";
    }

    public void InsertarElemento(int posicion) {
        // buscar si está libre el arreglo y tiene capacidad de almacenamiento
        int i = 0;
        int i2 = 0;
        String auxnombre = "";
        boolean libre = false;
        do {
            if (nombre[i] == null) {
                libre = true;
                break;
            }

            i++;
        } while (i < nombre.length);

        do {
            if (edades[i2] == 0) {
                libre = true;
                break;
            }

            i2++;
        } while (i2 < edades.length);

        if (libre) {

            Scanner leer2 = new Scanner(System.in);
            System.out.println("\nNombre  a insertar: ");
            auxnombre = leer2.nextLine();

            for (int j = i; j > posicion + 1; j--) {
                nombre[j] = nombre[j - 1];
            }
            nombre[posicion + 1] = auxnombre;

            int auxedad = 0;

            System.out.println("\nEdad  a insertar: ");
            auxedad = leer2.nextInt();

            for (int j = i; j > posicion + 1; j--) {
                edades[j] = edades[j - 1];
            }
            edades[posicion + 1] = auxedad;

        } else {
            System.out.println("El arreglo no tiene capacidad para insertar nuevos elementos");
        }

    }

}
