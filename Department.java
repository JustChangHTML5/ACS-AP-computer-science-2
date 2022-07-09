package model;

public class Department {
   private int id;
   private String name;
   private String address;
   private String city;
   private boolean status;
   
   public Department() {
   
   }
   
   public Department(int id, String name, String address, String city, boolean status) {
      this.id = id;
      this.name = name;
      this.address = address;
      this.city = city;
      this.status = status;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.name + ", " + this.address + ", " + this.city + ", " + this.status;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getName() {
      return this.name;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setName(String name) {
      this.name = name;
   }

}