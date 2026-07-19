//package AbstractDesign;
//
//    abstract  class  Bird{
//
//      abstract   void fly();
//
//       abstract    void eat();
//
//    }
//
//    class Sparrow extends Bird{
//
//        void fly(){
//            System.out.println("Sparrow flying");
//        }
//        void eat(){
//            System.out.println("Sparrow eating");
//        }
//    }
//
//    class Crow extends Bird{
//
//        @Override
//        void fly() {
//            System.out.println("Crow flying");
//        }
//
//        @Override
//        void eat() {
//            System.out.println("Crow eating");
//        }
//    }
//public class main {
//    static void main() {
//        Bird b=  new Sparrow();
//        b.eat();
//        b.fly();
//
//       b = new Crow();
//        b.fly();
//        b.eat();
//    }
//
//}


      //Interface
package AbstractDesign;

interface Bird {
    void fly();
    void eat();
}

class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Sparrow flying");
    }

    @Override
    public void eat() {
        System.out.println("Sparrow eating");
    }
}

class Crow implements Bird {

    @Override
    public void fly() {
        System.out.println("Crow flying");
    }

    @Override
    public void eat() {
        System.out.println("Crow eating");
    }
}

public class main {

    public static void doBirdStuff(Bird b) {
        b.eat();
        b.fly();
    }

    public static void main(String[] args) {

        doBirdStuff(new Sparrow());

         doBirdStuff(new Crow());
    }
}