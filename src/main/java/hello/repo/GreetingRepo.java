package hello.repo;

import hello.model.Greeting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepo extends CrudRepository<Greeting, Integer> {
}
