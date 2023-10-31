class ExceptionNegativo extends Exception {
    public ExceptionNegativo(String msg) {
        super(msg);
    }
}

class Operaciones{
    public int division(int a, int b) throws ExceptionNegativo {
        if (a < 0 || b < 0) {
            throw new ExceptionNegativo("No se permiten valores negativos");
        }
        return a / b;
    }
}
public class ExceptionEx1 {
    public static void main(String[] args) {
        String str = null;
        try {
            //System.out.println(str.length());
            Operaciones op=new Operaciones();
            System.out.println(op.division(10,-1));

        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }catch(ExceptionNegativo e){
            System.out.println("Caught ExceptionNegativo: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }finally {
            System.out.println("Closing the program");
        }
        System.out.println("End of main");
    }
}
