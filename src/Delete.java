import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Delete {
  static BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
static   Entity entity;
   public static void delete() throws IOException {
       System.out.println("Enter  Your Name For Deletion");
        String name = bufferedReader.readLine();

       if (name.equalsIgnoreCase(entity.getName())) {
           Create.list.remove(entity);

        }else {
           System.out.println("invalid Book Name");
       }
       }
}
