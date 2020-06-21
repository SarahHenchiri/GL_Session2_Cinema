package DAO;

import java.time.LocalDateTime;

import Classes.Film;
import Classes.Position;
import Classes.Salle;

public interface GestionnaireDAO extends UtilisateurDAO{
	public String addGestionnaire(String mail, String pass);
	public boolean addSalle(String mail, String nom, Position adresse);
	public boolean addCreneau(String mail, Film film,LocalDateTime creneau);
	public Salle getSalle(String mail);
	public boolean removeCreneau(String mail, Film film,LocalDateTime creneau);
	

}
