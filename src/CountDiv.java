public class CountDiv {
    public static void main(String[] args) {

        System.out.println(solution(6, 11, 2));
    }
    public static int solution(int A, int B, int K) {
        // Implement your solution here
        int count = B/K - A/K;
        if(A%K == 0) count++;
        return count;
    }
}
