package hello.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import hello.model.Greeting;
import hello.model.StoreEntity;
import hello.repo.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping(path = "/store")
public class StoreController {

   private final GreetingRepo repo;


   @Autowired
   public StoreController(GreetingRepo repo) {
      this.repo = repo;
   }

   @RequestMapping("/register")
   public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
      Greeting greeting = new Greeting();
      greeting.setName(name);
      repo.save(greeting);

      return greeting;
   }

   @RequestMapping("/saveStore")
   public StoreEntity saveStore(@RequestBody String json) {
      ObjectMapper mapper = new ObjectMapper();
      StoreEntity store = new StoreEntity();
      try {
         store = mapper.readValue(json, StoreEntity.class);
      } catch (IOException e) {
         e.printStackTrace();
      }
      return store;

   }
}
