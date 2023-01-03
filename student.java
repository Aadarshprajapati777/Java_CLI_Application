import java.util.Scanner;

public class student {
    ViewMarksheet showingMarksheet = new ViewMarksheet();
    public void printResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter yes to see your result: ");
        String ans = sc.nextLine();

        if(ans.equals("yes")){
            System.out.println("Congratulations passed");
            showingMarksheet.viewingMarksheet();

        }
        else{
            System.out.println("please enter yes to see the result ");
        }
    }
}
