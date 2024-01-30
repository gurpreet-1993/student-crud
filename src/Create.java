import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

public class Create {
    public static void main(String[] args) {
        System.out.println("create");

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {

            System.out.println(" ENTER NAME IN ARRAYLIST:-");
            String name = sc.next();

            list.add(name);

        }
        System.out.println(list);
    }
}