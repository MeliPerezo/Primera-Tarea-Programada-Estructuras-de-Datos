package InterfazUsuario;

import java.util.Scanner;

public class Menú {
    Scanner input = new Scanner(System.in);
    int opcion;

    public void menu2() {
        Ayudadores ayuda = new Ayudadores();
        ayuda.menu01();
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Introduzca 1 si quiere XML Y 0 si quiere JSON");
                int opcion = input.nextInt();
                if (opcion == 0){
                    System.out.println( ayuda.llenar_InformacionPersona().SerializadorJson());
                }else if (opcion == 1){
                    System.out.println( ayuda.llenar_InformacionPersona().SerializadorXML());
                }else{
                    System.out.println("Inserte opcion correcta");
                }
                break;
            case 2:
                System.out.println("Introduzca 1 si quiere XML Y 0 si quiere JSON");
                int opcionMascota = input.nextInt();
                if (opcionMascota == 0){
                    System.out.println(ayuda.llenar_InformacionMascota().SerializadorJson());
                }else if (opcionMascota == 1){
                    System.out.println(ayuda.llenar_InformacionMascota().SerializadorXML());
                }else{
                    System.out.println("Inserte opcion correcta");
                }
                break;
            case 3:
                System.out.println("Ha salido :C");
                break;
            default:
                System.out.println("Opcion desconocida");
        }
    }
}


