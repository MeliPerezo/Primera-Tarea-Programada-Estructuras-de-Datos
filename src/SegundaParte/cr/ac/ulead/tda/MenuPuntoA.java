package SegundaParte.cr.ac.ulead.tda;

import Info_persona.Persona;
import InterfazUsuario.Ayudadores;

import java.util.Scanner;

public class MenuPuntoA {
    Scanner input = new Scanner(System.in);
    ClaseEjecutableSeguntaPartePuntoA A = new ClaseEjecutableSeguntaPartePuntoA();
    public void menu() throws Exception {
        Ayudadores ayuda = new Ayudadores();
        int i=0;
        while(i<50) {
            ayuda.menu();
            int option = input.nextInt();
            switch (option) {
                case 1:
                    A.IngresarPila(ayuda.llenar_InformacionPersona());
                    i++;

                    break;
                case 2:
                    System.out.println(A.EliminarElemento());
                    break;
                case 3:
                    System.out.println("Ha salido :(");
                    i=51;
                    break;

            }
        }
    }
}

