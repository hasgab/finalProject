package hello.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "product", schema = "finalproject", catalog = "")
public class ProductEntity {
   private int id;
   private String name;
   private long price;
   private int amount;
   private String description;
   private int categoryId;

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
   @Column(name = "price")
   public long getPrice() {
      return price;
   }

   public void setPrice(long price) {
      this.price = price;
   }

   @Basic
   @Column(name = "amount")
   public int getAmount() {
      return amount;
   }

   public void setAmount(int amount) {
      this.amount = amount;
   }

   @Basic
   @Column(name = "description")
   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   @Basic
   @Column(name = "category_id")
   public int getCategoryId() {
      return categoryId;
   }

   public void setCategoryId(int categoryId) {
      this.categoryId = categoryId;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      ProductEntity that = (ProductEntity) o;
      return id == that.id &&
         price == that.price &&
         amount == that.amount &&
         categoryId == that.categoryId &&
         Objects.equals(name, that.name) &&
         Objects.equals(description, that.description);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, price, amount, description, categoryId);
   }
}
