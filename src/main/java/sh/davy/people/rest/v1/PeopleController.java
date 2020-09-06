package sh.davy.people.rest.v1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sh.davy.people.repository.PersonRepository;
import sh.davy.people.rest.v1.model.Person;

@RestController
@RequestMapping("/api/v1/people")
public class PeopleController {

    private final PersonRepository personRepository;

    public PeopleController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public void create(@RequestBody Person person) {
        personRepository.save(person);
    }
}
