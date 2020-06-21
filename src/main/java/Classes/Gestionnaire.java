package Classes;

public class Gestionnaire extends Utilisateur {
	private Salle travail;

	public Gestionnaire(String mail, String pass) {
		super(mail, pass);
		// TODO Auto-generated constructor stub
	}

	public Gestionnaire(String mail, String pass, Salle travail) {
		super(mail, pass);
		this.travail = travail;
	}

	public Salle getTravail() {
		return travail;
	}

	public void setTravail(Salle travail) {
		this.travail = travail;
	}
	
	
	

}
