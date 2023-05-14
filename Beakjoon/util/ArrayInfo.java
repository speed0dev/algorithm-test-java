package util;

public class ArrayInfo {

    public static<T> void showNumberArr(T[] arr){
        System.out.println("------------------------");
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println("["+i+"]" + arr[i]);
        }
        System.out.println("=========================");
    }

    public static void showIntArr(int[] arr){
        System.out.println("------------------------");
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println("["+i+"]" + arr[i]);
        }
        System.out.println("=========================");
    }

    public static void show(long[] arr){
        System.out.println("------------------------");
        int len = arr.length;
        for(int i=0;i<len;i++){
            System.out.println("["+i+"]" + arr[i]);
        }
        System.out.println("=========================");
    }

}
