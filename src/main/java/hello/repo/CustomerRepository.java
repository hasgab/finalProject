package hello.repo;

import hello.model.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, Integer> {

   CustomerEntity getCustomerEntityByEmailAndPassword(String email, String password);
}
