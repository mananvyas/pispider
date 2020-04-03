package net.project.pispider.controller;

import net.project.pispider.entity.Address;
import net.project.pispider.entity.Person;
import net.project.pispider.repository.AddressRepository;
import net.project.pispider.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PersonController {
    @Autowired
    PersonRepository personRepository;

    @Autowired
    AddressRepository addressRepository;

    public PersonController() {
    }

    @GetMapping("/person")
    List<Person> getPersonList(){
        return personRepository.findAll();
    }

    @PostMapping("/person")
    Person addPerson(@RequestBody Person person){
        personRepository.save(person);
        //Save Address and Person Details to corresponding tables
        for (Address address:person.getAddress()) {
            address.setPerson(person);
            addressRepository.save(address);
        }
        return person;
    }
}
