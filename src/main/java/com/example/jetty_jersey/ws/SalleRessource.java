package com.example.jetty_jersey.ws;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import Classes.Film;
import Classes.Position;
import Classes.Salle;
import DAO.SalleDAO;
import DAO.SalleImpl;

@Path("/Salle")
public class SalleRessource {
	SalleDAO salleDAO =new SalleImpl();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{nom}")
	public Salle getSalle(@PathParam("nom") String nom) {
		return salleDAO.getSalle(nom);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{nom}/adress")
	public Position getAdresse(@PathParam("nom")String nom) {
		return salleDAO.getAdress(nom);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{nom}/programme")
	public Map<Film, LocalDateTime> getProgramme(@PathParam("nom")String nom) {
		return salleDAO.getProgramme(nom);
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{nom}/film")
	public List<Film> getFilm(@PathParam("nom")String nom) {
		return salleDAO.getfilm(nom);
	}
	

}
