import java.util.Random;

public class Main {

    public static int sumArray(int[] x)
    {
        int suma=0;
        for(int i=0;i<x.length;i++)
        {
            suma+=x[i];
        }

        return suma;
    }

    public static int sumArray2(int[] x)
    {
        int suma=0;
        for(Integer i:x)
        {
            suma+=i;
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] x=new int[5];
        Random rnd=new Random();
        for(int i=0;i<x.length;i++)
        {
            x[i]=(rnd.nextInt());
        }

        System.out.println("Suma 1 "+sumArray(x));
        System.out.println("Suma 2 "+sumArray2(x));
    }
}