package SegundaParte.cr.ac.ulead.tda;

import InterfazUsuario.Ayudadores;

import java.util.Scanner;

public class MenuPuntoC {
    Scanner input = new Scanner(System.in);
    ClaseEjecutableSegundaPartePuntoC C = new ClaseEjecutableSegundaPartePuntoC();

    public void menu2() throws Exception {
        Ayudadores ayuda = new Ayudadores();
        int i = 0;
        while (i < 50) {
            ayuda.menu2();
            int option = input.nextInt();
            switch (option) {
                case 1:
                    C.ingresarCola(ayuda.llenar_InformacionMascota());

                    break;
                case 2:
                    System.out.println(C.eliminarCola());
                    break;

                case 3:
                    System.out.println("Ha salido :(");
                    i=51;
                    break;

                default:
                    System.out.println("Opcion desconocida");


            }

        }
    }


}



