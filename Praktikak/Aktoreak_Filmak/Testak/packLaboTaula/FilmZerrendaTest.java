package packLaboTaula;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FilmZerrendaTest {

	FilmZerrenda fz = new FilmZerrenda();
	Film f = new Film("QL6869","American History X", 1998);
	
	@Test
	void testSize() {
		assertEquals(fz.size(),0);
	}
	
	@Test
	void testAddFilm() {
		fz.addFilm(f);
		assertEquals(fz.size(),1);
	}
	
	@Test
	void testFilmFind() {
		fz.addFilm(f);
		assertEquals(fz.filmFind(f.getId()),f);
	}
	
}
