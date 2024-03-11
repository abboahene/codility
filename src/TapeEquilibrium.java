public class TapeEquilibrium {

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 3};
        System.out.println(solution(arr));
    }
    public static int solution(int[] A) {
        // Implement your solution here
        int[] arr = new int[A.length];
        arr[0] = A[0];
        for(int i = 1; i < A.length; i++){
            arr[i] = arr[i-1] + A[i];
        }
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length; i++){
            int l = arr[i-1];
            int r = arr[arr.length-1] - arr[i-1];
            int diff = Math.abs(l - r);
            if( diff < min) min = diff;
        }
        return min;
    }
}
