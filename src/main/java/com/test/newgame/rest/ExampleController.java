package com.test.newgame.rest;

import com.test.newgame.igdbclient.IgdbClient;
import com.test.newgame.igdbclient.IgdbResponse;
import com.test.newgame.model.Employee;
import com.test.newgame.model.Vote;
import com.test.newgame.repo.EmployeeRepository;

import com.test.newgame.repo.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ExampleController {

    private final EmployeeRepository employeeRepository;
    private final VoteRepository voteRepository;
    private final IgdbClient igdbClient;


    @Autowired
    public ExampleController(final EmployeeRepository employeeRepository, final IgdbClient igdbClient, final VoteRepository voteRepository) {
        this.employeeRepository = employeeRepository;
        this.igdbClient = igdbClient;
        this.voteRepository = voteRepository;
    }

    @GetMapping("/hello/{lastName}")
    public String hello(@PathVariable final String lastName) {
        Optional<Employee> foundPerson = employeeRepository.findByLastName(lastName);

        return foundPerson
                .map(employee -> String.format("Hello %s %s!", employee.getFirstName(), employee.getLastName()))
                .orElse(String.format("Contact support to be added to the game!"));
    }

    @PostMapping(path = "/games", consumes = "application/json", produces = "application/json")
    public void saveVote(@RequestBody Vote vote) {
        voteRepository.save(vote);
    }

    @PostMapping(path = "/employee", consumes = "application/json", produces = "application/json")
    public void addEmployee(@RequestBody Employee emp) {
         employeeRepository.save(emp);
    }

    @GetMapping("/games")
    public String getGames() {

        return igdbClient.sendRequest()
                .map(IgdbResponse::fetchGames)
                .orElse("");
    }



}
