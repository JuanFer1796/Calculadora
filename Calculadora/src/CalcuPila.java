

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;


/**
 * @author Juan Fernando Ramirez 
 *
 */
public class CalcuPila implements InterfazCalcu{
	
	private Pila<Integer> pila;
	
	

	/**
	 * @param String uArchivo para la ubicación del archivo
	 * @return retorna un String que muestra el contenido del archivo leido 
	 */
	public String leerDocu(String uArchivo) {
		// TODO Auto-generated method stub
					String texto = new String();
					
					// TODO Auto-generated method stub
					ArrayList<String> operacion = new ArrayList<String>();
					try {
						FileReader fr = new FileReader(uArchivo);// Objeto para que establece origen de los datos
						BufferedReader entrada = new BufferedReader(fr); // buffer para el manejo de los datos
						String s;
						while((s = entrada.readLine()) != null)// leer linea a linea
							texto += s + "\n";
							operacion =  new ArrayList<String>(Arrays.asList(texto.split("[\n]", 0)));
							
						entrada.close();
						
						 // impresion de los datos leidos en pantalla
					}
					catch(java.io.FileNotFoundException fnfex) {
						System.out.println("Archivo no encontrado: ");}
					catch(java.io.IOException ioex) {
						
					}
					
					return operacion.get(0);
				}
	

	/**
	 * constructor sin parametros 
	 */
	public CalcuPila() {
		pila = new Pila<>();
	}


	/**
	 *override de operar de la interface calculadora 
	 *sirve para leer el formato postfix y hacer los calculos 
	 */
	@Override
	public double operar(String p) {
		// TODO Auto-generated method stub
		
		
		for (int i = 0; i<p.length();i++) {
			char a = p.charAt(i);
			
			if (Character.isDigit(a)) {
				pila.push(a -'0');
			}
			
			else {
				if (p.charAt(i)!= ' ') {
					
					int value1 = pila.pop();
					
					int value2 = pila.pop();
					
					
					switch (a) {
					case '+':
						pila.push(value1+value2);
						break;
					case '-':
						pila.push(value1-value2);
						break;
					case '*':
						pila.push(value1*value2);
						break;
					case '/':
						pila.push(value1/value2);
						break;
					}
				}
				
			}
			
		}
		
		return pila.pop();
	}

	
}
