package DAO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import Classes.Film;
import Classes.Position;
import Classes.Salle;
import Classes.Utilisateur;
import Classes.Gestionnaire;

public class GestionnaireImpl extends UtilisateurImpl implements GestionnaireDAO {

	static List<Gestionnaire> f = new ArrayList<Gestionnaire>();
	
	
	@Override
	public String addGestionnaire(String mail, String pass) {
		for(Gestionnaire g:f) {
			if(g.getMail().equals(mail)) {
				return "echec de creation";
			}
		}
		Gestionnaire e =new Gestionnaire(mail,pass);
		f.add(e);
		return "ok";
	}

	@Override
	public boolean addSalle(String mail, String nom, Position adresse) {
		for(Gestionnaire g:f) {
			if(g.getMail().equals(mail)) {
				Salle travail=new Salle(nom,adresse);
				g.setTravail(travail);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addCreneau(String mail, Film film, LocalDateTime creneau) {
		for(Gestionnaire g:f) {
			if(g.getMail().equals(mail)) {
				g.getTravail().getProgramme().put(film,creneau);
				return true;
			}
		}
		return false;
	}

	@Override
	public Salle getSalle(String mail) {
		for(Gestionnaire g:f) {
			if(g.getMail().equals(mail)) {
				return g.getTravail();
			}
		}
		return null;
	}

	@Override
	public boolean removeCreneau(String mail, Film film, LocalDateTime creneau) {
		for(Gestionnaire g:f) {
			if(g.getMail().equals(mail)) {
				if(g.getTravail().getProgramme().get(film).isEqual(creneau)) {
					g.getTravail().getProgramme().remove(film);
					return true;
				}
			}
		}
		return false;
	}

}
