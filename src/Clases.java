import java.util.Scanner;

public class Clases {

    int variable = 0; // Variable a nivel global

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

        Scanner teclado = new Scanner(System.in); //Objeto para tomar los datos

        System.out.println("Ingrese el primer numero ");
        numero1 = teclado.nextDouble();                  // Guardamos el dato tomado de consola en la variable
        System.out.println("El Primer numero es: " + numero1);

    }

    public void segunda_clase_condicionales(){

        variable = 2;
        int numero1 = 10;
        int numero2 = 6;

        // Operadores Logicos
        // Tipos :
        // >  mayor que
        // <  menor que
        // =  igual
        // <=  menor o igual que
        // >=  mayor o igual que
        // &&  y
        // ||  o


        //Condicionales    los condicionales siempre nos dan una respuesta o negativa o positiva

        if (numero1 > 10  && numero2 < 4) { // Condicional con dos preguntas y las dos deben ser verdaderas

        }

        if (numero1 > 10  || numero2 < 4){ // Condicional donde uan de las 2 preguntas debe ser correcta para ingresar

        }

        if (  (numero1 > 10  || numero2 < 4)   ||   (numero2 == 20 || numero1<=1 ) ){  // Agrupaciones de condicionales

        }

        if (numero1 > 10  || numero2 < 4){  // Condicional con doble accion (Una accion para true y otra para false)

        }else{

        }



    }



}
