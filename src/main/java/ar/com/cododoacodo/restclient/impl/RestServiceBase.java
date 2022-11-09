package ar.com.cododoacodo.restclient.impl;

public class RestServiceBase {
	
	protected String urlBaseEndpoint;
	
	public RestServiceBase(String urlBaseEndpoint) {
		if(urlBaseEndpoint == null) {
			throw new IllegalArgumentException("Debe indicar urlBaseEndpoint");
		}
		
		this.urlBaseEndpoint = urlBaseEndpoint;
	}
}
