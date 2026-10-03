package packLaboZerrenda;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public void readFile(String izena, String dataFilm, FilmZerrenda filmZ, AktoreZerrenda aktoreZ) {
		  try {
		    Scanner sarrera = new Scanner(new FileReader(izena));
		    String lerroa;
		    while (sarrera.hasNext()) {
		      lerroa = sarrera.nextLine();
		      String[] datuak = lerroa.split("\\s+###\\s+");
		      String[] dataSplit = dataFilm.split("_");
		      String[] dataSplit2 = dataSplit[3].split("\\.");
		      int data = Integer.parseInt(dataSplit2[0]);
		      if (datuak.length == 4) {
		    	  datuak[0] = extractId(datuak[0]);
			      datuak[2] = extractId(datuak[2]);
			      if (!(datuak[0].equals(datuak[1]) || datuak[2].equals(datuak[3])))
			      {
				      Aktore newA = aktoreZ.aktoreFind(datuak[0]);
				      if (newA == null)
				      {
				    	  newA = new Aktore(datuak[0], datuak[1]);
				    	  aktoreZ.addAktore(newA);
				      }
				      Film newF = filmZ.filmFind(datuak[2]);
				      if (newF == null)
				      {
				    	  newF = new Film(datuak[2], datuak[3], 1);
				    	  filmZ.addFilm(newF);
				      }
				      newA.addFilm(newF);
				      newF.addAktore(newA);
			      }
		      }
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
}
