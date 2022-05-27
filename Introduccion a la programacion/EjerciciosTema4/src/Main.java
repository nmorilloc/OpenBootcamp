public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        var numeroIf = 19;

        if(numeroIf > 0){
            System.out.println(numeroIf + " es un numero positivo.");
        }else if(numeroIf == 0){
            System.out.println("Es " + numeroIf);
        }else if(numeroIf < 0){
            System.out.println(numeroIf + " es un numero negativo.");
        }else{
            System.out.println("Introduce un numero valido");
        }
    }
}