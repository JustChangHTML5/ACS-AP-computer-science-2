package model;

import java.time.LocalDate;

public class Teacher extends Person{
   private String position;
   private float salary;
   private int supervisor;
   
   public Teacher() {
   
   }
   
   public Teacher(int id, String firstname, String lastname, char gender, boolean status) {
      super(id, firstname, lastname, gender, status);
   }
   
   /*public Teacher(int id, String firstname, String lastname, char gender, String address, String phone, String email, String position, float salary) {
      super(id, firstname, lastname, gender, address, phone, email);
      this.position = position;
      this.salary = salary;
   }*/
   
   @Override
   public String toString() {
      return super.toString();
   }
   
   public String getPosition() {
      return this.position;
   }
   
   public float getSalary() {
      return this.salary;
   }
   
   public void setPosition(String position) {
      this.position = position;
   }
   
   public void setSalary(float salary) {
      this.salary = salary;
   }
}