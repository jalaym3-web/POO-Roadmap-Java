package roadmap;

public class EnumsEjercicio {
	private Estado prestamo;

	public EnumsEjercicio(Estado prestamo) {
		super();
		this.prestamo = Estado.ACTIVO;
	}

	public void mostrarMensaje() {
        switch (prestamo) {
            case ACTIVO:
                System.out.println("Estado Activo");
                break;
            case INACTIVO:
                System.out.println("Estado Inactivo");
                break;
        }
	}

}
