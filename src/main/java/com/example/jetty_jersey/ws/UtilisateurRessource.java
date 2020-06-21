package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Classes.Utilisateur;
import DAO.UtilisateurDAO;
import DAO.UtilisateurImpl;

@Path("/Utilisateur")
public class UtilisateurRessource {
	
	UtilisateurDAO UDAO = new UtilisateurImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{mail}")
	public Utilisateur getUtilisateur(@PathParam("mail") String mail) {
		return UDAO.getUtilisateur(mail);
	}	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)	
	public String connection(Utilisateur user) {
		Utilisateur u = UDAO.getUtilisateur(user.getMail());
		if (u == null) {
			return "utilisateur inexistant";
		}
		else if(!u.getPass().equals(user.getPass())) {
			return "pass errone";
		}
		 return "ok";
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public String addUtilisateur(Utilisateur u) {
		return UDAO.addUtilisateur(u.getMail(), u.getPass());
	}	
}
