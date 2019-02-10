package hello.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "order", schema = "finalproject", catalog = "")
public class OrderEntity {
   private int id;
   private int productId;
   private Timestamp dateCreated;

   @Id
   @Column(name = "id")
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Basic
   @Column(name = "product_id")
   public int getProductId() {
      return productId;
   }

   public void setProductId(int productId) {
      this.productId = productId;
   }

   @Basic
   @Column(name = "date_created")
   public Timestamp getDateCreated() {
      return dateCreated;
   }

   public void setDateCreated(Timestamp dateCreated) {
      this.dateCreated = dateCreated;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      OrderEntity that = (OrderEntity) o;
      return id == that.id &&
         productId == that.productId &&
         Objects.equals(dateCreated, that.dateCreated);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, productId, dateCreated);
   }
}
