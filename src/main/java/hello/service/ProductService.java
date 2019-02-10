package hello.service;

import hello.model.ProductEntity;
import hello.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
   private final
   ProductRepository repository;

   @Autowired
   public ProductService(ProductRepository repository) {
      this.repository = repository;
   }

   public void addProduct(ProductEntity product) {
      repository.save(product);
   }

   public void delete(Integer id) {
      repository.deleteById(id);
   }
}
