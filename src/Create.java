import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Create {
  static   List<Entity> list = new ArrayList<>();
   static Entity entity= new Entity();
    public static void createRecord (){
        System.out.println("create");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {

            System.out.println(" ENTER NAME IN ARRAYLIST:-");
            String name = sc.next();

            entity.setName(name);
            list.add(entity);

        }
        System.out.println(list);
    }
}