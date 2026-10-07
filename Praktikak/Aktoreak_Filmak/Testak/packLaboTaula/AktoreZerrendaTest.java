package packLaboTaula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AktoreZerrendaTest {

	AktoreZerrenda az = new AktoreZerrenda();
	Aktore a = new Aktore("QR6767","Ramon");
	Aktore a2 = new Aktore("QR6869","Andeka");

	@Test
	void testAddAktore() {
		az.addAktorea(a);
		assertEquals(az.size(),1);
	}
	
	@Test
	void testRemoveAktore() {
		az.addAktorea(a);
		az.removeAktore(a);
		assertEquals(az.size(),0);
	}
	
	@Test
	void testAktoreFind() {
		az.addAktorea(a);
		assertEquals(az.aktoreFind(a.getId()),a);
	}
	
	@Test
	void testGet() {
		az.addAktorea(a);
		assertEquals(az.get(0),a);
	}
	
	@Test
	void testSet() {
		az.addAktorea(a);
		az.addAktorea(a2);
		az.set(1, a);
		assertEquals(az.get(1),a);
	}
	
}
