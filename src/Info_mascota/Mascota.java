package Info_mascota;
import Serializador.SerializadorUlead;

public class Mascota implements SerializadorUlead {

    private String Nombre;
    private String TipoAnimal;
    private String Edad;

    public Mascota(String nombre , String tipoAnimal, String edad) {
      Nombre = nombre;
       TipoAnimal = tipoAnimal;
        Edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getTipoAnimal() {
        return TipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        TipoAnimal = tipoAnimal;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }


    @Override
    public  String SerializadorXML() {
        return "<?xml version= 1.0 " + "\n" + "<Nombre>"+ Nombre +"</Nombre>" + "\n<TipoAnimal>" + TipoAnimal +"</Tipo de Animal>" + "\n<Edad>" + Edad +"</Edad>";
    }

    public  String SerializadorJson() {
        return "Nombre: "+Nombre + "\n Tipo de animal: "+TipoAnimal  + "\n Edad: "+Edad;
    }
}
