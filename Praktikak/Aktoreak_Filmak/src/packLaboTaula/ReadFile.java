package packLaboTaula;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public void readFile(String izena, String pData) {
		  try {
		    Scanner sarrera = new Scanner(new FileReader(izena));
		    int data = extractData(pData);
		    while (sarrera.hasNext()) {
		    	String[] datuak = sarrera.nextLine().split("\\s+###\\s+");
			    if (datuak.length != 4) continue;
	    	    String aktoreId = extractId(datuak[0]);
	    	    String aktoreIzena = datuak[1];
	    	    String filmId = extractId(datuak[2]);
	    	    String filmIzena = datuak[3];
		        
		        if (aktoreId.equals(aktoreIzena) || filmId.equals(filmIzena)) continue;
		        
		        String aktoreKey = aktoreIzena.replace(" ", "").concat(aktoreId);
		        String filmKey = filmIzena.replace(" ", "").concat(filmId);
		        
		        Aktore aktore = AktoreTaula.getAktoreTaula().getAktore(aktoreKey);
		        if (aktore == null) {
		        	 aktore = new Aktore(aktoreId, aktoreIzena);
			    	 AktoreTaula.getAktoreTaula().addAktore(aktoreKey, aktore);
		        }
			    
		        Film film = FilmTaula.getFilmTaula().getFilm(filmKey);
		        if (film == null) {
		        	 film = new Film(filmId, filmIzena, data);
			    	 FilmTaula.getFilmTaula().addFilm(filmKey, film);
		        }
			    
		        if(!aktore.badagoFilma(filmId)) aktore.addFilm(film);
			    if(!film.badagoAktorea(aktoreId)) film.addAktore(aktore);   
		  }
		  sarrera.close();
		  } // try 
		  catch (IOException e) {
		    e.printStackTrace();
		  }                                 
	}
	
	private String extractId(String pDatuak) {
		String[] datuak = pDatuak.split("/");
		return (datuak[4]);
	}
	
	private int extractData(String pData) {
		
		String[] dataSplit = pData.split("_");
		String[] dataSplit2 = dataSplit[3].split("\\.");
	    int data = Integer.parseInt(dataSplit2[0]);
		return data;
	}
}
