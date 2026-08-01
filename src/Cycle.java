import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cycle {
    static void main(String[] args) {


        List<Stud> students = new ArrayList<>();

        students.add(new Stud(19,"yash",68));
        students.add(new Stud(23,"love",98));
        students.add(new Stud(21,"ankit",55));
        students.add(new Stud(7,"billu",13));


        System.out.println(students);

        Collections.sort(students);
        System.out.println(students);



    }
}
