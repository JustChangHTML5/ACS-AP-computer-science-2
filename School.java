
import model.Student;
import model.Teacher;
import model.Course;
import model.Registration;
import model.Department;

public class School {
   
   private String name;
   private String address;
   private String city;
   private String state;
   private int numOfFaculty;
   
   public School() {
   
   }
   
   public School(String name, String address, String city, String state, int numOfFaculty) {
      this.name = name;
      this.address = address;
      this.city = city;
      this.state = state;
      this.numOfFaculty = numOfFaculty;
   }

   public static void main(String[] args) {
      // Assume you specify all input values.
      Object obj = null;
      String type = args[0];
      if (args.length >= 6 && "Student".equals(type) || args.length >= 6 && "Teacher".equals(type) || args.length >= 6 && "Department".equals(type) || args.length >= 7 && "Course".equals(type) || args.length >= 5 && "Registration".equals(type)) {
         int id = Integer.parseInt(args[1]);
         if ("Student".equals(type)) {
            String firstname = args[2];
            String lastname = args[3];
            char gender = args[4].charAt(0);
            boolean status = Boolean.parseBoolean(args[5]);
            obj = new Student(id, firstname, lastname, gender, status);
         } else if ("Teacher".equals(type)) {
            String firstname = args[2];
            String lastname = args[3];
            char gender = args[4].charAt(0);
            boolean status = Boolean.parseBoolean(args[5]);
            obj = new Teacher(id, firstname, lastname, gender, status);
         } else if ("Department".equals(type)) {
            String name = args[2];
            String address = args[3];
            String city = args[4];
            boolean status = Boolean.parseBoolean(args[5]);
            obj = new Department(id, name, address, city, status);
         } else if ("Course".equals(type)) {
            String name = args[2];
            String semester = args[3];
            float credit = Float.parseFloat(args[4]);
            float fee = Float.parseFloat(args[5]);
            boolean status = Boolean.parseBoolean(args[6]); 
            obj = new Course(id, name, semester, credit, fee, status);
         } else if ("Registration".equals(type)) {
            int courseId = Integer.parseInt(args[2]);
            float fee = Float.parseFloat(args[3]);
            boolean status = Boolean.parseBoolean(args[4]);
            obj = new Registration(id, courseId, fee, status);
         }
         
         System.out.println(obj.toString());
      }
   }
}