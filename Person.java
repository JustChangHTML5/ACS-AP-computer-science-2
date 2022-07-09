package model;

import java.time.LocalDate;

public abstract class Person {
   private int id;
   private String firstname;
   private String lastname;
   private LocalDate birth;
   private char gender;
   private String address;
   private String city;
   private String state;
   private String zip;
   private String phone;
   private String email;
   private boolean status;
   
   public Person() {
      this.status = true;
   }
   
   public Person(int id, String firstname, String lastname, char gender, boolean status) {
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
      this.gender = gender;
      this.status = status;
   }
   
   public Person(int id, String firstname, String lastname, char gender, String address, String phone, String email, boolean status) {
      this.id = id;
      this.firstname = firstname;
      this.lastname = lastname;
      this.gender = gender;
      this.address = address;
      this.phone = phone;
      this.email = email;
      this.status = status;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.firstname + ", " + this.lastname + ", " + this.gender + ", " + this.status;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getFirstname() {
      return this.firstname;
   }
   
   public String getLastname() {
      return this.lastname;
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
   
   public boolean getStatus() {
      return this.status;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }
   
   public void setLastname(String lastname) {
      this.lastname = lastname;
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
   
   public void setStatus(boolean status) {
      this.status = status;
   }

}