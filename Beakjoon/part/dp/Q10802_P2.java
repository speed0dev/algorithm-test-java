package part.dp;

// https://www.acmicpc.net/problem/10802
//  369 게임
//
// 1≤ A ≤ B ≤ 10100,000
//  20,150,523 나눈 나머지로 계산
public class Q10802_P2 {

    public static void main(String[] args) throws Exception{

        System.out.println("1)" + (long)(Math.pow(10, 10)));
        System.out.println("2)" + (long)Math.pow(10, 2));
        System.out.println("3)" + (long)Math.pow(10, 4));
        System.out.println(Math.pow(10, 10000));

        long cnt = 0;
        double max = (double) Math.pow(10, 100000);     //Infinity
        System.out.println(max);

        for(int i=1;i<=100000;i++){
            if(i%3 == 0){
                ++cnt;
            }else if(i%6 == 0){
                ++cnt;
            }else if(i%9 == 0){
                ++cnt;
            }
        }
        System.out.println(cnt);

    }


}
