package part.math;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

// https://www.acmicpc.net/problem/2739
// 구구단
public class Q2739 {

    public static void main(String[] args) throws Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=1;i<10;i++){
            System.out.println(N+" * "+i+" = "+(N*i));
        }

    }
}
