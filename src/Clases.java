import java.util.Scanner;

public class Clases {

    int numero1 = 10; // Variable a nivel global
    int numero2 = 20; // Variable a nivel global
    int numero3 = 10;

    String nombre = "Pepito";

    Scanner teclado = new Scanner(System.in); //Objeto para tomar los datos

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


        System.out.println("Ingrese el primer numero ");
        numero1 = teclado.nextDouble();                  // Guardamos el dato tomado de consola en la variable
        System.out.println("El Primer numero es: " + numero1);

    }

    public void segunda_clase_condicionales(){

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

    public void tercera_clase_condicionales_anidados(){

        // If anidados
        System.out.println("Ingrese el primer valor");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo valor");
        numero2 = teclado.nextInt();

        if (numero1 > numero2){
            System.out.println("El primer valor es mayor que el segundo");

            if (numero3 < 20){
                System.out.println("El numero 3 es menor que 20");

                if (numero1 == 10){
                    System.out.println("El primer valor es igual a 10");

                }else {
                    System.out.println("El primer valor es diferente de 10");
                }
            }

        }else {
            /*if (){

            }
             */
            System.out.println("El segundo valor es mayor que el primero");
        }








    }

    public void tercera_clase_condicionales_swtich(){

        // Swtich case
        switch (numero1){  //Variable numerica

            case 10:
                System.out.println("El numero 1 es igual a 10");
                break; //Siempre ponerlo

            case 2:
                System.out.println("El numero 1 es igual a 2");
                break;

            case 3:
                System.out.println("El numero 1 es igual a 3");
                break;

            case 4:
                System.out.println("El numero 1 es igual a 4");
                break;
            default:

        }

        switch (nombre){  //Variable de texto
            case "Andres":
                System.out.println("El numero 1 es igual a 10");
                break;

            case "Juanito":
                System.out.println("El numero 1 es igual a 2");
                break;

            case "Lili":
                System.out.println("El numero 1 es igual a 3");
                break;

            case "Yeimy":
                System.out.println("El numero 1 es igual a 4");
                break;

            default:
                System.out.println("No es ninguno de los nombres");

        }





    }


}
