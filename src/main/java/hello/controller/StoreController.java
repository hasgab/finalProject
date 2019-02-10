package hello.controller;


import hello.model.Greeting;
import hello.repo.GreetingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
