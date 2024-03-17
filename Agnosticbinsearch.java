import java.util.Scanner;

public class Agnosticbinsearch{
    public static void main(String[] args) {
        int size ;
        System.out.println("enter size :");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int target ;
        System.out.println("enter target:");
        target = sc.nextInt();
        
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