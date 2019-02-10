package hello.service;

import hello.model.OrderEntity;
import hello.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
   private final
   OrderRepository repository;

   @Autowired
   public OrderService(OrderRepository repository) {
      this.repository = repository;
   }

   public void addOrder(OrderEntity order) {
      repository.save(order);
   }

   public void delete(Integer id) {
      repository.deleteById(id);
   }
}
