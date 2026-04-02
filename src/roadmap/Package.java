package roadmap;

public class Package {
	public static void main(String[] args) {
	java.lang.Package pkg = String.class.getPackage();
	
	System.out.println("Nombre del paquete: " + pkg.getName());
	}
}
