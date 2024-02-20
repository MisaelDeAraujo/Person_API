package git.misaeldearaujo.api.person.exceptions;

import java.util.List;

public class PersonFullFieldException extends RuntimeException{

	private final List<String> fullFields;
	
	public PersonFullFieldException(List<String> fullFields) {
		super("Campo excedeu quantidade de caracteres" + String.join(",", fullFields));
		this.fullFields = fullFields;
	}
	
	public List<String> getFullFields(){
		return fullFields;
	}
	
}
