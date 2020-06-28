package SegundaParte.cr.ac.ulead.tda;

import Info_persona.Persona;

import java.util.Scanner;

public class ClaseEjecutableSeguntaPartePuntoA {
    Scanner input = new Scanner(System.in);
    static int contador = 0;
    int inicio;
    int max = 50;
    public static Persona person[] = new Persona[50];

    public void IngresarPila() {
        if (PilaLlena()) {
            System.out.println("La pila esta llena");
        } else {
            System.out.println("Ingrese la siguiente informacion: ");
            inicio = 0;

            person[contador] = new Persona(info_person(), info_person(), info_person(), info_person(), info_person());

            System.out.println(person[contador].SerializadorJson());
            contador++;
        }
    }

    private boolean PilaLlena() {
        if (person[max - 1] != null) {
            return true;
        } else {
            return false;
        }
    }

    private String info_person() {
        String[] info_persona = {"Nombre: ", "Apellido: ", "Fecha de nacimiento: ", "Peso: ", "Estatura: "};
        System.out.println(info_persona[inicio]);
        inicio++;

        return input.nextLine();
    }

    public void VerPila() {
        if (PilaVacia()) {
            System.out.println("La pila esta vacia, no hay elementos que mostrar");
        } else {
            for (int i = max - 1; i >= 0; i--) {
                if (person[i] != null) {
                    System.out.println(person[i].SerializadorJson());

                }

            }
        }
    }

    private boolean PilaVacia() {
        if (person[0] == null) {
            return true;
        } else {
            return false;
        }
    }

    public void EliminarElemento() {
        if (PilaVacia()) {
            System.out.println("La pila esta vacia");
        } else {
            contador--;
            person[contador] = null;


                 System.out.println("Ha sido eliminado");
             }


            }
        }



