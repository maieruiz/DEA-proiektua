package packLaboTaula;

public class Film {
	private String id, izena;
	private int data;
	private AktoreZerrenda aktoreZerrenda;
	
	public Film(String pId, String pIzena, int pData) {
		this.id = pId;
		this.izena = pIzena;
		this.data = pData;
		this.aktoreZerrenda = new AktoreZerrenda();
	}

	public boolean sameId(String pIdFilm) {
		if (this.id.equals(pIdFilm))
			return true;
		return false;
	}

	public void addAktore(Aktore newA) {
		this.aktoreZerrenda.addAktore(newA);	
	}
	
	public AktoreZerrenda getFilmanAktoreak() {
		return this.aktoreZerrenda;
	}
	
	public void changeData(int pD) {
		this.data = pD;
	}

	public void printName() {
		System.out.println(this.izena);
	}

	public String getIzena() {
		return this.izena ;
	}
	
	public String getId() {
		return this.id ;
	}
}
