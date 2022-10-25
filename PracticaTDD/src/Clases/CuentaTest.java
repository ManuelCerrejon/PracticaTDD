package Clases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class CuentaTest {
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		Cuenta ct12345 = Cuenta("12345",50);
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
		ct12345.ingreso(50);
		AssertEquals(100, ct12345.getSaldo(50));
	}

	@Test
	void testRetirar() {
		
	}

}
