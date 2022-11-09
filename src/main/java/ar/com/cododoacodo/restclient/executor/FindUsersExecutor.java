package ar.com.cododoacodo.restclient.executor;

import ar.com.cododoacodo.restclient.dto.Users;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class FindUsersExecutor extends RestExcecutor<Users>{
	
	private String urlBaseEndpoint;
	
	public FindUsersExecutor(String urlBaseEndpoint) {
		this.urlBaseEndpoint = urlBaseEndpoint;
	}
	
	@Override
	public WebTarget buildWebTarget(Client client) {
		return client.target(this.urlBaseEndpoint).path("/api/users");
	}

	@Override
	public Response buildResponse(Builder invocation) {
		return invocation.get();
	}

}
