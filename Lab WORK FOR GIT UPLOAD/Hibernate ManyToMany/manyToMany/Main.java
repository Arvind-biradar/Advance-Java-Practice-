

/*Always   Start with Primary table Like the table have mappedBy is there ....add in this Teacher table  and then add in second table*/ 


package manyToMany;
import java.util.*;

import oneToMany.*;
public class Main {

	public static void main(String[] args) {
		Student s=new Student();
        GenericDeo gd=new GenericDeo();
       /* 
        // add student in table student
        s.setEducation("BE IT ");
        s.setMobileNo(8888093);
        s.setName("Avinash");
        gd.save(s);
        //teacher.add(t1);*/
        
        
        
        
        
       /* Student s2= (Student)gd.fetchById(Student.class, 1);//feached the data of student Id 1 and 
        List<Teacher> teacher=new ArrayList<Teacher>(); // TeacherList created
        teacher.add((Teacher)gd.fetchById(Teacher.class, 1)); //add first teacher
        teacher.add((Teacher)gd.fetchById(Teacher.class, 2)); //add 2nd teacher
        teacher.add((Teacher)gd.fetchById(Teacher.class, 3)); //added 3rd teacher
        s2.setTeacher(teacher);  // then  setTeacher in s2
        gd.save(s2);  */      // saved the student
        
        
        
        
       /* 
        //Not work in reverse
        Teacher t=new Teacher();
        
        List<Student> std=new ArrayList<Student>();
        std.add((Student)gd.fetchById(Student.class, 1));
        std.add((Student)gd.fetchById(Student.class, 2));
        std.add((Student)gd.fetchById(Student.class, 3));
        
        t.setExperience(3);
        t.setSubject("ADVANCE JAV");
        t.setTeacherName("Majrul");
        t.setStudent(std);
        gd.save(t);*/
        
        
        
        /*
        //s3 fetched and all teacher is set to the s3 student
        Student s3=(Student)gd.fetchById(Student.class, 3);
        
        List<Teacher> tchr=new ArrayList<Teacher>();
        tchr.add((Teacher)gd.fetchById(Teacher.class, 1));
        tchr.add((Teacher)gd.fetchById(Teacher.class, 2));
        tchr.add((Teacher)gd.fetchById(Teacher.class, 3));
        tchr.add((Teacher)gd.fetchById(Teacher.class, 4));
        tchr.add((Teacher)gd.fetchById(Teacher.class, 5));
        s3.setTeacher(tchr);  
        gd.save(s3);
       */
       
        
        
        
        
        
        
        
        
        
     
    //   List<Student> s1=new ArrayList<Student>();
       //s1.add((Student)gd.fetchById(Student.class, 5));
      /* Teacher t1=(Teacher)gd.fetchById(Teacher.class, 1);
       List<Teacher> teacher=new ArrayList<Teacher>();
      
   
      // s.setTeacher(teacher);
       //gd.save(s);
      
       
//      Student s2= (Student)gd.fetchById(Student.class, 1);
       // s1.add((Student)gd.fetchById(Student.class, 1));  
//      List<Teacher> teacher=new ArrayList<Teacher>();
//       teacher.add((Teacher)gd.fetchById(Teacher.class, 2));
//       teacher.add((Teacher)gd.fetchById(Teacher.class, 3));
//       s1.setEducation("BE Mechanical");
//       s1.setMobileNo(7387093);
//       s1.setName("Arvind");
//       s1.setTeacher(teacher);
        //Teacher t=new Teacher();
       
//        t.setExperience(8);
//        t.setSubject("HTML");
//        t.setTeacherName("VIPUL");
//        teacher.add(t1); 
//        teacher=new ArrayList<Teacher>();
//        teacher.add(t2); 
//        s2.setTeacher(teacher); 
//        gd.save(s1);
        
      
      
       // Teacher t1=(Teacher)gd.fetchById(Teacher.class, 1);
      //  Teacher t1=new Teacher();
//        t1.setExperience(7);
//        t1.setSubject(".NET");
//        t1.setTeacherName("Shudhash");
//        gd.save(t1);
//        teacher.add(t);
       // teacher.add(t1);
//        t1.setStudent(s1);
//       t1.setStudent(s1);
//        gd.save(s1);*/
        
        Dao dao =new Dao();
        
        List<Student> l=dao.fetchAllStudentByTeacherName("Vipul");
        for(Student st:l) {
        	System.out.println(st.getId()+" "+st.getName()+" "+st.getEducation()+" "+st.getMobileNo());
        }
        
        
        
	}

}
