package DAO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import Classes.Gestionnaire;
import Classes.Salle;
import Classes.Distributeur;

public class DistributeurImpl extends UtilisateurImpl implements DistriduteurDAO {

	static List<Distributeur> f = new ArrayList<Distributeur>();
	
	@Override
	public String addDistributeur(String mail, String pass) {
		for(Distributeur d:f) {
			if(d.getMail().equals(mail)) {
				return "echec de creation";
			}
		}
		Distributeur e =new Distributeur(mail,pass);
		f.add(e);
		return "ok";
	}

	@Override
	public boolean addFilm(String titre, String resume, LocalDate date) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addSalleFilm(Salle ddifuse) {
		// TODO Auto-generated method stub
		return false;
	}

}
