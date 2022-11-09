package ar.com.cododoacodo.restclient;

import java.util.List;

import ar.com.cododoacodo.restclient.dto.jph.Comment;

public interface JsonPlaceHolderService {
 
	public List<Comment> findComments();
}
