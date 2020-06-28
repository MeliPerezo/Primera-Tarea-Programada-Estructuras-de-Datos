package Info_persona;
import Serializador.SerializadorUlead;

public class Persona implements SerializadorUlead {
    private String Nombre;
    private String Apellido;
    private String FechaNacimiento;
    private String Peso;
    private String Estatura;

    public Persona(String nombre, String apellido, String fechaNacimiento, String peso, String estatura) {
        Nombre = nombre;
        Apellido = apellido;
        FechaNacimiento = fechaNacimiento;
        Peso = peso;
        Estatura = estatura;
    }



    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public String getPeso() {
        return Peso;
    }

    public void setPeso(String peso) {
        Peso = peso;
    }

    public String getEstatura() {
        return Estatura;
    }

    public void setEstatura(String estatura) {
        Estatura = estatura;
    }

    @Override
    public String SerializadorXML() {
        return "<?xml version= 1.0 " + "\n" + "<Nombre>" + Nombre +"</Nombre>"  +  "\n <Apellido>" +  Apellido  +"</Apellido>"+ "\n<Fecha de nacimiento>" + FechaNacimiento +"</Fecha de nacimiento>"+ "\n<Peso>" + Peso +"</Peso>"+ "\n<Estatura >" + Estatura +"</Estructras>";
    }

    public  String SerializadorJson() {
        return "{\n" + "Nombre: "+Nombre + "\n Apellido: "+Apellido + "\n Fecha de nacimiento: "+FechaNacimiento+ "\n Peso: "+Peso + "\n Estatura: "+Estatura+ "\n}";

    }
}
