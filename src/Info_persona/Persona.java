package Info_persona;
import Serializador.SerializadorUlead;

public class Persona implements SerializadorUlead {
    private String Nombre;
    private String Apellido;
    private String FechaNacimiento;
    private String Peso;
    private String Estatura;



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
        return "<?xml version= 1.0 " + "\n" + "<Persona> \n" +  "<Nombre>" + getNombre() +"</Nombre>"   +  "\n <Apellido>" +  getApellido() +"</Apellido>"+ "\n <Fecha de nacimiento>" + getEstatura() +"</Fecha de nacimiento>"+ "\n <Peso>" + getPeso() +"</Peso>"+ "\n <Estatura >" + getEstatura() +"</Estructras> " + "\n </Persona>";
    }

    @Override
    public  String SerializadorJson() {
        return "{\n" + "Nombre: "+ getNombre()  + "\n Apellido: " + getApellido() + "\n Fecha de nacimiento: "+ getFechaNacimiento() + "\n Peso: "+getPeso() + "\n Estatura: "+ getEstatura() + "\n}";

    }
}
