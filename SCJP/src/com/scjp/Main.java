package com.scjp;

public class Main {

    public static void main(String[] args) {
        String x = "Java";
        x.concat(" Rules!");

        int y = x.length();
        String y2 = x.substring(1,3);
        System.out.println("x = " + y2);

        StringBuilder s = new StringBuilder("Ishan");

            Filehandle file = new Filehandle();
            file.printWriteData();
//        boolean isTrue = true;
//
//        for(int i=0; i<5; i++) {
//            outer:
//            while (isTrue) {
//                System.out.println("Hello");
//                break outer;
//            } // end of inner while loop
//            System.out.println("Outer loop."); // Won't print
//        } // end of outer for loop
//        System.out.println("Good-Bye");

    }

    static boolean doStuff() {
        for (int x = 0; x < 3; x++) {
            System.out.println("in for loop");
            break;
        }
        System.out.println("out for loop");
        return true;
    }

    public static boolean check(int x) {
        if(x<5){
            System.out.println("i<5");
            return true;
        }

        else{
            System.out.println("i>5");
            return false;
        }

    }
}
