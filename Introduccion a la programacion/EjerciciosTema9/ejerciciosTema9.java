public class ejerciciosTema9 {
    public static void main(String[] args){
    /*
    Crea una clase Persona con las siguientes variables:
    La edad
    El nombre
    El teléfono

    Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

    Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

    Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
    */
    Cliente cliente = new Cliente();
    cliente.edad = 19;
    cliente.telefono = 1234;
    cliente.nombre = "Nata";
    cliente.credito = "Aprovado";

    System.out.println(cliente.edad);
    System.out.println(cliente.telefono);
    System.out.println(cliente.nombre);
    System.out.println(cliente.credito);
    
    Trabajador trabajador = new Trabajador();
    trabajador.edad = 25;
    trabajador.telefono = 124;
    trabajador.nombre = "Leo";
    trabajador.credito = "Denegado";
    trabajador.salario = 321;

    System.out.println(trabajador.edad);
    System.out.println(trabajador.telefono);
    System.out.println(trabajador.nombre);
    System.out.println(trabajador.credito);
    System.out.println(trabajador.salario);


    }
}
class Persona{
    int edad;
    String nombre;
    int telefono;
}
class Cliente extends Persona{
    String credito;
}
class Trabajador extends Cliente{
    int salario;
}