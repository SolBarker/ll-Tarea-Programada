package cr.ac.ulead.UI;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class UserInterface {
	private PrintStream output = new PrintStream(System.out);
	Logica logic = new Logica();
	
	public void ShowMenu() throws FileNotFoundException{
		output.println("BIENVENIDO");
		output.println("1. Cargar datos");
		logic.Menu();
	}
	public void ShowMenu2() {
		output.println("2. Buscar datos por aproximacion del nombre ");
		output.println("3. Generar la lista de todos los valore alfanumericos");
		output.println("4. Para salir");
	}
}
