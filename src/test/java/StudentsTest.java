import org.example.Student;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentsTest {
   @Test
   public void addStudentTest(){
       Student student= new Student();
       String IbrahIM="IbrahIM";
       student.setId(1);
       student.setName(IbrahIM);
       student.addStudent(student);
       Student student1= new Student();
       student1.setId(2);
       String Hasan="Hasan";
       student1.setName(Hasan);
       student1.addStudent(student1);

       Student student3= new Student();
       String IBRAhim="IBRAhim";
       student3.setId(3);
       student3.setName(IBRAhim);
       student3.addStudent(student3);


       String name= student.searchByName("ibrahim").getName();
       System.out.println(name);
       Assertions.assertEquals(IbrahIM,name);
       name= student.searchByName("ibrahim").getName();
       System.out.println(name);
       Assertions.assertEquals(IBRAhim,name);


   }
}
