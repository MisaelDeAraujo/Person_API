package git.misaeldearaujo.api.person.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import git.misaeldearaujo.api.person.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
