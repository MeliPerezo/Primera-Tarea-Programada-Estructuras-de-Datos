package SegundaParte.cr.ac.ulead.tda;

import Info_persona.Persona;

import java.util.Scanner;

public class ClaseEjecutableSeguntaPartePuntoA {
    Scanner input = new Scanner(System.in);
    int contador = 0;
    int inicio;
    int max = 50;
    int tope = 0;
    public static Persona person[] = new Persona[50];

    public void IngresarPila(Persona newPersona) {
        person[tope] = newPersona;
        tope++;

    }

    private boolean PilaLlena() {
        if (person[max - 1] != null) {
            return true;
        } else {
            return false;
        }
    }


    private boolean PilaVacia() {
        if (person[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    public String  EliminarElemento() throws Exception {
        if (PilaVacia()) {
            throw new Exception ("La cola esta vacia, ingrese datos por favor");
        } else {
            tope--;
            return person[tope].SerializadorJson();


        }
    }
}



