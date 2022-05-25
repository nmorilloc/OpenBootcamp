public class Main {
    public static void main(String[] args) {

        class Coche{
            //Variable para almacenar numero de puertas.
            public int cPuertas = 0;

            //Funcion que aumenta el numero de puertas.
            public void puertas(){
                this.cPuertas++;
            }
        }

        //Crear objeto.
        Coche miCoche = new Coche();
        miCoche.puertas(); //Aumentamos la cantidad de puertas.
        miCoche.puertas();
        miCoche.puertas();
        miCoche.puertas();
        System.out.println(miCoche.cPuertas);//Imprimimos

        //Llamada a la funcion suma y entrega de valores.
        System.out.println(suma(10, 25, 14));
    }


    public static int suma(int a, int b, int c) {
        return a + b + c;
        //Funcion que sume 3 elementos.
    }


}