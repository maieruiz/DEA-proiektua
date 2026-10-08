package packLaboTaula;

import java.io.IOException;
import java.io.PrintWriter;

public class WriteFile {
	public void writeFilmakT(String fIzena, FilmTaula filmTaula) {
		try {
			PrintWriter writer = new PrintWriter(fIzena, "UTF-8");
			for (Film film : filmTaula.getLista().values())
				writer.printf("%-60s  %s%n", film.getIzena(), film.getId());
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeAktoreakT(String fIzena, AktoreTaula aktoreTaula) {
		try {
			PrintWriter writer = new PrintWriter(fIzena, "UTF-8");
			for (Aktore aktore : aktoreTaula.getLista().values())
				writer.printf("%-60s  %s%n", aktore.getIzena(), aktore.getId());
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
