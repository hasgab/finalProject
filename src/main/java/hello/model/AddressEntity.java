package hello.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "finalproject", catalog = "")
public class AddressEntity {
   private int id;
   private String streetName;
   private String streetNumber;
   private String city;
   private String state;
   private String country;
   private int zip;

   @Id
   @Column(name = "id")
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   @Basic
   @Column(name = "street_name")
   public String getStreetName() {
      return streetName;
   }

   public void setStreetName(String streetName) {
      this.streetName = streetName;
   }

   @Basic
   @Column(name = "street_number")
   public String getStreetNumber() {
      return streetNumber;
   }

   public void setStreetNumber(String streetNumber) {
      this.streetNumber = streetNumber;
   }

   @Basic
   @Column(name = "city")
   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   @Basic
   @Column(name = "state")
   public String getState() {
      return state;
   }

   public void setState(String state) {
      this.state = state;
   }

   @Basic
   @Column(name = "country")
   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   @Basic
   @Column(name = "zip")
   public int getZip() {
      return zip;
   }

   public void setZip(int zip) {
      this.zip = zip;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      AddressEntity that = (AddressEntity) o;
      return id == that.id &&
         zip == that.zip &&
         Objects.equals(streetName, that.streetName) &&
         Objects.equals(streetNumber, that.streetNumber) &&
         Objects.equals(city, that.city) &&
         Objects.equals(state, that.state) &&
         Objects.equals(country, that.country);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id, streetName, streetNumber, city, state, country, zip);
   }
}
