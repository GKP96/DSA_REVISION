
import java.util.*;
public class first {

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<Integer>();
        int n = 5;
        factorial(n);
    }
    public static void factorial(int n) {
        if(n== 0 || n== 1) return ;
        List<Integer> list  = new ArrayList<Integer>();
        list.add(1);
        for(int i = 2;i<=n;i++) {
            int val = list.get(0);
            val *= i;
            if(val>= 10){
                int carry = val/10;
                int modval = val % 10;
                list.add(0, modval);
                list.add(0, carry);
            }else{
                list.set(0, val);
            }
        }
        System.out.println(list);
    }
}