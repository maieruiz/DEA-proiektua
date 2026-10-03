package packLaboTaula;

import java.util.ArrayList;
import java.util.Iterator;

public class AktoreZerrenda {
	private ArrayList<Aktore> lista;
	
	public AktoreZerrenda() {
		this.lista = new ArrayList<Aktore>(); 
	}
	
	private Iterator<Aktore> getIteradorea(){
		return this.lista.iterator();
	}
  
	public Aktore aktoreFind(String pIdAktore)
	{
		Aktore aktoreFound = null;
		Aktore f = null;
		Iterator<Aktore> itr = this.getIteradorea();
		while(itr.hasNext() && aktoreFound == null) {
			f = itr.next();
			if (f.sameId(pIdAktore))
				  aktoreFound = f;
		}
		return aktoreFound;
	}

	public void addAktore(Aktore pA) {
		this.lista.add(pA);
	}
	
	public void removeAktore(Aktore pA) {
		this.lista.remove(pA);
	}

	public int size() {
		return this.lista.size();
	}

	public void printAktoreNames() {
		Aktore f = null;
		Iterator<Aktore> itr = this.getIteradorea();
		while(itr.hasNext()) {
			f = itr.next();
			f.printName();
		}
	}
	
}
