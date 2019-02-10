package hello.service;

import hello.model.AddressEntity;
import hello.repo.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
//   public AddressService() {
//      System.out.println("address service constructor");
//   }

   private final
   AddressRepository repository;

   @Autowired
   public AddressService(AddressRepository repository) {
      System.out.println("address service constructor");
      this.repository = repository;
   }

   public void addAddress(AddressEntity address) {
      repository.save(address);
   }

   public void delete(Integer id) {
      repository.deleteById(id);
   }
}
