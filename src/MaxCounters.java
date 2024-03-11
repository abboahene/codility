import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] arr = {3,4,4,6,1,4,4};
        int N = 5;
        int[] res = solution(N, arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] solution(int N, int[] A) {
        // Implement your solution here
        int[] counters = new int[N];
        int currMax = 0;
        int base = 0;

        for(int a : A){
            if( a > 0 && a <= N){
                counters[a - 1] = Math.max(counters[a - 1], base) +1;
                currMax = Math.max(currMax, counters[a - 1]);
            }else {
                base = currMax;
            }
        }

        for( int i = 0; i < counters.length; i++){
            counters[i] = Math.max(counters[i], base);
        }

        return counters;
    }
}
