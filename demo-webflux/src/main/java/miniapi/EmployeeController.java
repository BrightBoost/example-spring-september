package miniapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;


    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Employee> createEmployee(@RequestBody Employee Employee) {
        return employeeRepository.save(Employee);
    }

    @GetMapping("/")
    public Flux<Employee> getEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/Employee")
    public Mono<Employee> getEmployee(Long id) {
        return employeeRepository.findById(id);
    }

    @PutMapping("/")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Mono<Employee> updateEmployee(@RequestBody Employee Employee) {
        return this.employeeRepository
                .findById(Employee.getId())
                .map(c->Employee)
                .flatMap(this.employeeRepository::save);
    }

    @DeleteMapping("/")
    public Mono<Employee> delete(Long id) {
        return this.employeeRepository
                .findById(id)
                .flatMap(Employee -> this.employeeRepository.deleteById(Employee.getId()).thenReturn(Employee));
    }
}