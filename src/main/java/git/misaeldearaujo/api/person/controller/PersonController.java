package git.misaeldearaujo.api.person.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import git.misaeldearaujo.api.person.entity.Person;
import git.misaeldearaujo.api.person.entity.dtos.PersonDTO;
import git.misaeldearaujo.api.person.service.PersonService;
import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/person")
public class PersonController {

	private PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<Object> savePerson(@RequestBody @Valid PersonDTO dto){
		Person person = new Person();
		LocalDateTime localDateTime = LocalDateTime.now();
		person.setRegistrationDate(localDateTime);
		BeanUtils.copyProperties(dto, person);
		return ResponseEntity.status(HttpStatus.CREATED).body(personService.savePerson(person));
	}
	
	@RequestMapping(value = "/findall", method = RequestMethod.GET)
	public ResponseEntity<List<Person>> findAll(){
		return ResponseEntity.status(HttpStatus.OK).body(personService.findAll());
	}
}
