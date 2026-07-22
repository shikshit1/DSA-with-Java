import java.util.ArrayList;
import java.util.List;

public class JavaCollections {
    static void main() {
        //list orr collection-> interface

        //Arraylist -> concrete class
         ArrayList<Integer> list = new ArrayList<>();


         //add method
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);

        //remove method
        list.remove(0);
        System.out.println(list);

        //addALL method
        List<Integer> list2 = new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(20);
        list.addAll(list2);
        System.out.println(list);
        //remove all method
        list.removeAll(list2);
        System.out.println(list);

       //size method
        System.out.println(list.size());

        // clear method
        System.out.println("list 2 :"+ list2);
        list2.clear();
        System.out.println(list2.size());


        //collection<Integer> collection = new ArrayList<>();
    }
}
