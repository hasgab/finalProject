package hello.repo;

import hello.model.SaleEntity;
import org.springframework.data.repository.CrudRepository;

public interface SaleRepository extends CrudRepository<SaleEntity, Integer> {
}
