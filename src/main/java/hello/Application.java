package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application implements CommandLineRunner {

   private final ApplicationContext appContext;

   private static final Logger log = LoggerFactory.getLogger(Application.class);

   @Autowired
   public Application(ApplicationContext appContext) {
      this.appContext = appContext;
   }


   public static void main(String[] args) {
//       ApplicationContext appContext;
//       appContext.getBean("AddressService")
      SpringApplication.run(Application.class, args);

   }

   @Override
   public void run(String... args) throws Exception {
      System.out.println("run");
      String[] beans = appContext.getBeanDefinitionNames();
      Arrays.sort(beans);
      for (String bean : beans) {
         System.out.println(bean);
      }

   }
}
//    @Bean
//   public CommandLineRunner demo(AddressRepository repository) {
//      return (args) -> {
////         AddressEntity address = new AddressEntity();
////         address.setStreetName("Mozart111");
////         address.setStreetNumber("60");
////         address.setCity("Gyumri");
////         address.setCountry("Armenia");
////         address.setZip(3022);
////         repository.save(address);
//         repository.findById(1)
//            .ifPresent(addressEntity -> {
//               log.info("hello.Customer found with findById(1L):");
//               log.info("--------------------------------");
//               log.info(addressEntity.toString());
//               log.info("");
//            });
//
//      };
//   }
//
//}
