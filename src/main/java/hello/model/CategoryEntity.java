package hello.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "category")
public class CategoryEntity {
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

   @Basic
   @Column(name = "parent_id")
   public int getParentId() {
      return parentId;
   }

   public void setParentId(int parentId) {
      this.parentId = parentId;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      CategoryEntity that = (CategoryEntity) o;
      return id == that.id &&
         parentId == that.parentId &&
         Objects.equals(name, that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, parentId);
   }
}
