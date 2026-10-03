package packLaboZerrenda;

import java.io.File;

public class Main {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		AktoreZerrenda aktoreZ = new AktoreZerrenda();
		FilmZerrenda filmZ = new FilmZerrenda();
		readFiles(filmZ, aktoreZ);
        long end = System.currentTimeMillis();
        double exTime = (double) ((end - start)/1000);
        System.out.println("execution time: " + exTime + " seconds");
        System.out.println("AktoreZ  " + aktoreZ.size());
		System.out.println("FilmZ  " + filmZ.size());
		
	}
	
	private static void readFiles(FilmZerrenda filmZ, AktoreZerrenda aktoreZ) {
		File directory = new File("C:/Users/maier/OneDrive - UPV EHU/2.maila/1.kuatri/datu-egiturak eta algoritmoak/Praktikak/Aktoreak_Filmak/src/packLaboZerrenda/movies-dir/");
		File[] files = directory.listFiles();
		ReadFile reader = new ReadFile();
		for(File file : files) {
			if (file.isFile() && file.getName().endsWith(".txt")) {
				reader.readFile(file.getAbsolutePath(), file.getName(), filmZ, aktoreZ);
			}
		}
	}
}
