package AbstractDesign;

    abstract  class  Bird{

      abstract   void fly();

       abstract    void eat();

    }

    class Sparrow extends Bird{

        void fly(){
            System.out.println("Sparrow flying");
        }
        void eat(){
            System.out.println("Sparrow eating");
        }
    }

    class Crow extends Bird{

        @Override
        void fly() {
            System.out.println("Crow flying");
        }

        @Override
        void eat() {
            System.out.println("Crow eating");
        }
    }
public class main {
    static void main() {
        Bird b=  new Sparrow();
        b.eat();
        b.fly();

       b = new Crow();
        b.fly();
        b.eat();
    }

}
