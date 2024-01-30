import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Update {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void updation(){
        System.out.println("enter name :");
        try {
            String name = br.readLine();
        }
        catch (Exception ex){
            System.out.println("invalid input");
        }


    }
}
