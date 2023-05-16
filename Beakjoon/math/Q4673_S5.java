package math;

// https://www.acmicpc.net/problem/4673
// 셀프넘버
// 10의 나머지 구하기 10승의 나머지 값 더하기

public class Q4673_S5 {

    public static void main(String[] args) throws Exception{
        // 10000

        int N = 1;
        int max = 10000;

        boolean[] arr = new boolean[max+1];
        int result = -1;
        for(int i=1;i<max+1;i++){
            result = d(i);

            if(result < max+1){
                arr[result] = true;
            }
        }

        for(int i=1;i<max+1;i++){
            if(!arr[i]){
                System.out.println(i);
            }
        }

    }

    private static int d(int n) {
        int sum = n;
        while(n!=0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }


}
