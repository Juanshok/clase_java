import java.util.Scanner;

public class Clases {

    public void primera_clase_variable_toma_datos(){

        //Definicion de variables
        String nombre = "Juan";
        byte llave = 1;
        int edad = 0;
        long cedula1 = 15;
        float resultado = 10.1F;
        double resultado2 = 1.025;
        String cedula = "545565454asd5";
        boolean resultado4 = false;

        // Impresiones
        System.out.println(edad + " Juasdasd " + nombre);
        System.out.println(nombre);


        // Toma de datos por consola
        double numero1 = 12;
        double numero2 = 23;
        double resul = numero1 * numero2;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero ");
        numero1 = teclado.nextDouble();
        System.out.println("El Primer numero es: " + numero1);

    }

    public void segunda_clase_condicionales(){


    }


}
