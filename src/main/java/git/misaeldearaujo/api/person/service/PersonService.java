package git.misaeldearaujo.api.person.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import git.misaeldearaujo.api.person.entity.Person;
import git.misaeldearaujo.api.person.exceptions.PersonFullFieldException;
import git.misaeldearaujo.api.person.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public List<String> getFullFieldList(Person person){
		List<String> fullFields = new ArrayList<>();
		
		if(person.getCompleteName().length()>50) {
			fullFields.add("completeName");
		}
		if(person.getEmail().length()>50) {
			fullFields.add("email");
		}
		if(person.getCpf().length()>11) {
			fullFields.add("cpf");
		}
		if(person.getRg().length()>10) {
			fullFields.add("rg");
		}
		if(person.getGender().length()>6) {
			fullFields.add("gender");
		}
		if(person.getCellphone().length()>11) {
			fullFields.add("cellphone");
		}
		if(person.getCep().length()>8) {
			fullFields.add("cep");
		}
		if(person.getAddress().isEmpty()) {
			fullFields.add("address");
		}
		if(person.getNumber().length()>30) {
			fullFields.add("number");
		}
		if(person.getComplement().length()>30) {
			fullFields.add("complement");
		}
		if(person.getCity().length()>30) {
			fullFields.add("city");
		}
		if(person.getDistrict().length()>30) {
			fullFields.add("district");
		}
		if(person.getState().length()>30) {
			fullFields.add("state");
		}
		if(person.getCountry().length()>30) {
			fullFields.add("country");
		}
		
		return fullFields;
	}

	public Person savePerson(Person person) {
		List<String> fullFields = getFullFieldList(person);
		
		if(!fullFields.isEmpty()) {
			throw new PersonFullFieldException(fullFields);
		}else {
			return personRepository.save(person);					
		}
	}
	
	public List<Person> findAll(){
		return personRepository.findAll();
	}
	
	public Optional<Person> findById(Integer id){
		return personRepository.findById(id);
	}
	
	
	
}
