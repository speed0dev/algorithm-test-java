package test.math;

public class MathTest {

    public static void main(String[] args) {

        int number = Math.abs(-10);
        //
        System.out.println(number);

        number = Math.abs(-20);
        System.out.println(number);

        // Method 이름 변경  Shift + F6
        callCheckName();

    }

    public static void callCheckName(){
        System.out.println("@@@");

    }

}
