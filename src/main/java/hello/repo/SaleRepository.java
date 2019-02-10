package hello.repo;

import hello.model.SaleEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleRepository extends CrudRepository<SaleEntity, Integer> {
}
