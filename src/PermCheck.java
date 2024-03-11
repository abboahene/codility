public class PermCheck {
    public static void main(String[] args) {
        int[] arr = {4,1,3,2};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int[] freq = new int[A.length];

        for(int a : A){
            if(a < 0 || a > A.length) return 0;
            freq[a-1] = freq[a-1] + 1;
        }

        for(int f: freq){
            if(f > 1) return 0;
        }
        return 1;
    }
}
