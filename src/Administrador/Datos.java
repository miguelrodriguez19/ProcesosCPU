package Administrador;

public class Datos {
	private String nombre;
	private Integer instanteLlegada;
	private Integer duracion;
	
	public Datos() {
		
	}
	
	public Datos(String nombre, int instanteLlegada, int duracion) {
		super();
		this.nombre = nombre;
		this.instanteLlegada = instanteLlegada;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getInstanteLlegada() {
		return instanteLlegada;
	}

	public void setInstanteLlegada(int instanteLlegada) {
		this.instanteLlegada = instanteLlegada;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "[ Nombre= " + nombre + ", instanteLlegada= " + instanteLlegada + "s, duracion= " + duracion + "s ]";
	}

}
