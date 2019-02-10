package hello.repo;

import hello.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

   CustomerEntity getCustomerEntityByEmailAndPassword(String email, String password);
}
