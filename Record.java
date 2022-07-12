package model;

public abstract class Record {
   private int id;
   private String name;
   private boolean status;
   
   public Record() {
   
   }
   
   public Record(int id, String name, boolean status) {
      this.id = id;
      this.name = name;
      this.status = status;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.name + ", " + this.status;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getName() {
      return this.name;
   }
   
   public boolean getStatus() {
      return this.status;
   }
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   
   public void setStatus(boolean status) {
      this.status = status;
   }
}