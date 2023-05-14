package part.math;

// https://www.acmicpc.net/problem/2753
// 윤년

import java.util.Scanner;
public class Q2753 {

    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();

        //System.out.println("1:" + Y%4 + " 2:" + Y%400 + " 3:" + Y%100);
        //
        if((Y%4==0) && ((Y%400==0) || (Y%100!=0)) ){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

    }

}
