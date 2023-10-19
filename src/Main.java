import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Clases clases = new Clases(); // Objeto de la clase clases

        //clases.primera_clase_variable_toma_datos();
        //clases.segunda_clase_condicionales();
        //clases.tercera_clase_condicionales_anidados();
        //clases.tercera_clase_condicionales_swtich();
        //clases.ejercicios_condicionales_anidados();
        //clases.vectores_matrices();

        /*Scanner teclado = new Scanner(System.in); //Objeto para tomar los datos
        int numero1;
        int numero2;

        System.out.println("Ingrese los valores");
        numero1 = teclado.nextInt();
        numero2 = teclado.nextInt();


        clases.quinta_clase(numero1,numero2);
        clases.quinta_clase(50,15);

         */
        String nombre;
        String apellido;
        int edad;
        int telefono;
        String direccion;


        Scanner teclado = new Scanner(System.in); //Objeto para tomar los datos

        /*
        System.out.println("Ingrese los valores");
        nombre = teclado.nextLine();
        apellido = teclado.nextLine();
        edad = teclado.nextInt();
        telefono = teclado.nextInt();
        System.out.println("Ingrese direccion");
        direccion = teclado.nextLine();

         */

        //ClaseConstructores claseConstructores = new ClaseConstructores(nombre, apellido,edad,telefono,direccion);

        //claseConstructores.imprimirDatos();


        int suma = clases.suma(10,15);
        int multi = clases.multiplicacion(5,6);
        int resultado = suma + multi;

        System.out.println("La suma es: " + suma);
        System.out.println("La multiplicacion es: " + multi);
        System.out.println("El resultado es: "+ resultado);

        /*

        Realizar las operaciones matematicas (suma, resta, multiplicacion, division y modulo)
        utilizando contructor y creando los metodos con return para posteriormente imprimir los resultados por consola

        y añadir nombre y apellido con return

         */


    }
}
