package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CuentaTest {
	
	static Cuenta ct12345;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ct12345 = new Cuenta("12345","manuel",50.0);
	}

	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso() {
		ct12345.ingreso(50.0);
		assertEquals(100, ct12345.getSaldo());
	}

	@Test
	void testRetirar() {
		
	}

}
