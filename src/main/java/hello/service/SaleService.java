package hello.service;

import hello.model.SaleEntity;
import hello.repo.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaleService {
   private final
   SaleRepository repository;

   @Autowired
   public SaleService(SaleRepository repository) {
      this.repository = repository;
   }

   public void addSale(SaleEntity sale) {
      repository.save(sale);
   }

   public void delete(Integer id) {
      repository.deleteById(id);
   }
}
