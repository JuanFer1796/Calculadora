import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestCalcu {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@Test
	void test() {
		CalcuPila calcu = new CalcuPila();
		calcu.operar("6 2 3 + *");
		calcu.leerDocu("C:\\Users\\50246\\OneDrive\\Documentos\\EclipseProyectos\\clase\\src\\archivo.txt");
		Pila<Integer> pila = new Pila<>();
		pila.push(1);
		pila.push(2);
		pila.toString();
		pila.peek();
		pila.size();
		pila.pop();
		pila.empty();
		
	}

}
