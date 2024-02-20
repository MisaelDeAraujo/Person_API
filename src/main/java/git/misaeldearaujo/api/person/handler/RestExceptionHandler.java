package git.misaeldearaujo.api.person.handler;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import git.misaeldearaujo.api.person.exceptions.PersonEmptyException;
import git.misaeldearaujo.api.person.exceptions.PersonFullFieldException;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(PersonEmptyException.class)
	public ResponseEntity<String> personIsEmptyException(PersonEmptyException personEmptyException) {
		return ResponseEntity.status(HttpStatus.CONFLICT).body("Algum campo vazio");
	}
	
	@ExceptionHandler(PersonFullFieldException.class)
	public ResponseEntity<String> personFullField(PersonFullFieldException ex){
		List<String> fullFields = ex.getFullFields();
		return ResponseEntity.status(HttpStatus.CONFLICT).body("excedeu limite de caracteres no campo: " +
		String.join(",", fullFields));
	}
}
