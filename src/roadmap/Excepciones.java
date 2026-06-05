package roadmap;

public class Excepciones {
	
    public static void main(String[] args) {
        int[] numeros = {10, 5, 0, 2};

        for (int i = 0; i < numeros.length - 1; i++) {
            try {
                int resultado = numeros[i] / numeros[i + 1];
                System.out.println(numeros[i] + " / " + numeros[i + 1] + " = " + resultado);
            } catch (ArithmeticException e) {
                System.out.println("Error: No se puede dividir entre cero. " + e.getMessage());
            } finally {
                System.out.println("Intento " + (i + 1) + " completado");
            }
        }
    }
}