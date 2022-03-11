package GestrorProcesos;

import java.util.Map.Entry;
import java.util.TreeSet;

public class Ordenacion {

	public static void fifo(TreeSet<Proceso> procesos) {
		int instanteAnterior = 0;
		int instanteComienzo = 0;
		for (Proceso proceso : procesos) {
			int instante = 0;
			int longitudProceso = proceso.gettEjecucion();
			int instanteLlegada = proceso.getInstanteLlegada();
			while (instante < instanteAnterior) {
				if (instante >= instanteLlegada) {
					System.out.print("E ");
				} else {
					System.out.print("- ");
				}
				instante++;
			}
			instanteComienzo = instante;
			for (int i = 0; i < longitudProceso; i++) {
				System.out.print("X ");
			}
			System.out.println();
			instanteAnterior = instanteComienzo + longitudProceso;
		}
	}
}