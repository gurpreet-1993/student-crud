import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delete {
  static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
   public static void delete() throws IOException {
       System.out.println("Enter  Your Name For Deletion");
        String name = bufferedReader.readLine();
       for (Entity entity :Create.list) {
           if (name.equalsIgnoreCase(entity.getName())) {
               Create.list.remove(entity);
               System.out.println("Removed Successfully");
           } else {
               System.out.println("invalid Name");
           }
       }
       }
}
