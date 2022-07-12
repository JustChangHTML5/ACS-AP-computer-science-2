package model;

import java.time.LocalDate;

public abstract class Person extends Record {
   private LocalDate birth;
   private char gender;
   private String address;
   private String city;
   private String state;
   private String zip;
   private String phone;
   private String email;
   
   public Person() {
      super();
   }
   
   public Person(int id, String firstname, String lastname, char gender, boolean status) {
      super(id, firstname + lastname, status);
      this.gender = gender;
   }
   
   public Person(int id, String firstname, String lastname, char gender, String address, String phone, String email, boolean status) {
      super(id, firstname + lastname, status);
      this.gender = gender;
      this.address = address;
      this.phone = phone;
      this.email = email;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + this.gender;
   }
   
   public char getGender() {
      return this.gender;
   }
   
   public String getAddress() {
      return this.address;
   }
   
   public String getPhone() {
      return this.phone;
   }
   
   public String getEmail() {
      return this.email;
   }
      
   public void setGender(char gender) {
      this.gender = gender;
   }
   
   public void setAddress(String address) {
      this.address = address;
   }
   
   public void setPhone(String phone) {
      this.phone = phone;
   }
   
   public void setEmail(String email) {
      this.email = email;
   }

}