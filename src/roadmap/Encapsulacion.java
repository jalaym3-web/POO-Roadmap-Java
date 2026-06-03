package roadmap;

public class Encapsulacion {
	String nombre;
	String Apellido;
	
	public Encapsulacion(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		Apellido = apellido;
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	
	
}
