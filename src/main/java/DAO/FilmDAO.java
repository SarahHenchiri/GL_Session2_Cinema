package DAO;

import java.time.LocalDate;
import java.util.List;
import Classes.Film;
import Classes.Salle;

public interface FilmDAO {
	
	public List<Film> getFilms();
	
	public boolean createFilm(Film film);
	
	public Film getFilm(String titre);
	
	public LocalDate getdate(String titre);
	
	public List<Salle> getSalleProjete(String titre);
	
	public boolean addCritique(String titre, String critique, float note);
	
	public boolean addSalle(String titre, Salle cine);
}
