
import java.util.Scanner;

/**
 * @author Juan Fernando Ramirez 
 *
 */
public class CalcuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String i = "n";
		
		while (i.equals("n")) {
			Scanner teclado = new Scanner(System.in);
			CalcuPila calcu = new CalcuPila();
			System.out.println("*********Calculadora*********");
			System.out.println("Ingrese la ubicacion del archivo");
			String s = teclado.nextLine();
			calcu.leerDocu(s);
			System.out.println("La operacion en el documento es: " + calcu.leerDocu(s));
			System.out.println("El resultado es: " + calcu.operar(calcu.leerDocu(s)));
			
			System.out.println("Desea salir del programa? ");
			i = teclado.nextLine();
		}



	}

}
