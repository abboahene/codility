import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MissingInteger {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        // HashSet<Integer> map = new HashSet<>();
        // for(int i = 1; i <= A.length; i++){
        //      map.add(i);
        //        }
        //        for(int a : A){
        //            map.remove(a);
        //        }
        //        Iterator<Integer> it = map.iterator();
        //        return it.hasNext() ? map.iterator().next() : A.length + 1;

        HashMap<Integer, Integer> m = new HashMap<>();
        for(int i = 1; i <= A.length; i++){
            m.put(i, 0);
        }
        for(int a : A){
            m.put(a, m.get(a) + 1);
        }
        for(int key: m.keySet()){
            if(m.get(key) < 1) return key;
        }

        return A.length + 1;
    }
}
