package DAO;

import java.util.Map;
import java.time.LocalDateTime;
import java.util.List;
import Classes.Film;
import Classes.Salle;
import Classes.Position;

public interface SalleDAO {
	
	public Salle getSalle(String nom);
	
	public Position getAdress(String nom);
	
	public Map<Film, LocalDateTime> getProgramme(String nom);
	
	public List<Film> getfilm(String nom);
	
	public List<Salle> getSallePeri(Position localisation,float rayon);

}
