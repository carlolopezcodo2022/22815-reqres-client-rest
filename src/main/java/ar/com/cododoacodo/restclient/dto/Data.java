
package ar.com.cododoacodo.restclient.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "email",
    "first_name",
    "last_name",
    "avatar"
})
public class Data implements Comparable<Data>{

    @JsonProperty("id")
    public Integer id;
    @JsonProperty("email")
    public String email;
    @JsonProperty("first_name")
    public String firstName;
    @JsonProperty("last_name")
    public String lastName;
    @JsonProperty("avatar")
    public String avatar;
	
    @Override
	public String toString() {
		return "Data [id=" + id + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", avatar=" + avatar + "]";
	}

    @Override
    public int compareTo(Data o) {
    	//por id desc
    	return o.getId().compareTo(this.getId());
    }
    
    public Integer getId() {
    	return this.id;
    }
}
