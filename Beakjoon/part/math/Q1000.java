package part.math;

/*
    https://www.acmicpc.net/problem/1000
    A+B

 */
// Input (0<A, B<10)
// output A+B

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1000 {     // 제출 시 Main 메소드로 변경할것.

    public static void main(String[] args) throws Exception{
        solve2();
    }

    // 메모리 사용량 시간 모두 큼
    public static void solve2(){
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
    }

    // 이렇게 사용할것.
    public static void solve() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(A+B);
    }
}
