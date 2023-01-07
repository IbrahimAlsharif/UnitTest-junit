import org.example.Student;
import org.example.StudentsList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentsTest {
   @Test
   public void addStudentTest(){

       String IbrahIM="IbrahIM";
       StudentsList.addStudent(new Student(1,IbrahIM));

       String Hasan="Hasan";
       StudentsList.addStudent(new Student(2,Hasan));

       String IBRAhim="IBRAhim";
       StudentsList.addStudent(new Student(3,IBRAhim));


       String name= StudentsList.searchByName("ibrahim").getName();
       System.out.println(name);
       Assertions.assertEquals(IbrahIM,name);

       name= StudentsList.searchByName("ibrahim").getName();
       System.out.println(name);
       Assertions.assertEquals(IBRAhim,name);


   }
}
