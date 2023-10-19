public class ClaseConstructores {

    // Los constrcutores nos ayudan a tomar los datos para posteriormente utilizarlos si se quiere

    String nombre;
    String apellido;
    int edad;
    int telefono;
    String direccion;


    public ClaseConstructores(String nombre, String apellido, int edad, int telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public void imprimirDatos(){
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(edad);
        System.out.println(telefono);
        System.out.println(direccion);
    }












}
