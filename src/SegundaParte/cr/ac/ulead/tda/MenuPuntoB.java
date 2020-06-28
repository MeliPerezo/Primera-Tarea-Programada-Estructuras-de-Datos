package SegundaParte.cr.ac.ulead.tda;

import java.util.Scanner;

import static SegundaParte.cr.ac.ulead.tda.ClaseEjecutableSegundaPartePuntoB.contador;

public class MenuPuntoB {
    Scanner input = new Scanner(System.in);
    ClaseEjecutableSegundaPartePuntoB B = new ClaseEjecutableSegundaPartePuntoB();
    public void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la opcion que desea realizar: ");
        System.out.println("1. Ingresar datos a la pila");
        System.out.println("2. Ver datos de la pila");
        System.out.println("3. Eliminar datos de la pila");
        System.out.println("4. Mostrar la menor altura");
        System.out.println("5. Salir");
        System.out.println("-------------------------------------------------");

        int option = input.nextInt();
        switch (option) {
            case 1:
                B.IngresarPilaB();
                menu();
                break;
            case 2:
                B.VerPilaB();
                menu();
                break;
            case 3:
                B.EliminarElementoB();
                menu();
                break;
            case 4:
                B.menorAltura(contador - 1);
                menu();
                break;
            case 5:
                System.out.println("Ha salido :(");
                break;

            default:
                System.out.println("Opcion desconocida");
                menu();

        }

    }
}

