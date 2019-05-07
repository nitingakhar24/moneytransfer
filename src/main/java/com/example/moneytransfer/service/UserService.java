package com.example.moneytransfer.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("moneytransfer")
public class UserService 
{
	    @GET
	    @Produces(MediaType.TEXT_PLAIN)
	    public String get() {
	        return "Test";
	    }
	
}
