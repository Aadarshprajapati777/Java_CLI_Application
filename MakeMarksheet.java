import java.io.*;

public class MakeMarksheet {
    public void resultUpdate(String studentData){
       
        try {
        BufferedWriter writingmarks = new BufferedWriter(new FileWriter("/home/adarsh/Documents/javaApp/studentMarksheet.csv"));
        writingmarks.write(studentData+"");
        writingmarks.close();           
        } 
        
        catch (IOException i) {
            System.out.println(i);
        }
        
    }
}
