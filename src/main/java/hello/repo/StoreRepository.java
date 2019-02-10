package hello.repo;

import hello.model.StoreEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository extends CrudRepository<StoreEntity, Integer> {

   StoreEntity getStoreEntityByEmailAndPassword(String email, String password);

}
