package ar.com.cododoacodo.restclient.impl;

import ar.com.cododoacodo.restclient.ReqresRestService;
import ar.com.cododoacodo.restclient.dto.User;
import ar.com.cododoacodo.restclient.dto.Users;
import ar.com.cododoacodo.restclient.executor.FindUsersExecutor;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public class ReqRestServiceJerseyImpl extends RestServiceBase implements ReqresRestService{
	
	public ReqRestServiceJerseyImpl(String urlBaseEndpoint) {
		super(urlBaseEndpoint);
	}
	
	//inicializar la api
	
	public Users findUsers() {			
		return new FindUsersExecutor(urlBaseEndpoint).execute();
	}

	public Users findUsers(Integer page) {
		
		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users?page=2
		WebTarget webTarget = client.target(this.urlBaseEndpoint)//"https://reqres.in"
				.path("/api/users")//los parametros que van despues /
				.queryParam("page="+page);//los parametros que van luego de ?clave=valor&clave2=valor...
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get
		Response response = invocation.get();
		
		//read
		Users users = response.readEntity(Users.class);
		
		return users;
	}

	public User getUser(Integer userId) {
		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users?page=2
		WebTarget webTarget = client.target(this.urlBaseEndpoint)//"https://reqres.in"
				.path("/api/users/"+userId);//los parametros que van despues /
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get
		Response response = invocation.get();
		
		//read
		User user = response.readEntity(User.class);
		
		return user;
	}

	public String getUrlBaseEndpoint() {
		return this.urlBaseEndpoint;
	}
}
