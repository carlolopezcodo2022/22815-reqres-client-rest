package ar.com.cododoacodo.restclient.executor.jph;

import java.util.List;

import ar.com.cododoacodo.restclient.executor.RestExcecutor;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.Invocation.Builder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class FindCommentExecutor extends RestExcecutor<List>{
	
	private String urlBaseEndpoint;
	
	public FindCommentExecutor(String urlBaseEndpoint) {
		this.urlBaseEndpoint = urlBaseEndpoint;
	}
	
	@Override
	public WebTarget buildWebTarget(Client client) {
		return client.target(this.urlBaseEndpoint).path("/comments");
	}

	@Override
	public Response buildResponse(Builder invocation) {
		return invocation.get();
	}

}
