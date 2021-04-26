/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.io.StringWriter;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author 60050257
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }
    
    static double pie = 3.1415926535898;

    /**
     * Retrieves representation of an instance of services.GenericResource
     * @return an instance of java.lang.String
     */
    @GET
    @Path("/area/{radius}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getArea(@PathParam("radius") int radius) {
        //TODO return proper representation object
//        throw new UnsupportedOperationException();
//        int r = Integer.parseInt(radius)
        StringWriter writter = new StringWriter();
        JAXB.marshal(pie * radius * radius, writter);
        return writter.toString();
    }
    
    @GET
    @Path("/circumference/{radius}")
    @Produces(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public String getCircumference(@PathParam("radius") int radius) {
        //TODO return proper representation object
//        throw new UnsupportedOperationException();
//        int r = Integer.parseInt(radius)
        StringWriter writter = new StringWriter();
        JAXB.marshal(2 * pie * radius, writter);
        return writter.toString();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(javax.ws.rs.core.MediaType.APPLICATION_XML)
    public void putXml(String content) {
    }
}
