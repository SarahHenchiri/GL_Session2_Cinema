
package DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Classes.Film;
import Classes.Position;
import Classes.Utilisateur;

public class UtilisateurImpl implements UtilisateurDAO {
	
	static List<Utilisateur> f = Utilisateur.generateUtilisateur();
	

	@Override
	public String addUtilisateur(String mail, String pass) {
		for(Utilisateur u:f) {
			if(u.getMail().equals(mail)) {
				return "echec de creation";
			}
		}
		Utilisateur e =new Utilisateur(mail,pass);
		f.add(e);
		return "ok";
	}

	@Override
	public boolean addAdresse(Position adresse) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean connection(String mail, String pass) {
		for(Utilisateur u:f) {
			if(u.getMail().equals(mail) && u.getPass().equals(pass)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Utilisateur getUtilisateur(String mail) {
		for(Utilisateur u:f) {
			if(u.getMail().equals(mail)) {
				return u;
			}
		}
		return null;
	}
	

}
