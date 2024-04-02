public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,4,6,18,19};
        int target = 1;

        int ans = floor(arr,target);
        System.out.println(ans);

    }
    static int floor(int[] arr , int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
                int mid = start + (end -start)/2;
                if(arr[0]< arr[end]){
                    if(target< arr[mid]){
                        end = mid -1;
                    }
                    else if(target > arr[mid]){
                        start = mid + 1;
                    }
                    else if(target==arr[mid]){
                        return mid;
                    }
                }
               


        }
        return end;
    }
    
}