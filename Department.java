package model;

public class Department extends Record{
   private String address;
   private String city;
   
   public Department() {
      super();
   }
   
   public Department(int id, String name, String address, String city, boolean status) {
      super(id, name, status);
      this.address = address;
      this.city = city;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + this.address + ", " + this.city;
   }

}