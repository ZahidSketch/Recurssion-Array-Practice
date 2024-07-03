public class SumArray {

    public static int sumArray(int[] arr, int n) {

        if(n == arr.length) {
            return 0;
        }
         int ans= sumArray(arr, n + 1) + arr[n];

        return ans;

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(sumArray(arr, 0));
    }
}
