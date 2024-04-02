public class Floor {
    public static void main(String[] args) {
        int[] arr = {91,92,93,94,95,96,97,99};
        int target = 98;

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
                else{
                    if(target> arr[mid]){
                        end = mid -1;
                    }
                    else if(target < arr[mid]){
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
