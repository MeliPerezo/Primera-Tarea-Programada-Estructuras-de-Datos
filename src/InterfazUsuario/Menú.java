package InterfazUsuario;
import Info_mascota.Mascota;
import Info_persona.Persona;

import java.util.Scanner;

public class Menú {
    Scanner input = new Scanner(System.in);
    int opcion;
    int contador=0;
    Persona person;
    Mascota pet; 
    public void menu2 (){
        System.out.println("¡Hola, bienvenido!");
        System.out.println("Escriba la opcion que desea realizar: ");
        System.out.println("1. Registar sus datos personales");
        System.out.println("2. Registar los datos de su mascota");
        System.out.println("3. Salir");


        opcion = input.nextInt();

        switch(opcion){
            case 1:
                registar_persona();
                break;
            case 2:
                registar_mascota();
                break;
            case 3:
                System.out.println("Ha salido :C");
                break;
            default:
                System.out.println("Opcion desconocida");
        }

    }


    public void registar_mascota() {
        input.nextLine();
      pet = new Mascota(info_pet(), info_pet(), info_pet());
        System.out.println("De qué manera desea obtener informacion: \n" + "1. Serializar en XML \n" + "2. Serializar en Json");
          SerializarcasePet(); 

        
    }

    private void SerializarcasePet() {
        switch (input.next()) {
            case "1":
                System.out.println(pet.SerializadorXML());

                break;
            case "2":
                System.out.println(pet.SerializadorJson());
                break;
            default:
                System.out.println("Opcion desconocida");
        }
    }

    public void registar_persona() {
input.nextLine();
         person = new Persona(info_person(),info_person(),info_person(),info_person(),info_person());
        System.out.println("Escriba la opcion que desea realizar: ");
        System.out.println("1. Serializar en XML");
        System.out.print("2. Serializar en Json\n");
        Serializarcase();
    }

    private void Serializarcase() {

        switch (input.next()) {
            case "1":
                System.out.println(person.SerializadorXML());
                break;
            case "2":
                System.out.println(person.SerializadorJson());
                break;
            default:
                System.out.println("Opcion desconocida");
                Serializarcase();
        }
    }

    private String info_person(){
        String [] info_persona = {"Nombre: ", "Apellido: ", "Fecha de nacimiento: ", "Peso: ", "Estatura: "};
        System.out.println(info_persona[contador]);
        contador++;

        return input.nextLine();
    }
    private String info_pet(){ 
        String[] info_mascota = {"Nombre: ", "Tipo de Animal: ", "Edad: "};
       System.out.println(info_mascota[contador]);
        contador++;
        return input.nextLine();

    }
}


