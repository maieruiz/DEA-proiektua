package packLaboTaula;

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ReadFile {
	public void readFile(String izena, String pData, HashMap<String, Film> filmZ,  HashMap<String, Aktore> aktoreZ) {
		  try {
		    Scanner sarrera = new Scanner(new FileReader(izena));
		    String lerroa;
		    while (sarrera.hasNext()) {
		      lerroa = sarrera.nextLine();
		      String[] datuak = lerroa.split("\\s+###\\s+");
		      int data = extractData(pData);
		      String aktoreKey = datuak[0].concat(datuak[1]);
		      String filmKey = datuak[2].concat(datuak[3]);
		      if (datuak.length == 4) {
		    	  datuak[0] = extractId(datuak[0]);
			      datuak[2] = extractId(datuak[2]);
			      if (!(datuak[0].equals(datuak[1]) || datuak[2].equals(datuak[3])))
			      {
			    	  if(!aktoreZ.containsKey(aktoreKey)) {
			    		  Aktore newA = new Aktore(datuak[0], datuak[1]);
			    		  aktoreZ.put(aktoreKey, newA);
			    	  }  
			    	  if(!filmZ.containsKey(filmKey)) {
			    		  Film newF = new Film(datuak[2], datuak[3], data);
			    		  filmZ.put(filmKey, newF);
			    	  }  
				      aktoreZ.get(aktoreKey).addFilm(filmZ.get(filmKey));
				      filmZ.get(filmKey).addAktore(aktoreZ.get(aktoreKey));
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
	
	private int extractData(String pData) {
		String[] dataSplit = pData.split("_");
	      String[] dataSplit2 = dataSplit[3].split("\\.");
	      int data = Integer.parseInt(dataSplit2[0]);
	      return data;
	}
}
