public class BinarySearch{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,34,53};
        int target = 34;
        int ans = binsearch(arr,target);
        System.out.println(ans);
    }
    static int binsearch(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        
        while(start <=end){
            int mid = start +(end - start)/2;
            if(target<arr[mid]){
                end = mid -1;


            }
             else if(target>arr[mid]){
                start = mid +1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}