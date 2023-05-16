package test.digt;

public class DigitTest {

    public static void main(String[] args) throws Exception{

        System.out.println("======================================");
        int N = 102;
        for(int i=0;i<10;i++) {
            System.out.println( (N+i) % 10 );
        }

        System.out.println("-------------------------------------");
        N = 20;
        for(int i=0;i<10;i++) {
            N = N/10;
            System.out.println( (N+i) % 10 );
        }

        System.out.println("======================================");

        int a = Integer.MAX_VALUE;
        ++a;
        System.out.println(a);


    }

}
