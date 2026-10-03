package packLaboTaula;

import java.util.ArrayList;
import java.util.Iterator;

public class FilmZerrenda {
	private ArrayList<Film> lista;
	
	public FilmZerrenda() {
		this.lista = new ArrayList<Film>(); 
	}
	
	private Iterator<Film> getIteradorea(){
		return this.lista.iterator();
	}
  
	public Film filmFind(String pIdFilm)
	{
		Film filmFound = null;
		Film f = null;
		Iterator<Film> itr = this.getIteradorea();
		while(itr.hasNext() && filmFound == null) {
			f = itr.next();
			if (f.sameId(pIdFilm))
				  filmFound = f;
		}
		return filmFound;
	}

	public void addFilm(Film newF) {
		this.lista.add(newF);
	}

	public int size() {
		return this.lista.size();
	}

	public void printFilmsNames() {
		Film f = null;
		Iterator<Film> itr = this.getIteradorea();
		while(itr.hasNext()) {
			f = itr.next();
			f.printName();
		}
		
	}
}
