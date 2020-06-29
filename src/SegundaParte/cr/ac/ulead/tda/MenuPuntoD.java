package SegundaParte.cr.ac.ulead.tda;

import InterfazUsuario.Ayudadores;

import java.util.Scanner;

public class MenuPuntoD {
    ClaseEjecutableSegundaPartePuntoD D = new ClaseEjecutableSegundaPartePuntoD();
    Scanner input = new Scanner(System.in);

    public void menu3() throws Exception {
        Ayudadores ayuda = new Ayudadores();
        int i = 0;
        while (i < 50) {
            ayuda.menu3();
            int option = input.nextInt();
            switch (option) {
                case 1:
                    D.ingresarCola(ayuda.llenar_InformacionMascota());
                    i++;
                    break;
                case 2:
                    D.ingresarCola(ayuda.llenar_InformacionPersona());
                    i++;
                    break;
                case 3:

                    System.out.println(D.eliminarCola().SerializadorXML());
                    break;
                case 4:
                    System.out.println("Ha salido :(");
                    i = 51;
                    break;

                default:
                    System.out.println("Opcion desconocida");


            }

        }
    }
}

