package DAO;

import Classes.Position;
import Classes.Utilisateur;

public interface UtilisateurDAO {
		public boolean connection(String mail, String pass);
		public String addUtilisateur(String mail, String pass);
		public boolean addAdresse(Position adresse);
		public Utilisateur getUtilisateur(String mail);
}
