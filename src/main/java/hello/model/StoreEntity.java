package hello.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "store", schema = "finalproject", catalog = "")
public class StoreEntity {
   private int id;
   private String name;
   private String password;
   private int addressId;
   private String email;
   private String imageUrl;

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
   @Column(name = "password")
   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   @Basic
   @Column(name = "address_id")
   public int getAddressId() {
      return addressId;
   }

   public void setAddressId(int addressId) {
      this.addressId = addressId;
   }

   @Basic
   @Column(name = "email")
   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Basic
   @Column(name = "image_url")
   public String getImageUrl() {
      return imageUrl;
   }

   public void setImageUrl(String imageUrl) {
      this.imageUrl = imageUrl;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      StoreEntity that = (StoreEntity) o;
      return id == that.id &&
         addressId == that.addressId &&
         Objects.equals(name, that.name) &&
         Objects.equals(password, that.password) &&
         Objects.equals(email, that.email) &&
         Objects.equals(imageUrl, that.imageUrl);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, name, password, addressId, email, imageUrl);
   }
}
