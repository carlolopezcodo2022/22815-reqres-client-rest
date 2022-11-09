import java.util.List;

import ar.com.cododoacodo.restclient.JsonPlaceHolderService;
import ar.com.cododoacodo.restclient.dto.jph.Comment;
import ar.com.cododoacodo.restclient.impl.JsonPlaceHolderServiceJerseyImpl;

public class TestCaseComment {

	public static void main(String[] args) {
		
		/*pdo > "http://jsonplaceholder.typicode.com"
		qa > "http://qa.jsonplaceholder.typicode.com"
		dev > "http://dev.jsonplaceholder.typicode.com"*/
		
		JsonPlaceHolderService service = new JsonPlaceHolderServiceJerseyImpl("http://jsonplaceholder.typicode.com");

		List<Comment> comments = service.findComments();
		
		System.out.println(comments);
	}

}
