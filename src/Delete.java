import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delete {
  static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
   public static void delete() throws IOException {
       System.out.println("Enter  Your Name For Deletion");
        String name = bufferedReader.readLine();
       for (Entity entity :Create.list) {
           if (entity.getName().equalsIgnoreCase(name)) {
               Create.list.remove(entity);
               System.out.println("Removed Successfully");
               System.out.println(Create.list);
           } else {
               System.out.println("invalid Name");
           }
       }
       }
}
