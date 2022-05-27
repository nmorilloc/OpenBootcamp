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

        /*
        Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3,
        el bloque de código que tendrá el bucle deberá:
            Incrementar el valor de la variable en uno cada vez que se ejecute.
            Mostrarlo por pantalla cada vez que se ejecute.
         */
        var numeroWhile = 0;

        while(numeroWhile < 3){
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        var numeroDoWhile = 0;

        do{
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        }while(numeroDoWhile < 1);

        /*
        Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y
        su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor
        cada vez que se ejecute y deberá mostrarse por pantalla.
         */
        for(var numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        /*
        Por último, para el Switch, deberás crear la variable estacion, y distintos case
        para las cuatro estaciones del año. Dependiendo del valor de la variable estacion
        se deberá mandar un mensaje por consola informando de la estación en la que está.
        También habrá que poner un default para cuando el valor de la variable no sea una estación.
         */
        var estacion = "Invierno";

        switch(estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Primavera":
                System.out.println("Es primaver");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("Introduce una estacion valida.");
        }

    }
}