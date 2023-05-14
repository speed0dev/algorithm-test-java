package part.math;

import java.util.Scanner;

// https://www.acmicpc.net/problem/2839
// 설탕 배달
public class QS2839 {

    // 3<=N<=5000
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int M5cnt = N/5;
        int M3cnt = N/3;

        int sum = 0;
        int count = 0;
        for(int i=0;i<M5cnt;i++){
            ++count;
            sum += 5;
            if(sum == N){
                System.out.println(count);
                return;
            }

            for(int j=0;i<M3cnt;j++){
                ++count;
                sum+=3;
                if(sum == N){
                    System.out.println(count);
                    return;
                }
            }
        }

        System.out.println(-1);

    }


}
