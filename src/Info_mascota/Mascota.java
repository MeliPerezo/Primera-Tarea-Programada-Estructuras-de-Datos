package Info_mascota;
import Serializador.SerializadorUlead;

public class Mascota implements SerializadorUlead {

    private String Nombre;
    private String TipoAnimal;
    private String Edad;


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
        return "<?xml version= 1.0 "+ "\n <Mascota> "+ "\n" + "<Nombre>"+ getNombre() +"</Nombre>" + "\n<TipoAnimal>" + getTipoAnimal() +"</Tipo de Animal>" + "\n<Edad>" + getEdad() +"</Edad>"+"\n <Mascota>";
    }

    @Override
    public  String SerializadorJson() {
        return "{Nombre: "+ getNombre() + "\n Tipo de animal: "+ getTipoAnimal()
                + "\n Edad: "+ getEdad()+ "}";
    }
}
