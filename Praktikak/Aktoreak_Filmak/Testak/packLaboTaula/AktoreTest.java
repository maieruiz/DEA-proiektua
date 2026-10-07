package packLaboTaula;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AktoreTest {
	
	Aktore a = new Aktore("QR6767", "Ramon");
	Aktore b = new Aktore("QR6767", "Ignacio");
	Film f = new Film("QT3333","Frankenstein",1967);
	
	//Hacer esto pero en varios @Test, importante
	@Test
	void testGetIzena() {
		assertEquals("Ramon", a.getIzena());	
	}
	
	@Test
	void testGetId() {
		assertEquals("QR6767", a.getId());
	}
	
	@Test
	void getAktoreanFilmakNotNull() {
		assertNotNull(a.getAktoreanFilmak());		
	}
	
	@Test
	void testSameId() {		
		assertTrue(a.sameId(b.getId()));
	}
	
	@Test
	void testAddFilm() {
		a.addFilm(f);
		assertEquals(a.getAktoreanFilmak().size(),1);
	}
	
	@Test
	void testBadagoFilma() {	
		a.addFilm(f);
		assertTrue(a.badagoFilma(f.getId()));
	}
}


