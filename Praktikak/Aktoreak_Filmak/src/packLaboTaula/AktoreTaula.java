package packLaboTaula;

import java.util.HashMap;

public class AktoreTaula {
	private static AktoreTaula nireT = null;
	private HashMap<String, Aktore> lista;
	
	private AktoreTaula() {
		this.lista = new HashMap<String, Aktore>(); 
	}
	
	public static AktoreTaula getAktoreTaula() {
		if (nireT == null)
			nireT = new AktoreTaula();
		return nireT;
	}
  
	public boolean conteinsAktore(String pKey)
	{
		if (this.lista.containsKey(pKey)) return true;
		else return false;
	}
	
	public Aktore getAktore(String pKey) {
		return this.lista.get(pKey);
	}

	public void addAktore(String key, Aktore pA) {
		this.lista.put(key, pA);
	}
	
	public void removeAktore(String key) {
		this.lista.remove(key);
	}

	public int size() {
		return this.lista.size();
	}

	public HashMap<String, Aktore> getLista() {
		return lista;
	}
	
}
