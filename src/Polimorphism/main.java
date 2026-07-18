package Polimorphism;

public class main {
    static void main() {
//        Calculator c=new Calculator();
//        System.out.println(c.add(2,3));
//        System.out.println(c.add(2,3,2));
//        System.out.println(c.add(23,23,23,23.3));


        //Runtime polymorphism
        // upcasting
        Circle c = new Circle();
//        c.draw();
         doDrawingStuff(c );

        Rect r= new Rect();
//        r.draw();
        doDrawingStuff(r);

        Shape s = new Shape();
        doDrawingStuff(s);

    }

        public static void doDrawingStuff(Shape s){
        s.draw(); //polymorphic

        }
}
