package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CuentaTest {
	
	static Cuenta ct12345;
	static Cuenta ct67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ct12345 = new Cuenta("12345","manuel",50.0);
		ct67890 = new Cuenta("67890","pepe",0.0);
	}

	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ct12345.setSaldo(50);
		ct67890.setSaldo(0);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testTest0014() {
		double expected1 = -250;
		double expected2 = -450;
		
		try {	
					
			ct12345.retirar(200.0);
			ct67890.retirar(350.0);
			ct12345.ingreso(100.0);
			ct67890.retirar(200.0);
			ct67890.retirar(150.0);
			ct12345.retirar(200.0);
			ct67890.ingreso(50.0);
			ct67890.retirar(100.0);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(expected1,ct12345.getSaldo());
		assertEquals(expected2,ct67890.getSaldo());
		
	}
	
	@Test
	void testIngreso() {
		try {
			ct12345.ingreso(50.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(100, ct12345.getSaldo());
	}

	@Test
	void testRetirar() {
		try {
			ct12345.retirar(50.0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(0, ct12345.getSaldo());
		
	}

}
