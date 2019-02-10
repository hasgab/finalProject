package hello.service;

import hello.model.CustomerEntity;
import hello.repo.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

   private final
   CustomerRepository repository;

   @Autowired
   public CustomerService(CustomerRepository repository) {
      this.repository = repository;
   }

   public void saveUser(CustomerEntity store) {
      repository.save(store);
   }

   public void delete(Integer id) {
      repository.deleteById(id);
   }

   public CustomerEntity login(String email, String password) {
      return repository.getCustomerEntityByEmailAndPassword(email, password);

   }
}
