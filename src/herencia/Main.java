package herencia;

public class Main {
	public static void main(String[] args) {
        Animal a = new Animal("Animal genérico");
        Gato g = new Gato("Cookie");

        a.hacerSonido();
        g.hacerSonido(); 
    }
}
