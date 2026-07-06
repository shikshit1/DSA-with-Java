package StringBasics;


public class keywords {
    static void main(String[] args) {
//        String firstname= "yash";
//        String lastname= new String("khandelwal");
//        System.out.println(firstname+" "+ lastname);
//
//        System.out.println(firstname.length());

//        String str= "yash";
//        str = "nash";
//        System.out.println(str);




           //comparing string

        //==
//
//        String name1= "yash";
//        String name2= "YASH";   // actual content check nhi krtaa , only reference dhekta hai
//        if(name1==name2){
//            System.out.println("both are equal");
//        }
//        else{
//            System.out.println("not equal");
//        }


        // .equals()

//        String name1 = "yash";
//        String name2 = "YASH";     //letters check krta hai dono same capital hai ya  nhi
//        if(name1.equals(name2)){
//            System.out.println("both are equal");
//        }else{
//            System.out.println("not equal");
//        }


        //.equalsIgnoreCase

//        String name1 = "yash";
//        String name2 = "yash";   // yeh actual content check krta hai
//        if(name1.equalsIgnoreCase(name2)){
//            System.out.println("both are equal");
//        }
//        else {
//            System.out.println("not equal");
//        }


        //common string methods
//
//        String str= "yash";
//        System.out.println(str.length());
//        System.out.println(str.charAt(1));
//        String name="yash";
//        System.out.println(str.equals(name));
//        System.out.println(str.equalsIgnoreCase(name));

        //empty -> length = 0
        //blank ->  empty or sirf spaces h string
//        String str= "     ";
//        System.out.println(str.length());
//        System.out.println(str.isEmpty());
//        System.out.println(str.isBlank());;
//        String name = "    yash       ";
//        System.out.println(name.length());
//        name= name.trim();      //space delete krne ke liye
//        System.out.println(name.length());


        String name = "yash";
        System.out.println(name.toUpperCase());
        String str = "YasH";
        System.out.println(str.toLowerCase());


    }


}
