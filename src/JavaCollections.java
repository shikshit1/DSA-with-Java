import java.util.*;

public class JavaCollections {
    static void main() {
        //list orr collection-> interface

        //Arraylist -> concrete class
//         ArrayList<Integer> list = new ArrayList<>();

//
//         //add method
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);
//        list.add(40);
//        System.out.println(list);
//
//        //remove method
//        list.remove(0);
//        System.out.println(list);
//
//        //addALL method
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//        list.addAll(list2);
//        System.out.println(list);
//        //remove all method
//        list.removeAll(list2);
//        System.out.println(list);
//
//       //size method
//        System.out.println(list.size());
//
//        // clear method
//        System.out.println("list 2 :"+ list2);
//        list2.clear();
//        System.out.println(list2.size());
//
//
//        //i want to traverse list using iterator
//        Iterator<Integer> iterator= list.iterator();
//        while(iterator.hasNext()){
//            System.out.println("element:"+ iterator.next());
//        }
//
//
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(12);
//        list3.add(124);
//        list3.add(31);
//        System.out.println(list3.get(0));
//        System.out.println("before list:"+ list3);// means run only element which is in 0 index
//
//
//        list3.set(0,234);   // it means replace the element in 0 index with 234 element
//        System.out.println("after list:"+list3);
//
//
//
//
//        // toArray    // kisi bhi list ko object  array me convert krne ke liye
//        Object[] arr=  list3.toArray();
//        for(Object obj: arr) {
//            System.out.println(obj);
//        }
//            //contain    // check if there is element present is list then run true otherwise false
//            System.out.println(list3.contains(23));
//
//
//            list.add(1);
//            list.add(5);
//        System.out.println("printing entire list"+ list);
//
//        //sort an arrayList
//        Collections.sort(list);
//        System.out.println("printing entire list"+ list);
//
//        //clone   // create another list same  as other lists
//        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
//        System.out.println( "printing entire new list" +newList);
//
//        //ensure capacity
//       ArrayList<Integer> marks = new ArrayList<>();
//       marks.ensureCapacity(100);
//        System.out.println(marks.isEmpty());
//
//        System.out.println(newList.indexOf(40));

         // Java linked list


        LinkedList<Integer> list = new LinkedList<>();


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


        //i want to traverse list using iterator
        Iterator<Integer> iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println("element:"+ iterator.next());
        }


        List<Integer> list3 = new ArrayList<>();
        list3.add(12);
        list3.add(124);
        list3.add(31);
        System.out.println(list3.get(0));
        System.out.println("before list:"+ list3);// means run only element which is in 0 index


        list3.set(0,234);   // it means replace the element in 0 index with 234 element
        System.out.println("after list:"+list3);




        // toArray    // kisi bhi list ko object  array me convert krne ke liye
        Object[] arr=  list3.toArray();
        for(Object obj: arr) {
            System.out.println(obj);
        }
        //contain    // check if there is element present is list then run true otherwise false
        System.out.println(list3.contains(23));


        list.add(1);
        list.add(5);
        System.out.println("printing entire list"+ list);

        //sort an arrayList
        Collections.sort(list);
        System.out.println("printing entire list"+ list);

        //clone   // create another list same  as other lists
        ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println( "printing entire new list" +newList);

        //ensure capacity
        ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);
        System.out.println(marks.isEmpty());

        System.out.println(newList.indexOf(40));

    }
}
