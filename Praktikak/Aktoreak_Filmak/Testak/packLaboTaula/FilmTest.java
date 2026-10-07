package packLaboTaula;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FilmTest {

	Film f = new Film("QL6869","La Momia", 1998);
	Film f2 = new Film("QL6869","American History X", 1998);
	Aktore a = new Aktore("QR6767","Ramon");

	//Hacer esto pero en varios @Test, importante para saber donde es el fallo en caso de haber uno
	
	@Test
	void testGetIzena() {
		assertEquals("La Momia", f.getIzena());
	}

	@Test
	void testGetId() {
		assertEquals("QL6869", f.getId());		
	}
	
	@Test
	void testGetFilmanAktoreakNotNull() {
		assertNotNull(f.getFilmanAktoreak());		
	}
	
	@Test
	void testSameId() {
		assertTrue(f.sameId(f2.getId()));		
	}
	
	@Test
	void testAddAktore() {
		f.addAktore(a);
		assertEquals(f.getFilmanAktoreak().size(),1);
	}

	@Test
	void testBadagoAktorea() {
		f.addAktore(a);		
		assertTrue(f.badagoAktorea(a.getId()));
	}

	@Test
	void testGetData() {
		assertEquals(f.getData(), 1998);		
	}
}
