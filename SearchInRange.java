import java.util.Scanner;

public class SearchInRange {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = sc.nextInt();

       int[] arr = new int[n];


        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        System.out.println("enter element you want to search");
        int target = sc.nextInt();
        System.out.println("enter range of start");
        int start = sc.nextInt();
        System.out.println("enter range of end");
        int end = sc.nextInt();


       int ans = searchinrange( arr ,target,start,end);
        System.out.println(ans);

    }
    static int searchinrange(int[] arr, int target , int start , int end){
        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i <=end ; i++) {
            int element = arr[i];
            if(element == target){
                return i;

            }

        }
        return -1;

    }
}
