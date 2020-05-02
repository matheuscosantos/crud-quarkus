package br.com.mcos.crud.rest;

import java.net.URI;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import br.com.mcos.crud.model.Encontro;
import br.com.mcos.crud.rest.form.EncontroForm;
import br.com.mcos.crud.service.EncontroService;

@Path("/encontro")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EncontroResource {

	@Inject
	EncontroService encontroService;

	@GET
	public List<Encontro> lista() {
		return encontroService.lista();
	}
	
	@POST
	@Transactional
	public Response cria(Encontro encontro) {
		long id = encontroService.cria(encontro);
		URI uri = URI.create("http://localhost:8080/" + id);
		return Response.created(uri).build();
	}
	
	@PUT
	@Path("{id}")
	@Transactional
	public Response atualiza(@PathParam("id") long id, EncontroForm encontroForm) {		
		Encontro encontro = encontroService.atualiza(id, encontroForm);			
		URI uri = URI.create("http://localhost:8080/" + encontro.getId());
		return Response.created(uri).build();		
	}
	
	@GET
	@Path("{id}")
	public Encontro porId(@PathParam("id") long id) {
		return encontroService.porId(id);
	}
	
	@DELETE
	@Path("{id}")
	@Transactional
	public void apaga(@PathParam("id") long id) {
		Encontro encontro = encontroService.porId(id);
		if(encontro == null) {
			throw new WebApplicationException(404);
		}
		encontroService.apaga(id);
	}
	
	
}