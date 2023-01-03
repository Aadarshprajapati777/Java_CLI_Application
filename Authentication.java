import java.util.Scanner;



class Authentication{
    public String checkAuthentication(){
        Scanner sc = new Scanner(System.in);
        String wrongAns ="wrongInput";

        System.out.println("USERNAME: ");
        String name = sc.nextLine();

         System.out.println("PASSWORD: ");
         String pass = sc.nextLine();


        if(name.equals("student") && pass.equals("student")){
            System.out.println("Welcome to Student Page");
            return name;
        }
        else if(name.equals("teacher") && pass.equals("teacher")){
            System.out.println("Welcome to Teacher Page");
            return name;
        }
        else{
            System.out.println("Please enter correct username and password");
            return wrongAns;
        }
    
    }
}

