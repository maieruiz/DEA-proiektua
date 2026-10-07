package packLaboTaula;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class AktoreTaulaTest {

	Aktore a = new Aktore("QR6767","Ramon");
	
	@Test
	void testGetAktoreTaula() {
		assertNotNull(AktoreTaula.getAktoreTaula());
	}
	
	@Test
	void testSize() {
		assertEquals(0, AktoreTaula.getAktoreTaula().size());
	}
	
	@Test
	void testAddAktore() {
		AktoreTaula.getAktoreTaula().addAktore(a.getId(), a);
		assertEquals(1, AktoreTaula.getAktoreTaula().size());
	}
	
	@Test
	void testRemoveAktore() {
		AktoreTaula.getAktoreTaula().addAktore(a.getId(), a);
		AktoreTaula.getAktoreTaula().removeAktore(a.getId());
		assertEquals(0, AktoreTaula.getAktoreTaula().size());
	}
	
	@Test
	void testConteinsAktore() {
		AktoreTaula.getAktoreTaula().addAktore(a.getId(), a);
		assertTrue(AktoreTaula.getAktoreTaula().conteinsAktore(a.getId()));
	}

	@Test
	void testGetLista() {
		HashMap<String, Aktore> lista = AktoreTaula.getAktoreTaula().getLista();
		assertNotNull(lista);
	}

}
