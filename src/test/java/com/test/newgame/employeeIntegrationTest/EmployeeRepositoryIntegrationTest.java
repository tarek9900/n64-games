package com.test.newgame.employeeIntegrationTest;

import com.test.newgame.model.Employee;
import com.test.newgame.repo.EmployeeRepository;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryIntegrationTest {

    @Autowired
    private EmployeeRepository subject;

    @After
    public void tearDown() throws Exception {
        subject.deleteAll();
    }

    @Test
    public void shouldSaveAndFetchPerson() throws Exception {
        Employee peter = new Employee("michael", "jackson");
        subject.save(peter);

        Optional<Employee> maybePeter = subject.findByLastName("jackson");

        assertThat(maybePeter, is(Optional.of(peter)));
    }
}
