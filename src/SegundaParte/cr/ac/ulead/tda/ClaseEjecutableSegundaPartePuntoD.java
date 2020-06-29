package SegundaParte.cr.ac.ulead.tda;

import Info_mascota.Mascota;
import Info_persona.Persona;
import Serializador.SerializadorUlead;

import java.util.Scanner;

public class ClaseEjecutableSegundaPartePuntoD {
    Scanner input = new Scanner(System.in);
    private SerializadorUlead  serializador[] = new SerializadorUlead[50];
    int inicio=-1;
    int fin=-1;
    int max = 50;


    private boolean colaLlena() {
        if (inicio == 0 && fin == this.max - 1) {
            return true;
        }
        if (inicio == fin + 1) {
            return true;
        }
        return false;
    }

    public boolean colaVacia() {
        if (fin == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresarCola(SerializadorUlead newSerializadorUlead) throws Exception  {
        if (colaLlena()) {
            throw new Exception("La cola esta llena \n");
        } else {
            if (inicio == -1)
                inicio = 0;
            fin = (fin + 1) % this.max;
            serializador[fin] = newSerializadorUlead;


        }
    }
    public SerializadorUlead eliminarCola() throws Exception {
        SerializadorUlead elminador_serializador;
        if (colaVacia()) {
            throw new Exception("La cola esta vacia, ingrese datos por favor\n");
        } else {
            elminador_serializador = serializador[inicio];
            if (inicio == fin) {
                inicio = -1;
                inicio = -1;
            } else {
                inicio = (inicio + 1) % this.max;
            }
            return elminador_serializador;
        }
    }
    }


