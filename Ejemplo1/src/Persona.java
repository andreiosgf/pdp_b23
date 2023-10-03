public class Persona {

    String nombre;
    int edad;
    String domicilio;

    public Persona(String n,int e,String d)
    {
        nombre=n;
        edad=e;
        domicilio=d;
    }

    public void setNombre(String n)
    {
        nombre=n;
    }

    public Persona()
    {
        nombre="";
        edad=0;
        domicilio="";
    }

    public String getNombre()
    {
        return nombre;
    }

    public int getEdad()
    {
        return edad;
    }

    public String getDomicilio()
    {
        return domicilio;
    }

    public String toString()
    {
        return "Nombre "+nombre+" Edad "+edad+" Domicilio "+domicilio;
    }

}
