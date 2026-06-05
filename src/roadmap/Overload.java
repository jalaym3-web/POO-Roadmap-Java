package roadmap;

public class Overload {

	    // Suma dos enteros
	    public int sumar(int a, int b) {
	        return a + b;
	    }

	    // Suma tres enteros (mismo nombre, distinta firma)
	    public int sumar(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Suma dos decimales (mismo nombre, distinto tipo)
	    public double sumar(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Overload over = new Overload();

	        System.out.println(over.sumar(3, 4));         // 7
	        System.out.println(over.sumar(3, 4, 5));      // 12
	        System.out.println(over.sumar(2.5, 1.5));     // 4.0
	    }
}
