package hello.repo;

import hello.model.StoreEntity;
import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<StoreEntity, Integer> {

   StoreEntity getStoreEntityByEmailAndPassword(String email, String password);

}
