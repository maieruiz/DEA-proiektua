package packLaboTaula;

public class Aktore {
	private String id, izena;
	private FilmZerrenda filmZerrenda;
	
	public Aktore(String pId, String pIzena) {
		this.id = pId;
		this.izena = pIzena;
		this.filmZerrenda = new FilmZerrenda();
	}

	public boolean sameId(String pIdAktore) {
		if (this.id.equals(pIdAktore))
			return true;
		return false;
	}

	public void addFilm(Film newF) {
		this.filmZerrenda.addFilm(newF);
	}
	
	public FilmZerrenda getAktoreanFilmak() {
		return this.filmZerrenda;
	}

	public void printName() {
		System.out.println(this.izena);
	}

	public String getIzena() {
		return this.izena;
	}

	public String getId() {
		return this.id;
	}

	public void printAktoreenFilmak() {
		System.out.println(this.izena + ":");
		this.filmZerrenda.printFilmsNames();
	}

	public boolean badagoFilma(String idFilm) {
		if (this.filmZerrenda.filmFind(idFilm) != null)
			return true;
		return false;
	}
}
