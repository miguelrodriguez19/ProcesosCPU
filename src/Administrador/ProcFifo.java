package Administrador;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;


public class ProcFifo {
	int tEspera, tEjecucion, inicio, fin, tTotal;
	double  penalizacion;
	String nombreProc;
	int instante;
	int instLlegada;
	int instAnterior = 0;
	int instanteComienzo = 0;
	int duracion = 0;
	static HashMap<String, ProcFifo> procesoValores;
	private static HashMap<String, Datos> ordenFifo;

	public ProcFifo() {

	}

	public ProcFifo(String nombre, int instanteLlegada, int duracion, int inicio, int fin, int tTotal, int tEspera,
			int penalizacion) {
		this.nombreProc = nombre;
		this.instLlegada = instanteLlegada;
		this.tEjecucion = duracion;
		this.inicio = inicio;
		this.fin = fin;
		this.tTotal = tTotal;
		this.tEspera = tEspera;
		this.penalizacion = penalizacion;
	}

	@Override
	public String toString() {
		return "[ Nombre= " + nombreProc + ", InstLlegada= " + instLlegada + ", tEjecucion= " + tEjecucion
				+ ", inicio= " + inicio + ", fin= " + fin + ", tTotal= " + tTotal + ", tEspera= " + tEspera
				+ ", penalizacion= " + penalizacion + " ]";
	}

	static void ordenarProcFifo() {
		
	}
	
	
	static void fifoGraph() {
		
		procesoValores = new HashMap();
		int instante;
		int inicio;
		int fin;
		int instLlegada;
		int instAnterior = 0;
		int duracion = 0;
		int instanteComienzo = 0;

		for (Entry<String, Datos> entry : Gestor.procesos.entrySet()) {
			ProcFifo procFifoObj = new ProcFifo();
			String key = entry.getKey();
			Datos val = entry.getValue();
			Integer duracionProc = entry.getValue().getDuracion();
			instLlegada = entry.getValue().getInstanteLlegada();
			instante = 0;
			inicio = 0;
			fin = 0;
			System.out.printf("%s: | ", key);
			while (instante < instAnterior) {
				if (instante >= instLlegada) {
					System.out.print("E  ");
					inicio++;
					fin++;
				} else {
					System.out.print("-  ");
					inicio++;
					fin++;
				}
				instante++;
			}
			instanteComienzo = instante;
			for (int i = 0; i < duracionProc; i++) {
				System.out.print("X  ");
				fin++;
			}
			System.out.println();
			instAnterior = instanteComienzo + duracionProc;
			duracion += entry.getValue().getDuracion();
			
			// Rellenar procesoValores con los datos a imprimir en la tabla
			procFifoObj.setNombreProc(key);
			procFifoObj.setInstLlegada(val.getInstanteLlegada());
			procFifoObj.settEjecucion(val.getDuracion());
			procFifoObj.setInicio(inicio);
			procFifoObj.setFin(fin);
			procFifoObj.settTotal(fin - procFifoObj.getInstLlegada());
			procFifoObj.settEspera(procFifoObj.gettTotal() - procFifoObj.gettEjecucion());
			procFifoObj.setPenalizacion((double)procFifoObj.gettTotal() / procFifoObj.gettEjecucion());
			procesoValores.put(key, procFifoObj);

		}
		System.out.print("   |");
		for (int i = 0; i < duracion + 2; i++) {
			System.out.print("---");
		}
		System.out.print("\n     ");
		for (int i = 0; i < duracion + 2; i++) {
			if (i > 9) {
				System.out.print(i + " ");
			} else {
				System.out.print(+i + "  ");
			}
		}
		
		System.out.print("\n\n\n");
		
		
		// Tabla de Datos.
		for (Entry<String, ProcFifo> entry : procesoValores.entrySet()) {
			String key = entry.getKey();
			ProcFifo val = entry.getValue();
			System.out.println(val);
		}

	}

	public int gettEspera() {
		return tEspera;
	}

	public void settEspera(int tEspera) {
		this.tEspera = tEspera;
	}

	public int gettEjecucion() {
		return tEjecucion;
	}

	public void settEjecucion(int tEjecucion) {
		this.tEjecucion = tEjecucion;
	}

	public int getInicio() {
		return inicio;
	}

	public void setInicio(int inicio) {
		this.inicio = inicio;
	}

	public int getFin() {
		return fin;
	}

	public void setFin(int fin) {
		this.fin = fin;
	}

	public int gettTotal() {
		return tTotal;
	}

	public void settTotal(int tTotal) {
		this.tTotal = tTotal;
	}

	public double getPenalizacion() {
		return penalizacion;
	}

	public void setPenalizacion(double penalizacion) {
		this.penalizacion = penalizacion;
	}

	public String getNombreProc() {
		return nombreProc;
	}

	public void setNombreProc(String nombreProc) {
		this.nombreProc = nombreProc;
	}

	public int getInstLlegada() {
		return instLlegada;
	}

	public void setInstLlegada(int instLlegada) {
		this.instLlegada = instLlegada;
	}
}

