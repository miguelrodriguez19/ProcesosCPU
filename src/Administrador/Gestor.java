package Administrador;

import java.util.Scanner;
import java.util.Map.Entry;
import java.util.HashMap;

public class Gestor {
	private static Scanner in = new Scanner(System.in);
	static HashMap<String, Datos> procesos;

	public static void main(String[] args) {
		short opcion = -1;
		inicializar();
//		Menu
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
		procesos = new HashMap();
		procesos.put("A", new Datos("A", 0, 3));
		procesos.put("B", new Datos("B", 1, 5));
		procesos.put("C", new Datos("C", 3, 2));
		procesos.put("D", new Datos("D", 9, 5));
		procesos.put("E", new Datos("E", 12, 5));
	}

	private static void introducirDatos() {
		Datos nuevo = new Datos();
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
		for (Entry<String, Datos> entry : procesos.entrySet()) {
			String key = entry.getKey();
			Datos val = entry.getValue();
			System.out.println(val);
		}
		
	}
	
	private static void firstInFirstOut() {
		ProcFifo.fifoGraph();
	}


	private static void shortestJobFirst() {

	}

	private static void roundRovin() {

	}

}
