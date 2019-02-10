package hello.model;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table()
public class SaleEntity {
   private int id;
   private int itemId;
   private int discount;
   private Timestamp dateCreated;
   private Timestamp validUntil;

   @Id
   @Column(name = "id")
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Basic
   @Column(name = "item_id")
   public int getItemId() {
      return itemId;
   }

   public void setItemId(int itemId) {
      this.itemId = itemId;
   }

   @Basic
   @Column(name = "discount")
   public int getDiscount() {
      return discount;
   }

   public void setDiscount(int discount) {
      this.discount = discount;
   }

   @Basic
   @Column(name = "date_created")
   public Timestamp getDateCreated() {
      return dateCreated;
   }

   public void setDateCreated(Timestamp dateCreated) {
      this.dateCreated = dateCreated;
   }

   @Basic
   @Column(name = "valid_until")
   public Timestamp getValidUntil() {
      return validUntil;
   }

   public void setValidUntil(Timestamp validUntil) {
      this.validUntil = validUntil;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      SaleEntity that = (SaleEntity) o;
      return id == that.id &&
         itemId == that.itemId &&
         discount == that.discount &&
         Objects.equals(dateCreated, that.dateCreated) &&
         Objects.equals(validUntil, that.validUntil);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, itemId, discount, dateCreated, validUntil);
   }
}
