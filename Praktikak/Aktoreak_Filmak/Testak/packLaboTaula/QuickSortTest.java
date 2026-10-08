package packLaboTaula;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;

class QuickSortTest {

	@Test
	void testQuickSortHutsa() {
	    HashMap<String, Aktore> map = new HashMap<>();

	    AktoreZerrenda r = QuickSort.quickSortAlgorithm(map);
	    assertEquals(0, r.size());
	}
 
	@Test
	void testQuickSortElementuBakarra() {
	    HashMap<String, Aktore> map = new HashMap<>();

	    map.put("QR6767", new Aktore("QR6767", "Ramon"));

	    AktoreZerrenda r = QuickSort.quickSortAlgorithm(map);

	    assertEquals(1, r.size());
	    assertEquals("Ramon", r.getIzena(0));
	}
	
	@Test
	void testQuickSortHainbatElementu() {

	    HashMap<String, Aktore> map = new HashMap<>();

	    map.put("1", new Aktore("1", "Mikel"));
	    map.put("2", new Aktore("2", "Ana"));
	    map.put("3", new Aktore("3", "Jon"));
	    map.put("4", new Aktore("4", "Bea"));

	    AktoreZerrenda r = QuickSort.quickSortAlgorithm(map);

	    assertEquals("Ana", r.getIzena(0));
	    assertEquals("Bea", r.getIzena(1));
	    assertEquals("Jon", r.getIzena(2));
	    assertEquals("Mikel", r.getIzena(3));
	}
	
	@Test
	void testQuickSortAlderantzizkoa() {

	    HashMap<String, Aktore> map = new HashMap<>();

	    map.put("1", new Aktore("1", "Zoe"));
	    map.put("2", new Aktore("2", "Mikel"));
	    map.put("3", new Aktore("3", "Ana"));

	    AktoreZerrenda r = QuickSort.quickSortAlgorithm(map);

	    assertEquals("Ana", r.getIzena(0));
	    assertEquals("Mikel", r.getIzena(1));
	    assertEquals("Zoe", r.getIzena(2));
	}
	
	
}
