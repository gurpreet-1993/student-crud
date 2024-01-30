import java.io.IOException;
import java.util.Scanner;

public class Execution {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
       while(true) {
           System.out.println("-------enter your choice-------");
           System.out.println("press 1 to create  : ");
           System.out.println("press 2 to update  : ");
           System.out.println("press 3 to remove  : ");
           System.out.println("press 4 to quit  : ");
           int choice = scanner.nextInt();
           if (choice == 1) {
               Create.createRecord();
           } else if (choice == 2) {
               Update.updation();
           } else if (choice == 3) {
               Delete.delete();
           } else if (choice==4) {
               System.out.println("quit");
               break;
           }
       }
    }
}
