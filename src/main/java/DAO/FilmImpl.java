package DAO;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

import Classes.Film;
import Classes.Salle;

public class FilmImpl implements FilmDAO {
	
	static List<Film> f = Film.generateFilm();
	
	

	public List<Film> getFilms() {
		return f;
	}
	
	public boolean createFilm(Film film) {
		for(Film a:f) {
			if(a.getTitre().equals(film.getTitre())) {
				return false;
			}
		}
		f.add(film);
		return true;
	}

	public Film getFilm(String titre) {
		for(Film a:f) {
			if(a.getTitre().equals(titre)) {
				return a;
			}
		}
		return null;
	}

	public LocalDate getdate(String titre) {
		for(Film a:f) {
			if(a.getTitre().equals(titre)) {
				return a.getSortie();
			}
		}
		return null;
	}

	public List<Salle> getSalleProjete(String titre) {
		for(Film a:f) {
			if(a.getTitre().equals(titre)) {
				return a.getProjete();
			}
		}
		return null;
	}

	public boolean addCritique(String titre, String critique, float note) {
		for(Film a:f) {
			if(a.getTitre().equals(titre)) {
				a.getCritique().add(critique);
				return true;
			}
		}
		return false;
	}

	public boolean addSalle(String titre, Salle cine) {
		for(Film a:f) {
			if(a.getTitre().equals(titre)) {
				a.getProjete().add(cine);
				return true;
			}
		}
		return false;
	}

	
	

}
