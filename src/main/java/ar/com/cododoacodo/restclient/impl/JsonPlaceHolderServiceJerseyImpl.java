package ar.com.cododoacodo.restclient.impl;

import java.util.List;

import ar.com.cododoacodo.restclient.JsonPlaceHolderService;
import ar.com.cododoacodo.restclient.dto.jph.Comment;
import ar.com.cododoacodo.restclient.executor.jph.FindCommentExecutor;

public class JsonPlaceHolderServiceJerseyImpl extends RestServiceBase implements JsonPlaceHolderService {

	public JsonPlaceHolderServiceJerseyImpl(String urlBaseEndpoint) {
		super(urlBaseEndpoint);
	}
	
	@Override
	public List<Comment> findComments() {
		return new FindCommentExecutor(urlBaseEndpoint).execute();
	}

}
