package JavaFrameworks;

import java.util.HashSet;

public class HashSetBasics {
    static void main() {




        HashSet<Student> set = new HashSet<>();

        Student s1 = new Student(1,"yash");
        Student s2 = new Student(1,"yash");
        Student s3= new Student(1,"'yash");

        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);

//        Set<Integer> set1 = new HashSet<>();
//        Set<Integer> set2= new HashSet<>();
//
//        set1.add(1);
//        set1.add(2);
//        set1.add(3);
//        set1.add(4);
//        set2.add(3);
//        set2.add(4);
//        set2.add(5);
//        set2.add(6);
//
//        System.out.println(set1);
//        set1.retainAll(set2);
//        System.out.println(set1);
//
//        System.out.println(set1.containsAll(set2));
//        Set<Integer> st= new HashSet<>();
//        st.add(10);
//        st.add(10);  // Hashset me kitni bhhi baar same element daal lo lekin vo run krte time 1 hi baar element put krega
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        System.out.println(st);



        //linkedHash set

//        Set<Integer> st= new LinkedHashSet<>() ;
//        st.add(40);
//        st.add(10);
//        st.add(10);   // isme order wise element aate hai, jo phele element add hua hai whii phle ayegga
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        System.out.println(st);


        // HashedSet -> 0(1)
        //LinkedHashSet -> 0(n)
        //TreeSet -> 0(logn)



        //TreeSet
//        Set<Integer> st= new TreeSet<>();
//        st.add(40);
//        st.add(10);
//        st.add(10);     //tree set me output hamesha sorted order me milega
//        st.add(10);
//        st.add(20);
//        st.add(20);
//        st.add(30);
//        System.out.println(st);


    }
}
