package OOPs;

public class student {
    static void main() {
        //class declaration

        class Car {
            String brand;
            int year;

            void display() {
                System.out.println("Brand: " + brand + ", Year: " + year);
            }
        }

        //object instantiation

                Car car1 = new Car();  // Creating first object
                car1.brand = "Toyota";
                car1.year = 2020;
                car1.display();

                Car car2 = new Car();  // Creating second object
                car2.brand = "Ford";
                car2.year = 2018;
                car2.display();
            }
        }



        //default constructor

 class Car {
    String brand;
    int year;

    Car() {
        System.out.println("Default constructor called");
    }
}

          //parameterized constructor

class Cars {
    String brand;
    int year;

    Cars(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

