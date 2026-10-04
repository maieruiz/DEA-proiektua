package packLaboTaula;

import java.io.File;
import java.util.HashMap;

public class Main {
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		//ALGORITMO NAGUSIA
		AktoreTaula aktoreZ = AktoreTaula.getAktoreTaula();
		FilmTaula filmZ = FilmTaula.getFilmTaula();
		readFiles(filmZ.getLista(), aktoreZ.getLista());
		//EXEKUZIO DENBORA: ALGORITMO NAGUSIA
        long end = System.currentTimeMillis();
        double exTime = (double) ((end - start)/1000);
        
        //PRINT-AK
        System.out.println("===PRINT===\n");
        System.out.println("execution time - algoritmo nagusia: " + exTime + " seconds");
        System.out.println("AktoreZ  " + aktoreZ.size());
		System.out.println("FilmZ  " + filmZ.size());
		System.out.println("");
		//IDAZKETA
		WriteFile writeFile = new WriteFile();
		writeFile.writeFilmakT("filmak.txt", filmZ.getLista());
		writeFile.writeAktoreakT("aktoreak.txt", aktoreZ.getLista());
		
		//SORT
		System.out.println("===SORT===\n");
		start = System.currentTimeMillis();
		AktoreZerrenda aktoreSorted = QuickSort.quickSortAlgorithm(aktoreZ.getLista());
		writeFile.writeAktoreakZ("aktoreakSorted.txt", aktoreSorted);
		end = System.currentTimeMillis();
        exTime = (double) ((end - start)/100);
        System.out.println("execution time - quick sort: " + exTime + " mili seconds");
        System.out.println("");
        
		//PROBAK
        System.out.println("===PROBAK===\n");
		aktoreZ.printAktoreenFilmak("HarrisonFordQ81328");
		System.out.println("");
		aktoreZ.printAktoreenFilmak("HarryStylesQ3626966");
	}
	
	private static void readFiles(HashMap<String, Film> filmZ, HashMap<String, Aktore> aktoreZ) {
		File directory = new File("C:/Users/maier/Desktop/DEA-proiektua/Praktikak/Aktoreak_Filmak/src/packLaboTaula/movies-dir/");
		File[] files = directory.listFiles();
		ReadFile reader = new ReadFile();
		for(File file : files) {
			if (file.isFile() && file.getName().endsWith(".txt")) 
				reader.readFile(file.getAbsolutePath(), file.getName(), filmZ, aktoreZ);
		}
	}
}
