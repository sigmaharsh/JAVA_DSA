public class Agnosticbinsearch{
    public static void main(String[] args) {
       
        int[] arr = {190,123,90,89,78,9,2,1};
       

        int target = 9;
        
  
        
        int ans = agnosticbinsearch(arr, target);
        System.out.println(ans);

    }
    static int agnosticbinsearch(int[] arr , int target){
        int low,high,mid;
        low = 0;
        high = arr.length -1;
        while(low<=high){
            mid = low +(high -low)/2;
            if(arr[0]<arr[high]){
                if(target< arr[mid]){
                    high = mid -1;
                }
                 else if(target > arr[mid]){
                    low = mid + 1;

                }
                 else if(target == arr[mid]){
                    return mid;

            }
            }
            else{
                if(target> arr[mid]){
                    high = mid -1;
                }
                 else if(target < arr[mid]){
                    low = mid + 1;

                }
                 else if(target == arr[mid]){
                    return mid;

            }
            }
        }
        return -1;
    }
}