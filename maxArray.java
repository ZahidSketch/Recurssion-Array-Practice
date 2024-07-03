public class maxArray {

    public static int maxArray(int[] arr, int n) {

        if(n == arr.length-1)
        {
            return arr[n];
        }
        int res = maxArray(arr, n + 1);
        return Math.max(res, arr[n]);


    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        System.out.println(maxArray(arr, 0));
    }
}
