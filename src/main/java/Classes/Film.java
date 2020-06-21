package Classes;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Film {
	private String titre;
	private String resume;
	private LocalDate sortie;
	private List<String> critique;
	private float note;
	private List<Salle> projete;
	
	public Film(String titre, String resume, LocalDate sortie) {
		super();
		this.titre = titre;
		this.resume = resume;
		this.sortie = sortie;
		this.projete = new ArrayList<Salle>();
	}
	
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public LocalDate getSortie() {
		return sortie;
	}
	public void setSortie(LocalDate sortie) {
		this.sortie = sortie;
	}
	public List<String> getCritique() {
		return critique;
	}
	public void setCritique(List<String> critique) {
		this.critique = critique;
	}
	public float getNote() {
		return note;
	}
	public void setNote(float note) {
		this.note = note;
	}
	public List<Salle> getProjete() {
		return projete;
	}
	public void setProjete(List<Salle> projete) {
		this.projete = projete;
	}
	
	public static ArrayList<Film> generateFilm() {
		ArrayList<Film> films = new ArrayList<Film>();
		Film f1 = new Film("titanic","bateau",LocalDate.parse("1997-02-12"));
		Film f2 = new Film("robocop","robot",LocalDate.parse("1987-12-27"));
		films.add(f1);
		films.add(f2);
		
		return films;
	}
	
}
