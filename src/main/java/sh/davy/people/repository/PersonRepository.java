package sh.davy.people.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import sh.davy.people.rest.v1.model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, String> {
}
