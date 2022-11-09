package ar.com.cododoacodo.restclient.dto.jph;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import jakarta.annotation.Generated;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "postId", "id", "name", "email", "body" })
@Generated("jsonschema2pojo")
public class Comment {

	@JsonProperty("postId")
	public Integer postId;
	@JsonProperty("id")
	public Integer id;
	@JsonProperty("name")
	public String name;
	@JsonProperty("email")
	public String email;
	@JsonProperty("body")
	public String body;

}