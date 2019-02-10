package hello.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customer", schema = "finalproject", catalog = "")
public class CustomerEntity {
   private int id;
   private String firstName;
   private String lastName;
   private String password;
   private String email;
   private String bankAccount;
   private String pictureUrl;
   private int addressId;

   @Id
   @Column(name = "id")
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Basic
   @Column(name = "firstName")
   public String getFirstName() {
      return firstName;
   }

   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   @Basic
   @Column(name = "lastName")
   public String getLastName() {
      return lastName;
   }

   public void setLastName(String lastName) {
      this.lastName = lastName;
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
   @Column(name = "email")
   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Basic
   @Column(name = "bank_account")
   public String getBankAccount() {
      return bankAccount;
   }

   public void setBankAccount(String bankAccount) {
      this.bankAccount = bankAccount;
   }

   @Basic
   @Column(name = "picture_url")
   public String getPictureUrl() {
      return pictureUrl;
   }

   public void setPictureUrl(String pictureUrl) {
      this.pictureUrl = pictureUrl;
   }

   @Basic
   @Column(name = "address_id")
   public int getAddressId() {
      return addressId;
   }

   public void setAddressId(int addressId) {
      this.addressId = addressId;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      CustomerEntity that = (CustomerEntity) o;
      return id == that.id &&
         addressId == that.addressId &&
         Objects.equals(firstName, that.firstName) &&
         Objects.equals(lastName, that.lastName) &&
         Objects.equals(password, that.password) &&
         Objects.equals(email, that.email) &&
         Objects.equals(bankAccount, that.bankAccount) &&
         Objects.equals(pictureUrl, that.pictureUrl);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, firstName, lastName, password, email, bankAccount, pictureUrl, addressId);
   }
}
