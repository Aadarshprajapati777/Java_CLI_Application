import java.util.Scanner;

public class teacher {
    public String studentName;
    public  String rollNo;
    public String physics;
    public String chemistry;
    public String maths;
    public String reply;
    Scanner sc = new Scanner(System.in);



    public String makeResult(){


        System.out.print("Enter yes  if you want to make the marksheet of the students: ");
        reply = sc.nextLine();
        if(reply.equals("yes")){
  

        System.out.println("please enter the student name, roll no and marks"); 

        System.out.print("Name: ");
        studentName= sc.nextLine();
 
        System.out.print("Roll No: ");
        rollNo= Integer.toString(sc.nextInt());

        System.out.print("Physics: ");
        physics= Integer.toString(sc.nextInt());

        System.out.print("Chemistry: ");
        chemistry= Integer.toString(sc.nextInt());

        System.out.print("Maths: ");
        maths= Integer.toString(sc.nextInt());

        }
        
     

        return  "StudentName: "+studentName+"        Rollno: "+rollNo+"             "+ " Subject:Marks      "+"     Physics: "+physics+"       Chemistry: "+chemistry+"        Maths: "+maths +"              Result printed\n";
        
    
}


}
