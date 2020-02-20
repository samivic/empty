package com.example.empty.samivic;

import com.example.empty.samivic.entities.Company;
import com.example.empty.samivic.entities.Person;
import com.example.empty.samivic.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController("/user")
public class Controller {

    @Autowired
    public Service service;

    @Autowired
    public CompanyRepository companyRepository;

    @Autowired
    public PersonRepository personRepository;

    @Autowired
    public UserRepository userRepository;

    @GetMapping("/hi")
    public String hi() {
        return "Hello World!";
    }

    @Value("${spring.messages}")
    private String message;

    @GetMapping
    public String helloWorld() {
        return message;
    }

    @GetMapping("/s")
    public Iterable<Sami> getAll() {
        return service.findAll();
    }

    @GetMapping("/c")
    public Iterable<Company> getCompany() {
        return companyRepository.findAll();
    }

    @GetMapping("/p")
    public Iterable<Person> getPerson() {
        return personRepository.findAll();
    }

    @GetMapping("/u")
    public Iterable<User> getUser() {
        return userRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "p/{age}")
    public Iterable<Person> getUser(@PathVariable int age) {
        return personRepository.findByAgeGreaterThan(age);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "p/{delete}")
    public Iterable<Person> deletePerson(@PathVariable Long delete) {
        userRepository.deleteById(delete);
        return personRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "r/{delete}")
    public void removePerson(@PathVariable Long delete) {
        userRepository.deleteById(delete);
    }

    @GetMapping("/n/{nom}")
    public Iterable<Person> findByName(@PathVariable String nom){
        return personRepository.findByNomStartingWith(nom);
    }

    @GetMapping("/count")
    public long countAll(){
        return service.countAll();
    }

    @GetMapping("maxAge")
    public long findMaxAge(){
        return userRepository.findMaxAge();
    }
}
