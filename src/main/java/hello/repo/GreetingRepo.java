package hello.repo;

import hello.model.Greeting;
import org.springframework.data.repository.CrudRepository;

public interface GreetingRepo extends CrudRepository<Greeting, Integer> {
}
