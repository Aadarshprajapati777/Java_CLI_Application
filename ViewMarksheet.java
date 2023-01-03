import java.io.*;

public class ViewMarksheet {
    String line; 
    
    public void viewingMarksheet(){
        try {
            BufferedReader showingMarksheet = new BufferedReader(new FileReader("/home/adarsh/Documents/javaApp/studentMarksheet.csv"));
      
            while((line = showingMarksheet.readLine()) != null)
             {
                System.out.println(line);
              }
             showingMarksheet.close();

        } catch (IOException i) {
            System.out.println(i);
        }


    }
}
