package InterfazUsuario;

import Info_mascota.Mascota;
import Info_persona.Persona;

import java.util.Scanner;

public class Ayudadores {
    Scanner input = new Scanner(System.in);

    public Persona llenar_InformacionPersona() {
        Persona persona = new Persona();
        System.out.println("------------------------------------------");
        System.out.println("Ingrese la informacion: ");
        System.out.println("Nombre: ");
        persona.setNombre(input.nextLine());
        System.out.println("Apellido: ");
        persona.setApellido(input.nextLine());
        System.out.println("Fecha de Nacimiento: ");
        persona.setFechaNacimiento(input.nextLine());
        System.out.println("Peso: ");
        persona.setPeso(input.nextLine());
        System.out.println("Estatura: ");
        persona.setEstatura(input.nextLine());
        System.out.println("------------------------------------------");
        return persona;
    }

    public Mascota llenar_InformacionMascota() {
        Mascota mascota = new Mascota();
        System.out.println("Nombre: ");
        mascota.setNombre(input.nextLine());
        System.out.println("Tipo de Animal: ");
        mascota.setTipoAnimal(input.nextLine());
        System.out.println("Edad: ");
        mascota.setEdad(input.nextLine());

        return mascota;
    }

    public void menu() throws Exception {
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la opcion que desea realizar: ");
        System.out.println("1. Ingresar datos a la pila");
        System.out.println("2. Eliminar datos de la pila");
        System.out.println("3. Salir");
        System.out.println("-------------------------------------------------");
    }

    public void menu2() {
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la opcion que desea realizar: ");
        System.out.println("1. Ingresar datos a la cola");
        System.out.println("2. Eliminar datos de la cola");
        System.out.println("3. Salir");
        System.out.println("-------------------------------------------------");
    }

    public void menu3() {
        System.out.println("------------------------------------------------");
        System.out.println("Ingrese la opcion que desea realizar: ");
        System.out.println("1. Ingresar datos de Mascota a la cola");
        System.out.println("2. Ingresar datos de Persona a la cola");
        System.out.println("3. Eliminar datos de la cola");
        System.out.println("4. Salir");
        System.out.println("-------------------------------------------------");
    }

    public void menu01() {
        System.out.println("¡Hola, bienvenido!");
        System.out.println("Escriba la opcion que desea realizar: ");
        System.out.println("1. Registar sus datos personales");
        System.out.println("2. Registar los datos de su mascota");
        System.out.println("3. Salir");

    }
}