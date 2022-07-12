package model;

public class Course extends Record {
   private String semester;
   private float credit;
   private float fee;
   private int instructor;
   
   public Course() {
      super();
   }
   
   /*public Course(int id, String name, String semester, float credit, float fee, int instructor) {
      this.id = id;
      this.name = name;
      this.semester = semester;
      this.credit = credit;
      this.fee = fee;
      this.instructor = instructor;
   }*/
   
   public Course(int id, String name, String semester, float credit, float fee, boolean status) {
      super(id, name, status);
      this.semester = semester;
      this.credit = credit;
      this.fee = fee;
   }
   
   @Override
   public String toString() {
      return super.toString() + ", " + this.semester + ", " + this.credit + ", " + this.fee;
   }
   
   public String getSemester() {
      return this.semester;
   }
   
   public float getCredit() {
      return this.credit;
   }
   
   public float getFee() {
      return this.fee;
   }
   
   public int getInstructor() {
      return this.instructor;
   }
      
   public void setSemester(String semester) {
      this.semester = semester;
   }
   
   public void setCredit(float credit) {
      this.credit = credit;
   }
   
   public void setFee(float fee) {
      this.fee = fee;
   }
   
   public void setInstructor(int instructor) {
      this.instructor = instructor;
   }

}