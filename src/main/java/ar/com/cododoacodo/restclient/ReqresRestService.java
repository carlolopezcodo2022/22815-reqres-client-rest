package ar.com.cododoacodo.restclient;

import ar.com.cododoacodo.restclient.dto.User;
import ar.com.cododoacodo.restclient.dto.Users;

public interface ReqresRestService {

	/*
	 https://reqres.in/api/users
	*/
	public Users findUsers();
	
	public Users findUsers(Integer page);
	
	public User getUser(Integer userId);
}
