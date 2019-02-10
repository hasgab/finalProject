package hello.service;

import hello.model.CategoryEntity;
import hello.repo.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {


   private final
   CategoryRepository repository;

   @Autowired
   public CategoryService(CategoryRepository repository) {
      this.repository = repository;
   }

   public void addCategory(CategoryEntity category) {
      repository.save(category);
   }

   public void deleteCategory(Integer id) {
      repository.deleteById(id);
   }
}
