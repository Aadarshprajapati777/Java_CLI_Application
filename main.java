import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Authentication auth  = new Authentication();
        teacher newTeacher = new teacher();
        student newStudent = new student();
        MakeMarksheet newMarksheet = new MakeMarksheet();


        String result = auth.checkAuthentication();
        

        if( result.equals("teacher") ) {         
        
            String studentData=newTeacher.makeResult();
            newMarksheet.resultUpdate(studentData);
 

            
        }
         

        if (result.equals("student")) {
         newStudent.printResult();
        }

    }
}

