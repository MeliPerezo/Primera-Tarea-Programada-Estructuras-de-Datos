package SegundaParte.cr.ac.ulead.tda;

import Info_mascota.Mascota;
import Info_persona.Persona;
import java.util.Scanner;

public class ClaseEjecutableSegundaPartePuntoD {
    Scanner input = new Scanner(System.in);
    public static Mascota pet[] = new Mascota[50];
    public static Persona person[] = new Persona[50];
    int inicio;
    int fin;
    int[] cola;
    boolean extraido;
    boolean insertado;
    int max = 50;
    static int contador = 0;

    ClaseEjecutableSegundaPartePuntoD() {
        cola = new int[50];
        inicio = 0;
        fin = inicio;
        extraido = true;
        insertado = false;
        int max = 50;
    }

    public void insertarMascota() {
        if (llenaPet()) {
            System.out.println("ERROR: COLA LLENA");

        } else {
            System.out.println("Ingrese la siguiente informacion: ");
            inicio = 0;
            pet[contador] = new Mascota(info_pet(), info_pet(), info_pet());
            System.out.println(pet[contador].SerializadorJson());
            contador++;
        }
    }

    public void insertarPersona() {
        if (llenaPerson()) {
            System.out.println("ERROR: COLA LLENA");

        } else {
            System.out.println("Ingrese la siguiente informacion: ");
            inicio = 0;
            person[contador] = new Persona(info_person(), info_person(), info_person(), info_person(), info_person());
            System.out.println(person[contador].SerializadorJson());
            contador++;
        }
    }

    private boolean llenaPet() {
        if (pet[50 - 1] != null) {
            return true;
        } else {
            return false;

        }
    }

    private boolean llenaPerson() {
        if (pet[50 - 1] != null) {
            return true;
        } else {
            return false;

        }
    }

    private String info_pet() {
        String[] info_mascota = {"Nombre : ", "Tipo de Animal : ", "Edad : "};
        System.out.println(info_mascota[inicio]);
        inicio++;
        return input.nextLine();
    }

    private String info_person() {
        String[] info_persona = {"Nombre: ", "Apellido: ", "Fecha de nacimiento: ", "Peso: ", "Estatura: "};
        System.out.println(info_persona[inicio]);
        inicio++;
        return input.nextLine();
    }


    public boolean vaciaPet() {
        if (pet[0] == null) {
            return true;
        } else {
            return false;
        }
    }
    public boolean vaciaPerson() {
        if (person[0] == null) {
            return true;
        } else {
            return false;
        }
    }
    public int extraerPet() {
        if (!vaciaPet()) {
            extraido = true;
            insertado = false;
            if (inicio == cola.length - 1) {
                inicio = 0;
                return cola[cola.length - 1];
            } else {
                inicio++;
                return cola[inicio - 1];
            }
        } else {
            System.out.println("ERROR: COLA VACIA");

            return 0;
        }
    }
    public int extraerPerson() {
        if (!vaciaPerson() ) {
            extraido = true;
            insertado = false;
            if (inicio == cola.length - 1) {
                inicio = 0;
                return cola[cola.length - 1];
            } else {
                inicio++;
                return cola[inicio - 1];
            }
        } else {
            System.out.println("ERROR: COLA VACIA");

            return 0;
        }
    }


}
