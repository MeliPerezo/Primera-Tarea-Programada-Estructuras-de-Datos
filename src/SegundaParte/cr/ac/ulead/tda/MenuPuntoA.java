package SegundaParte.cr.ac.ulead.tda;

import java.util.Scanner;

public class MenuPuntoA {
    Scanner input = new Scanner(System.in);
    ClaseEjecutableSeguntaPartePuntoA A = new ClaseEjecutableSeguntaPartePuntoA();
    public void menu() {
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la opcion que desea realizar: ");
        System.out.println("1. Ingresar datos a la pila");
        System.out.println("2. Ver datos de la pila");
        System.out.println("3. Eliminar datos de la pila");
        System.out.println("4. Salir");
        System.out.println("-------------------------------------------------");

        int option = input.nextInt();
        switch (option) {
            case 1:
                A.IngresarPila();
               menu();
                break;
            case 2:
                A.VerPila();
                menu();
                break;
            case 3:
                A.EliminarElemento();
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

