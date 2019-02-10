package hello.model;

import javax.persistence.*;

@Entity
@Table(name = "greeting")
public class Greeting {

   private int id;
   private String name;
   private int parentId;

   @Id
   @Column(name = "id")
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Basic
   @Column(name = "name")
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
