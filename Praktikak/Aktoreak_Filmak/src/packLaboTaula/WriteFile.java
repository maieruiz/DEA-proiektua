package packLaboTaula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class WriteFile {
	public void writeFilmak(String fIzena, HashMap<String, Film> taula) {
		try {
			PrintWriter writer = new PrintWriter(fIzena, "UTF-8");
			for (String key : taula.keySet())
				writer.printf("%-60s  %s%n", taula.get(key).getIzena(), taula.get(key).getId());
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeAktoreak(String fIzena, HashMap<String, Aktore> taula) {
		try {
			PrintWriter writer = new PrintWriter(fIzena, "UTF-8");
			for (String key : taula.keySet())
				writer.printf("%-60s  %s%n", taula.get(key).getIzena(), taula.get(key).getId());
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
