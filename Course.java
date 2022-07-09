package model;

public class Course {
   private int id;
   private String name;
   private String semester;
   private float credit;
   private float fee;
   private int instructor;
   private boolean status;
   
   public Course() {
   
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
      this.id = id;
      this.name = name;
      this.semester = semester;
      this.credit = credit;
      this.fee = fee;
      this.status = status;
   }
   
   @Override
   public String toString() {
      return this.getClass().getSimpleName() + this.id + ", " + this.name + ", " + this.semester + ", " + this.credit + ", " + this.fee + ", " + this.status;
   }
   
   public int getId() {
      return this.id;
   }
   
   public String getName() {
      return this.name;
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
   
   public void setId(int id) {
      this.id = id;
   }
   
   public void setName(String name) {
      this.name = name;
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