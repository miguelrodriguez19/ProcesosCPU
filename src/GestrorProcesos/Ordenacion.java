package GestrorProcesos;

import java.util.ArrayList;
import java.util.TreeSet;

import Administrador.ProcFifo;

public class Ordenacion {

	public static void fifo(TreeSet<Proceso> procesos) {
		ArrayList<Proceso> procesoValoresLista = new ArrayList<>();
		Proceso procFifoObj = new Proceso();
		int instanteAnterior = 0;
		int instanteComienzo = 0;
		int tTotalAImprimir = 0;
		int inicio = 0;
		int fin = 0;
		for (Proceso proceso : procesos) {

			int instante = 0;
			inicio = 0;
			fin = 0;
			int longitudProceso = proceso.gettEjecucion();
			int instanteLlegada = proceso.getInstanteLlegada();
			tTotalAImprimir += proceso.gettEjecucion();
			System.out.printf("%s: | ", proceso.getNombre());
			while (instante < instanteAnterior) {
				if (instante >= instanteLlegada) {
					System.out.print(" E ");
					inicio++;
					fin++;
				} else {
					System.out.print(" - ");
					inicio++;
					fin++;
				}
				instante++;
			}
			instanteComienzo = instante;
			for (int i = 0; i < longitudProceso; i++) {
				System.out.print(" X ");
				fin++;
			}
			System.out.println();
			instanteAnterior = instanteComienzo + longitudProceso;

			procFifoObj.setNombre(proceso.getNombre());
			procFifoObj.setInstanteLlegada(proceso.getInstanteLlegada());
			procFifoObj.settEjecucion(proceso.gettEjecucion());
			procFifoObj.setInicio(inicio);
			procFifoObj.setFin(fin);
			procFifoObj.settTotal(fin - procFifoObj.getInstanteLlegada());
			procFifoObj.settEspera(procFifoObj.gettTotal() - procFifoObj.gettEjecucion());
			procFifoObj.setPenalizacion((float) procFifoObj.gettTotal() / procFifoObj.gettEjecucion());
			procesoValoresLista.add(procFifoObj);
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
		
		for (int i = 0; i < procesoValoresLista.size(); i++) {
			System.out.println(procesoValoresLista.toString());
			
		}

	}
}