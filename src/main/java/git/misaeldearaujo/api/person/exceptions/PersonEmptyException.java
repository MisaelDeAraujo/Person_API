package git.misaeldearaujo.api.person.exceptions;

public class PersonEmptyException extends RuntimeException{

	public PersonEmptyException() {
		super("Campo não preenchido");
	}
	
	PersonEmptyException(String message){
		super(message);
	}
}
