package packLaboTaula;

import java.util.HashMap;

public class FilmTaula {
	private static FilmTaula nireT = null;
	private HashMap<String, Film> lista;
	
	private FilmTaula() {
		this.lista = new HashMap<String, Film>(); 
	}
	
	public static FilmTaula getFilmTaula() {
		if (nireT == null)
			nireT = new FilmTaula();
		return nireT;
	}
	
	public boolean conteinsFilm(String pKey)
	{
		if(lista.containsKey(pKey)) return true;
		else return false;
	}
	
	public Film getFilm(String pKey) {
		return this.lista.get(pKey);
	}

	public void addFilm(String key, Film newF) {
		this.lista.put(key, newF);
	}

	public int size() {
		return this.lista.size();
	}

	public HashMap<String, Film> getLista() {
		return lista;
	}
}
