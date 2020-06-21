package Classes;

import java.util.Map;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

public class Salle {
	private String nom;
	private Position adresse;
	private Map<Film, LocalDateTime> programme;
	

	public Salle(String nom, Position adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
		this.programme = new HashMap<Film, LocalDateTime>();
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Position getAdresse() {
		return adresse;
	}
	public void setAdresse(Position adresse) {
		this.adresse = adresse;
	}
	public Map<Film, LocalDateTime> getProgramme() {
		return programme;
	}
	public void setProgramme(Map<Film, LocalDateTime> programme) {
		this.programme = programme;
	}

	public static ArrayList<Salle> generateSalle() {
		ArrayList<Salle> s = new ArrayList<Salle>();
		Position p1 = new Position(10,20);
		Position p2 = new Position(80,35);
		Salle f1 = new Salle("paris13",p1);
		Salle f2 = new Salle("Bercy",p2);
		s.add(f1);
		s.add(f2);
		
		return s;
	}
	
}
