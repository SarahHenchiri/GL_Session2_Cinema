package DAO;

import java.time.LocalDate;
import Classes.Salle;


public interface DistriduteurDAO extends UtilisateurDAO{
	public String addDistributeur(String mail, String pass);
	public boolean addFilm(String titre, String resume,LocalDate date);
	
	public boolean addSalleFilm(Salle ddifuse);
}



