package collectionstest;

import java.util.ArrayList;

public class ArrList {

    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Tom");
        arr.add("John");
        arr.add("Reeta");
        arr.add(1,"Jack");
        System.out.println(arr);
//        arr.remove(1);
        System.out.println(arr.get(2));


    }

}
