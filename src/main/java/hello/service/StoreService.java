package hello.service;

import hello.model.StoreEntity;
import hello.repo.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {
   private final
   StoreRepository repository;

   @Autowired
   public StoreService(StoreRepository repository) {
      this.repository = repository;
   }

   public void saveStore(StoreEntity store) {
      repository.save(store);
   }

   public void delete(Integer id) {
      repository.deleteById(id);
   }

   public StoreEntity login(String email, String password) {
      return repository.getStoreEntityByEmailAndPassword(email, password);
   }

}
