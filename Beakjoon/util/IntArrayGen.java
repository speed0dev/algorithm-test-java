package util;

public class IntArrayGen {

    public static int[] getNumberArr(int cnt){
        int[] tmp = new int[cnt];
        for(int i=0;i<cnt;i++){
            tmp[i] = i;
        }
        return tmp;
    }

    public static int[] getNumberArr(int first, int last){
        int len = (last-first) + 1;
        int[] tmp = new int[len];

        for(int i=0;i<len;i++){
            tmp[i] = i+first;
        }
        return tmp;
    }

    public static void showNumberArr(int[] arr){
        System.out.println("------------------------");
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println("["+i+"]" + arr[i]);
        }
        System.out.println("=========================");
    }
}
