package roadmap;

public class PasoReferencia {
	
	public static void duplicar(int numero) {
	    numero = numero * 2; // solo modifica la copia local
	}

	public static void main(String[] args) {
	    int x = 5;
	    duplicar(x);
	    System.out.println(x); // sigue siendo 5
	}
}
