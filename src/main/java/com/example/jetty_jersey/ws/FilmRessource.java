package com.example.jetty_jersey.ws;

import java.time.LocalDate;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import DAO.FilmDAO;
import DAO.FilmImpl;

import Classes.Film;
import Classes.Salle;

@Path("/Film")
public class FilmRessource {
	
	FilmDAO filmDAO =new FilmImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Film> getFilms() {
		return filmDAO.getFilms();
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public boolean createFilm(Film film) {
		return filmDAO.createFilm(film);
		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{titre}")
	public Film getFilm(@PathParam("titre") String titre) {
		return filmDAO.getFilm(titre);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{titre}/date")
	public LocalDate getdate(@PathParam("titre") String titre) {
		return filmDAO.getdate(titre);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{titre}/salleProjet")
	public List<Salle> getSalleProjete(@PathParam("titre") String titre){
		return filmDAO.getSalleProjete(titre);
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{titre}/addCritique/{critique}/{note}")
	public boolean addCritique(@PathParam("titre") String titre, @PathParam("critique") String critique,@PathParam("note") float note){
		return filmDAO.addCritique(titre, critique, note);
	}
	
	/*@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{titre}/addSAlle")
	public boolean addSalle(@PathParam("titre") String titre,  Salle cine) {
		return filmDAO.addSalle(titre, cine);
	}*/

}
