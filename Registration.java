package model;

public class Registration {
   private int id;
   private int courseId;
   private float fee;
   private boolean status;
   
   public Registration() {
   
   }
   
   public Registration(int id, int courseId, float fee, boolean status) {
      this.id = id;
      this.courseId = courseId;
      this.fee = fee;
      this.status = status;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.courseId + ", " + this.fee + ", " + this.status;
   }
}