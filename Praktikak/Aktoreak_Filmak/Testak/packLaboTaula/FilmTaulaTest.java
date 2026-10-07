package packLaboTaula;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class FilmTaulaTest {

	Film f = new Film("QL6869","American History X", 1998);
	Film f2 = new Film("QL6869","La Momia", 1998);
	
	@Test
	void testGetFilmTaula() {
		assertNotNull(FilmTaula.getFilmTaula());
	}
 
	@Test
	void testSize() {
		assertEquals(FilmTaula.getFilmTaula().size(),0);
	}
	
	@Test
	void testAddFilm() {
		FilmTaula.getFilmTaula().addFilm(f.getId(), f);
		FilmTaula.getFilmTaula().addFilm(f2.getId(), f2);
		assertEquals(FilmTaula.getFilmTaula().size(),2);
	}
	
	@Test
	void testGetFilm() {
		FilmTaula.getFilmTaula().addFilm(f.getId(), f);
		assertEquals(FilmTaula.getFilmTaula().getFilm(f.getId()),f);
	}
	
	@Test
	void testConteinsFilm() {
		FilmTaula.getFilmTaula().addFilm(f.getId(), f);
		assertTrue(FilmTaula.getFilmTaula().conteinsFilm(f.getId()));
	}
	
	@Test
	void testGetLista() {
		HashMap<String, Film> lista = FilmTaula.getFilmTaula().getLista();
		assertNotNull(lista);
	}
	
}
