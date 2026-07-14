package OOPs;

class Base {
    void display() {
        System.out.println("display from base class");
    }
}

class Derived extends Base {
    @Override
    void display() {
        System.out.println("display from derived class");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Derived d = new Derived();
        d.display();
    }
}