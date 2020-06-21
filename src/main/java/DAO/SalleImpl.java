package DAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import Classes.Film;
import Classes.Position;
import Classes.Salle;

public class SalleImpl implements SalleDAO {
	static List<Salle> f = Salle.generateSalle();
	
	@Override
	public Salle getSalle(String nom) {
		for(Salle s:f) {
			if(s.getNom().equals(nom)) {
				return s;
			}
		}
		return null;
	}

	@Override
	public Position getAdress(String nom) {
		for(Salle s:f) {
			if(s.getNom().equals(nom)) {
				return s.getAdresse();
			}
		}
		return null;
	}

	@Override
	public Map<Film, LocalDateTime> getProgramme(String nom) {
		for(Salle s:f) {
			if(s.getNom().equals(nom)) {
				return s.getProgramme();
			}
		}
		return null;
	}

	@Override
	public List<Film> getfilm(String nom) {
		for(Salle s:f) {
			List<Film> film= new ArrayList<Film>();
			if(s.getNom().equals(nom)) {
				for(Film m:s.getProgramme().keySet()) {
					film.add(m);
				}
			}
			return film;
		}
		return null;
	}

	@Override
	public List<Salle> getSallePeri(Position localisation, float rayon) {
		// TODO Auto-generated method stub
		return null;
	}

}
