public class Ceiling {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3,5,7,8,16,18,21 };
        int target = 100;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }

    static int ceiling(int[] arr , int target){
        int start = 0 ;
        int end = arr.length -1;

        while(start<=end){
            int mid = start + (end-start)/2;
              if(target >arr[arr.length -1]){ // if the target element is greater then the larget element present in an array then return - 1
                return - 1;
              }
            
                if(target < arr[mid]){
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid +1 ;
                }
                else if(target==arr[mid]){
                    return mid;
                }
        
        
        
    }
   return start; 
}
}
