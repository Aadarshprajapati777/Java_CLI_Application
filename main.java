import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class main{
    public static void main(String[] args) {

        Authentication auth  = new Authentication();
        teacher newTeacher = new teacher();
        student newStudent = new student();
        MakeMarksheet newMarksheet = new MakeMarksheet();
        Scanner sc = new Scanner(System.in);


        String result = auth.checkAuthentication();
        System.out.print("enter 1 if you want to make result: ");
        int reply = sc.nextInt();
        

        if( result.equals("teacher") && reply==1) {         
            while(reply==1){
                reply=0;
            String studentData=newTeacher.makeResult();
            newMarksheet.resultUpdate(studentData);
            newTeacher.teacherReply();
            System.out.print("enter 1 if you want to make result of another student: ");
            reply = sc.nextInt();
 
   
            }
        }
         

        if (result.equals("student")) {
         newStudent.printResult();
         return;
        }

    }
}

