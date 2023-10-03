// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Persona p1=new Persona("JPG",25,"conocido");
        /*
        p1.nombre="JPG";
        p1.domicilio="Conocido";
        p1.edad=24;
        */
        Persona persona2=new Persona();

        System.out.println("Persona 1 nombre "+p1.getNombre());
        System.out.println("Persona 1 edad "+p1.getEdad());
        System.out.println("Persona 1 domicilio "+p1.getDomicilio());
        System.out.println(p1);
        System.out.println(new Persona().getDomicilio());
    }
}