import java.util.Scanner;

public class Clases {

    int numero1 = 10; // Variable a nivel global
    int numero2 = 20; // Variable a nivel global
    int numero3 = 10;

    String nombre = "Pepito";

    Scanner teclado = new Scanner(System.in); //Objeto para tomar los datos

    public void primera_clase_variable_toma_datos() {

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

    public void segunda_clase_condicionales() {

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

        if (numero1 > 10 && numero2 < 4) { // Condicional con dos preguntas y las dos deben ser verdaderas

        }

        if (numero1 > 10 || numero2 < 4) { // Condicional donde uan de las 2 preguntas debe ser correcta para ingresar

        }

        if ((numero1 > 10 || numero2 < 4) || (numero2 == 20 || numero1 <= 1)) {  // Agrupaciones de condicionales

        }

        if (numero1 > 10 || numero2 < 4) {  // Condicional con doble accion (Una accion para true y otra para false)

        } else {

        }


    }

    public void tercera_clase_condicionales_anidados() {

        // If anidados
        System.out.println("Ingrese el primer valor");
        numero1 = teclado.nextInt();

        System.out.println("Ingrese el segundo valor");
        numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println("El primer valor es mayor que el segundo");

            if (numero3 < 20) {
                System.out.println("El numero 3 es menor que 20");

                if (numero1 == 10) {
                    System.out.println("El primer valor es igual a 10");

                } else {
                    System.out.println("El primer valor es diferente de 10");
                }
            }

        } else {
            /*if (){

            }
             */
            System.out.println("El segundo valor es mayor que el primero");
        }


    }

    public void tercera_clase_condicionales_swtich() {

        // Swtich case
        switch (numero1) {  //Variable numerica

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

        switch (nombre) {  //Variable de texto
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

    public void ejercicios_condicionales_anidados() {

        int numHoras = 0;
        int salarioTotal;
        int extras = 0;

        System.out.println("Ingrese el numero de horas trabajadas");
        numHoras = teclado.nextInt();

        /*
        if (numHoras>0){

            if (numHoras <= 40){
                salarioTotal = numHoras * 16;
                System.out.println("El salario total del trabajador es: " + salarioTotal);
            }else {
                extras = numHoras - 40;
                salarioTotal = (40 * 16) + (extras * 20);
                System.out.println("El salario total del trabajador es: " + salarioTotal);
            }

        }else {
            System.out.println("No puede ingresar numeros negativos");
        }
         */

        switch (numHoras) {

            case 10:
                System.out.println("El trabajador trabajo un tercio de la jornada");
                break;

            case 20:
                System.out.println("El trabajador trabajo dos tercios de la jornada");
                break;

            case 30:
                System.out.println("El trabajador trabajo la jornada completa");
                break;

            default:
                System.out.println("El numero de horas ingresadas no corresponde a ninguna respuesta");
        }


    }

    public void vectores_matrices() {

        // ******************* VECTORES ****************
        System.out.println("******************* VECTORES ****************");
        String nombres[] = new String[10]; // Inicializar un vector, el 10 inidica el tamaño
        int precios[] = new int[10]; // Inicializar un vector, el 10 inidica el tamaño

        nombres[0] = "Shampoo"; // Guarda data en la posicion indicada
        nombres[1] = "Arena"; // Guarda data en la posicion indicada

        precios[0] = 1000; // Guarda data en la posicion indicada
        precios[1] = 2000; // Guarda data en la posicion indicada

        int suma = precios[0] + precios[1]; // Suma de los valores que guardamos
        System.out.println("La suma es: " + suma); // impresion Suma de los valores que guardamos
        System.out.println("la resta es: " + (precios[0] - precios[1])); // impresion resta de los valores que guardamos


        System.out.println(precios[5]); // Imprimirá un null ya que no hay datos guardados en esa posicion
        System.out.println(nombres[5]); // Imprimirá un null ya que no hay datos guardados en esa posicion

        System.out.println("El tamaño del vector es: " + precios.length);

        // ****************** MATRICES ****************
        System.out.println("******************* MATRICES ****************");
        String nombres_matriz[][] = new String[5][10]; // Inicializar una matriz
        int precios_matriz[][] = new int[5][10]; // Inicializar una matriz


        nombres_matriz[1][1] = "Shampoo";
        nombres_matriz[2][3] = "arena";

        precios_matriz[1][1] = 1000;
        precios_matriz[2][3] = 2000;

        int suma_matrices = precios_matriz[1][1] + precios_matriz[2][3]; // Suma de los valores que guardamos
        System.out.println("La suma es: " + suma_matrices);
        System.out.println("La resta es: " + (precios_matriz[1][1] - precios_matriz[2][3]));

        System.out.println(precios_matriz[4][4]); // Imprimirá un null ya que no hay datos guardados en esa posicion
        System.out.println(nombres_matriz[4][4]); // Imprimirá un null ya que no hay datos guardados en esa posicion

        System.out.println("El tamaño de la matriz es: " + precios_matriz.length);

        //COmentariooo


    }

    public void ejercicio_notas_vectores() {

        Scanner teclado = new Scanner(System.in);
        double[] notas = new double[5];
        double media;

        System.out.println("Ingrese la primera nota");
        notas[0] = teclado.nextDouble();
        System.out.println("Ingrese la segunda nota");
        notas[1] = teclado.nextDouble();
        System.out.println("Ingrese la tercera nota");
        notas[2] = teclado.nextDouble();
        System.out.println("Ingrese la cuarta nota");
        notas[3] = teclado.nextDouble();
        System.out.println("Ingrese la quinta nota");
        notas[4] = teclado.nextDouble();


        if (notas[0] >= 0 && notas[1] >= 0 && notas[2] >= 0 && notas[3] >= 0 && notas[4] >= 0) {

            if (notas[0] <= 10 && notas[1] <= 10 && notas[2] <= 10 && notas[3] <= 10 && notas[4] <= 10) {

                System.out.println("Las notas son \n" + notas[0] + "\n" + notas[1]);
                System.out.println(notas[0]);
                System.out.println(notas[1]);
                System.out.println(notas[2]);
                System.out.println(notas[3]);
                System.out.println(notas[4]);

                media = (notas[0] + notas[1] + notas[2] + notas[3] + notas[4]) / notas.length;
                System.out.println("la nota media es: " + media);

            }

        } else {
            System.out.println("No se pueden agregar numeros menores a 0 ");
        }


    }

    public void quinta_clase(int numero_1, int numero_2){

        int resultado;

        resultado = numero_1 + numero_2;
        System.out.println(resultado);
        resultado = numero_1 - numero_2;
        System.out.println(resultado);
        resultado = numero_1 * numero_2;
        System.out.println(resultado);
        resultado = numero_1 / numero_2;
        System.out.println(resultado);


    }


}
