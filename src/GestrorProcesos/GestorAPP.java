package GestrorProcesos;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Map.Entry;
import java.util.HashMap;

public class GestorAPP {
	private static Scanner in = new Scanner(System.in);
	static TreeSet<Proceso> procesos = new TreeSet<>(); ;

	public static void main(String[] args) {
		short opcion = -1;
		inicializar();
//		Menu p
		do {
			System.out.println("Menu: ");
			System.out.println("1. Introducir datos");
			System.out.println("2. Mostrar datos");
			System.out.println("3. First in, First Out");
			System.out.println("4. Shortest Job First");
			System.out.println("5. Round Robin");
			System.out.println("0. Salir");

			opcion = Short.parseShort(in.nextLine());

			switch (opcion) {
			case 1:
				System.out.println("Introducir datos");
				introducirDatos();
				break;
			case 2:
				System.out.println("Mostrar datos");
				mostrar();
				break;
			case 3:
				System.out.println("First in, First Out");
				firstInFirstOut();
				break;
			case 4:
				System.out.println("Shortest Job First");
				shortestJobFirst();
				break;
			case 5:
				System.out.println("Round Rovin");
				roundRovin();
				break;
			case 0:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opcion erronea");
				break;
			}
		} while (opcion != 0);
	}

	static void inicializar() {
		
		procesos.put("A", new Proceso("A", 0, 3));
		procesos.put("B", new Proceso("B", 1, 5));
		procesos.put("C", new Proceso("C", 3, 2));
		procesos.put("D", new Proceso("D", 9, 5));
		procesos.put("E", new Proceso("E", 12, 5));
	}

	private static void introducirDatos() {
		Proceso nuevo = new Proceso();
		procesos = new HashMap();
		System.out.print("Introduce la cantidad de procesos: ");
		int cant = Integer.parseInt(in.nextLine());
		for (int i = 0; i < cant; i++) {
			System.out.print("Nombre: ");
			nuevo.setNombre(in.nextLine());
			System.out.print("Duración: ");
			nuevo.setDuracion(Integer.parseInt(in.nextLine()));
			System.out.print("Instante de llegada: ");
			nuevo.setInstanteLlegada(Integer.parseInt(in.nextLine()));
			System.out.println("-----------------");
			procesos.put(nuevo.getNombre(), nuevo);
		}
	}

	private static void mostrar() {
		for (Entry<String, Proceso> entry : procesos.entrySet()) {
			String key = entry.getKey();
			Proceso val = entry.getValue();
			System.out.println(val);
		}
		
	}
	
	private static void firstInFirstOut() {
		Fifo.fifoGraph();
	}


	private static void shortestJobFirst() {

	}

	private static void roundRovin() {

	}

}
