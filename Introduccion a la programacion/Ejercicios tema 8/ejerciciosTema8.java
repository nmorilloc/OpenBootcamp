public class ejerciciosTema8 {
    public static void main(String[] args){
    /*
    Para practicar la encapsulación:
        Crear clase Persona.
        Crear variables las privadas edad, nombre y telefono de la clase Persona.
        Crear gets y sets de cada propiedad.
        Crear un objeto persona en el main.
        Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola.    
    */

    Persona persona = new Persona();

    persona.setEdad(19);
    persona.setNombre("Natanael");
    persona.setTelefono(0323);

    System.out.println(persona.getEdad());
    System.out.println(persona.getNombre());
    System.out.println(persona.getTelefono());


    }
}
class Persona{
    private int edad;
    private String nombre;
    private int telefono;

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}