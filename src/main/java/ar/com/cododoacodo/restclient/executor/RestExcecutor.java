package ar.com.cododoacodo.restclient.executor;

import java.lang.reflect.ParameterizedType;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

public abstract class RestExcecutor<T> {

	public T execute() {
		
		Client client = ClientBuilder.newClient();
		
		//https://reqres.in/api/users?page=2
		WebTarget webTarget = this.buildWebTarget(client);//que el hijo decida
		
		//Invocation
		Invocation.Builder invocation = webTarget.request(MediaType.APPLICATION_JSON);
		
		//get
		Response response = this.buildResponse(invocation);
		
		//obtengo el class de la clase que extiende de RestExecutor
		Class<T> clazz = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
		//read
		T entity = response.readEntity(clazz);
		
		return entity;		
	}
	
	public abstract WebTarget buildWebTarget(Client client);
	public abstract Response buildResponse(Invocation.Builder invocation);
}
