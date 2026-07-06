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

        String name1 = "yash";
        String name2 = "yash";   // yeh actual content check krta hai
        if(name1.equalsIgnoreCase(name2)){
            System.out.println("both are equal");
        }
        else {
            System.out.println("not equal");
        }
    }


}
