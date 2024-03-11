public class PassingCars {

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 1};
        System.out.println(solution(arr));
    }
        public static int solution(int[] A) {
            // Implement your solution here

            int[] prefixSum = new int[A.length];
            prefixSum[0] = A[0];
            int counter = 0;
            for(int i = 1; i < A.length ; i++){
                prefixSum[i] = prefixSum[i - 1] + A[i];
            }

            for(int i = 0; i < A.length ; i++){
                if(counter > 1000000000) return -1;
                if(A[i] == 0){
                    if(i == 0){
                        counter += prefixSum[prefixSum.length-1];
                        continue;
                    }
                    counter += prefixSum[A.length-1] - prefixSum[i-1];
                }

            }


            return counter;
        }
}
