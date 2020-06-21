package Classes;

import java.time.LocalDate;
import java.util.ArrayList;

import org.codehaus.jackson.annotate.JsonProperty;

public class Utilisateur {
	private String mail;
	private String pass;
	private Position adresse;
	
	public Utilisateur(@JsonProperty("mail")String mail,@JsonProperty("pass") String pass) {
		super();
		this.mail = mail;
		this.pass = pass;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public Position getAdresse() {
		return adresse;
	}

	public void setAdresse(Position adresse) {
		this.adresse = adresse;
	}
	
	public static ArrayList<Utilisateur> generateUtilisateur() {
		ArrayList<Utilisateur> f = new ArrayList<Utilisateur>();
		Utilisateur u1 = new Utilisateur("Sarah","1234");
		f.add(u1);
		
		return f;
	}
	

}
