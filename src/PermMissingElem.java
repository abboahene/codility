import java.util.HashMap;

public class PermMissingElem {
    public static void main(String[] args) {
        int[] arr = {2, 3, 15};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int missing = 1;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 1; i <= A.length + 1; i++){
            map.put(i, 0);
        }
        for(int i : A){
            if(map.containsKey(i)){
                map.put(i, 1);
            }
        }
        for(int key: map.keySet()){
            if(map.get(key) == 0) missing = key;
        }

        return missing;
    }
}
