package packLaboTaula;

import java.io.File;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		AktoreTaula aktoreZ = AktoreTaula.getAktoreTaula();
		FilmTaula filmZ = FilmTaula.getFilmTaula();
		readFiles(filmZ.getLista(), aktoreZ.getLista()); 
        long end = System.currentTimeMillis();
        double exTime = (double) ((end - start)/1000);
        System.out.println("execution time: " + exTime + " seconds");
        System.out.println("AktoreZ  " + aktoreZ.size());
		System.out.println("FilmZ  " + filmZ.size());
		
		WriteFile writeFile = new WriteFile();
		writeFile.writeFilmak("filmak.txt", filmZ.getLista());
		writeFile.writeAktoreak("aktoreak.txt", aktoreZ.getLista());
	}
	
	private static void readFiles(HashMap<String, Film> filmZ, HashMap<String, Aktore> aktoreZ) {
		File directory = new File("C:/Users/maier/OneDrive - UPV EHU/2.maila/1.kuatri/datu-egiturak eta algoritmoak/Praktikak/Aktoreak_Filmak/src/packLaboTaula/movies-dir/");
		File[] files = directory.listFiles();
		ReadFile reader = new ReadFile();
		for(File file : files) {
			if (file.isFile() && file.getName().endsWith(".txt")) 
				reader.readFile(file.getAbsolutePath(), file.getName(), filmZ, aktoreZ);
		}
	}
}
