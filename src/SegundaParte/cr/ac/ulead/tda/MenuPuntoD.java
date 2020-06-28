package SegundaParte.cr.ac.ulead.tda;

import java.util.Scanner;

public class MenuPuntoD {
    ClaseEjecutableSegundaPartePuntoD D = new ClaseEjecutableSegundaPartePuntoD();
        Scanner input = new Scanner(System.in);
        public void menu() {
            System.out.println("------------------------------------------------");
            System.out.println("Ingrese la opcion que desea realizar: ");
            System.out.println("1. Ingresar datos de Mascota a la cola");
            System.out.println("2. Ingresar datos de Persona a la cola");
            System.out.println("3. Eliminar datos de la cola");
            System.out.println("4. Salir");
            System.out.println("-------------------------------------------------");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    D.insertarMascota();
                    menu();
                    break;
                case 2:
                    D.insertarPersona();
                    menu();
                    break;
                case 3:
                    D.extraerPerson();
                    D.extraerPet();
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


