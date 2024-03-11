import java.util.HashMap;

public class FrogRiverOne {

    public static void main(String[] args) {
        int[] arr = {1,3,1,4,2,3,5,4};
        int x = 5;
        System.out.println(solution(x, arr));
    }
    public static int solution(int X, int[] A) {
        // Implement your solution here

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 1; i <= X; i++){
            map.put(i, 0);
        }

        int sum = 0;
        for(int i = 0; i < A.length; i++){
            if(map.get(A[i]) == 0){
                map.put(A[i], 1);
                sum += 1;
                if(sum == X) return i;
            }
        }
        return -1;
    }
}
