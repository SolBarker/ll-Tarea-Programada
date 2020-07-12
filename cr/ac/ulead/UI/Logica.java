package cr.ac.ulead.UI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import cr.ulead.ac.lista.List;
import cr.ulead.ac.lista.Nodo;
import cr.ulead.ac.lista.Producto;

public class Logica {
	Scanner input = new Scanner(System.in);
	List lista = new List();

	public void Menu() throws FileNotFoundException {
		UserInterface user = new UserInterface();

		switch (input.nextInt()) {
		case 1:
			CargarDatas();
			user.ShowMenu2();
			Menu();
			break;
		case 2:
			BuscarDatosPorNombre();
			break;
		case 3:
			CodigosAlfanimericos();
			break;
		case 4:
			System.out.println("Gracias por participar :-)");
			System.out.println("*********************************************************");
			break;
		default:
			System.out.println("Opcion incorrect!! Por favor intentelo denuevo");
			Menu();
		}
	}

	private void CodigosAlfanimericos() {
		Nodo temp = lista.inicio;
		while (temp != null) {
			System.out.println("Valor del Codigo Alfnumerico: " + temp.value.getCodigo()
					.substring(temp.value.getCodigo().length() - 3, temp.value.getCodigo().length()));
			temp = temp.next;
		}

	}

	private void BuscarDatosPorNombre() {
		System.out.println("Ingrese el nombre que desea buscar: ");
		String name;
		name = input.next();

		Nodo temp = lista.inicio;
		int contador = 0;
		while (temp != null) {
			if (temp.value.getNombre().toLowerCase().contains(name.toLowerCase())) {
				System.out.println("Valor del nodo: " + temp.value.toString() + " en la posicion: " + contador);
				temp = temp.next;
			} else {
				temp = temp.next;
			}
			contador++;
		}

	}

	public void CargarDatas() throws FileNotFoundException {
		Scanner lector = new Scanner(new File(
				"C:\\Users\\SolanllyBarkerVargas\\eclipse-workspace\\llTareaProgramada\\src\\flipkart_com-ecommerce_sample.csv"));
		while (lector.hasNextLine()) {
			String currentLine = lector.nextLine();
			String[] datos = currentLine.split(",");
			Producto product = new Producto(datos[0], datos[1], datos[2]);
			Nodo node = new Nodo(product);
			lista.agregar(node);
		}
		lector.close();
		System.out.println("DATOS CARGADOS!");
		System.out.println("-------------------------------------------");
	}
}