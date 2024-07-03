public class PrintArray {

    public static void printArray(int[] arr, int n) {
        if(n == arr.length) return;

        System.out.print(arr[n] + " ");
        printArray(arr, n + 1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr,0);
    }
}
