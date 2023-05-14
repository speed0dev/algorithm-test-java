package test.oper;

public class OperMaxLenTest {

    public static void main(String[] args){

        String str = "1,000,000,0000";  // int -> long
        int n = Integer.parseInt(str);

        System.out.println(n);

        longNumberTest();

    }

    //
    private static void longNumberTest() {
        System.out.println("---------------------------------------");
        long m = Long.MAX_VALUE;
        System.out.println(m + " long Max:");
        int i = Integer.MAX_VALUE;
        System.out.println(i + " int Max:");
        double d = Double.MAX_VALUE;
        System.out.println(d + " double Max:");

        System.out.println("=======================================");
        String str = "" + m;
        System.out.println(str + " len:" + str.length());
        str = "" + i;
        System.out.println(i + " len:" + str.length());
        str = "" + d;
        System.out.println(d + " len:" + str.length());
        System.out.println("---------------------------------------");
    }
}
