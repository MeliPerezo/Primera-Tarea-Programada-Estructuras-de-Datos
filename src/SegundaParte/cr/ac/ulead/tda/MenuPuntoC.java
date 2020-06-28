package SegundaParte.cr.ac.ulead.tda;

import java.util.Scanner;

public class MenuPuntoC {
    Scanner input = new Scanner(System.in);
    ClaseEjecutableSegundaPartePuntoC C = new ClaseEjecutableSegundaPartePuntoC ();
    public void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la opcion que desea realizar: ");
        System.out.println("1. Ingresar datos a la cola");
        System.out.println("2. Ver datos de la cola");
        System.out.println("3. Eliminar datos de la cola");
        System.out.println("4. Salir");
        System.out.println("-------------------------------------------------");
        int option = input.nextInt();

        switch (option) {
            case 1:
                C.insertar();
                menu();
                break;
            case 2:
            C.mostrar();
                menu();
                break;
            case 3:
                C.extraer();
                menu();
                break;
            case 4:
                System.out.println("Ha salido :(");
                break;

            default:
                System.out.println("Opcion desconocida");
                menu();

        }

    }
}



