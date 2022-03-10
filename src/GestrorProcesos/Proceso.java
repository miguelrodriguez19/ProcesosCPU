package GestrorProcesos;

public class Proceso {
	private String nombre;
	private Integer instanteLlegada;
	private Integer tEjecucion;
	private Integer inicio;
	private Integer fin;
	private Integer tTotal;
	private Integer tEspera;
	private float  penalizacion;
	
	public Proceso(String nombre, Integer instanteLlegada, Integer tEjecucion, Integer inicio, Integer fin,
			Integer tTotal, Integer tEspera, float penalizacion) {
		this.nombre = nombre;
		this.instanteLlegada = instanteLlegada;
		this.tEjecucion = tEjecucion;
		this.inicio = inicio;
		this.fin = fin;
		this.tTotal = tTotal;
		this.tEspera = tEspera;
		this.penalizacion = penalizacion;
	}

	public Proceso() {
	}
	
	public Object rellenarTabla (Proceso miObjeto) {
//		mi
		return miObjeto;
	}
	
	

}