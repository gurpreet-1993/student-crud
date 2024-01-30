import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Create {
  static   List<String> list = new ArrayList<>();
    public static void createRecord (){
        System.out.println("create");

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println(" ENTER NAME IN ARRAYLIST:-");
            String name = sc.next();
Entity entity= new Entity();
entity.setName(name);
            list.add(entity.getName());

        }
        System.out.println(list);
    }
}