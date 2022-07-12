package model;

public class Registration extends Record {
   private float fee;
   
   public Registration() {
      super();
   }
   
   public Registration(int id, int courseId, float fee, boolean status) {
      super(id, Integer.toString(courseId), status);
      this.fee = fee;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + this.fee;
   }
}