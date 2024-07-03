public class LinearSearch {

    public static boolean linearSearch(int[] arr,int n, int target) {
        if(n == arr.length){
            return false;
        }
        if(arr[n] == target) return true;
       return linearSearch(arr,n + 1,target);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 11;
       if(linearSearch(arr,0,target)){
           System.out.println("Element found");
       }else
        System.out.println("Element not found");
    }

}
