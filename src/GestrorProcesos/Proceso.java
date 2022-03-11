package GestrorProcesos;

public class Proceso implements	Comparable<Proceso> {
	private String nombre;
	private Integer instanteLlegada;
	private Integer tEjecucion;
	private Integer inicio;
	private Integer fin;
	private Integer tTotal;
	private Integer tEspera;
	private float  penalizacion;
	//
	public Proceso(String nombre, Integer instanteLlegada, Integer tEjecucion) {
		this.nombre = nombre;
		this.instanteLlegada = instanteLlegada;
		this.tEjecucion = tEjecucion;
	}

	public Proceso() {
	}
	
	public Object rellenarTabla (Proceso miObjeto) {
//		mi
		return miObjeto;
	}

	@Override
	public int compareTo(Proceso p) {
		// TODO Auto-generated method stub
		if(this.instanteLlegada < p.instanteLlegada)
			return -1;
		else
			return 1;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getInstanteLlegada() {
		return instanteLlegada;
	}

	public void setInstanteLlegada(Integer instanteLlegada) {
		this.instanteLlegada = instanteLlegada;
	}

	public Integer gettEjecucion() {
		return tEjecucion;
	}

	public void settEjecucion(Integer tEjecucion) {
		this.tEjecucion = tEjecucion;
	}

	public Integer getInicio() {
		return inicio;
	}

	public void setInicio(Integer inicio) {
		this.inicio = inicio;
	}

	public Integer getFin() {
		return fin;
	}

	public void setFin(Integer fin) {
		this.fin = fin;
	}

	public Integer gettTotal() {
		return tTotal;
	}

	public void settTotal(Integer tTotal) {
		this.tTotal = tTotal;
	}

	public Integer gettEspera() {
		return tEspera;
	}

	public void settEspera(Integer tEspera) {
		this.tEspera = tEspera;
	}

	public float getPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(float penalizacion) {
		this.penalizacion = penalizacion;
	}
	
	

}