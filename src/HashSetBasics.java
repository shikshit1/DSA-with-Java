import java.util.HashSet;
import java.util.Set;

public class HashSetBasics {
    static void main() {
        Set<Integer> st= new HashSet<>();
        st.add(10);
        st.add(10);  // set me kitni bhhi baar same element daal lo lekin vo run krte time 1 hi baar element put krega
        st.add(10);
        st.add(20);
        st.add(20);
        st.add(30);
        System.out.println(st);
    }
}
