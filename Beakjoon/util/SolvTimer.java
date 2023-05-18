package util;


import java.util.function.Function;
import java.util.function.Predicate;

public class SolvTimer {

    public static<T,R> void delayTime(Function<T, R> f, T param){
        long startTime = System.currentTimeMillis();
        if(f!=null){
            R r = f.apply(param);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("result time ms:" + (endTime - startTime));
    }

    public static void checkTime(Predicate<Integer> p, Integer param){
        long startTime = System.currentTimeMillis();
        if(p!=null){
            p.test(param);
        }
        System.out.println("result time ms:" + (System.currentTimeMillis() - startTime));
    }
}
