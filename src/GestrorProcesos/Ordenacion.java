package GestrorProcesos;

import java.util.Map.Entry;
import java.util.TreeSet;

public class Ordenacion {

	public static void fifo(TreeSet<Proceso> procesos) {
		int instanteAnterior = 0;
		int instanteComienzo = 0;
		int tTotalAImprimir = 0;
		for (Proceso proceso : procesos) {
			int instante = 0;
			int longitudProceso = proceso.gettEjecucion();
			int instanteLlegada = proceso.getInstanteLlegada();
			tTotalAImprimir += proceso.gettEjecucion();
			System.out.printf("%s: | ", proceso.getNombre());
			while (instante < instanteAnterior) {
				if (instante >= instanteLlegada) {
					System.out.print(" E ");
				} else {
					System.out.print(" - ");
				}
				instante++;
			}
			instanteComienzo = instante;
			for (int i = 0; i < longitudProceso; i++) {
				System.out.print(" X ");
			}
			System.out.println();
			instanteAnterior = instanteComienzo + longitudProceso;
		}
		System.out.print("   ");
		for (int i = 0; i < tTotalAImprimir + 2; i++) {
			System.out.print("---");
		}
		System.out.print("\n      ");
		for (int i = 0; i < tTotalAImprimir + 2; i++) {
			if (i > 9) {
				System.out.print(i + " ");
			} else {
				System.out.print(+i + "  ");
			}
		}
		System.out.print("\n\n\n");
		
		
	}
}