package packLaboTaula;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class WriteFile {
	public void writeFilmakT(String fIzena, HashMap<String, Film> taula) {
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
	
	public void writeAktoreakT(String fIzena, HashMap<String, Aktore> taula) {
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
	
	public void writeAktoreakZ(String fIzena, AktoreZerrenda taula) {
		try {
			PrintWriter writer = new PrintWriter(fIzena, "UTF-8");
			for (int i = 0; i < taula.size() ; i++)
				writer.printf("%-60s  %s%n", taula.get(i).getIzena(), taula.get(i).getId());
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
