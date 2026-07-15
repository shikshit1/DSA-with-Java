package OOPs;

    class animal{
        void display(){
            System.out.println("animal  is barking");
        }
        static class dog extends animal{
            void bark(){
                System.out.println("dog is barking");
            }
        }
        public static class single{
            static void main() {
                dog d= new dog();
                d.display();
                d.bark();
            }


        }

    }

