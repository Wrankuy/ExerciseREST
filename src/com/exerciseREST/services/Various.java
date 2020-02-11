package com.exerciseREST.services;
		
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/services")
public class Various {

	
	@GET
	@Path("/Obligame")
	public String mensajitu() 
	{
		return "Obligame Prroo!!!";
	}
}
