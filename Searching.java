import java.util.Scanner;

public class Searching {

  public static void main(String[] args) {
    java.util.Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter arrray size");
    n = sc.nextInt();
    int[] arr = new int[n];
    System.out.print("enter array elements");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("enter target to search");
    int target = sc.nextInt();
    int ans = linearSearch(arr, target);
    System.out.println("the target is present in the position : " + ans);
  }

  // creating function which takes parameters an integer array and a target
  static int linearSearch(int[] arr, int target) {
    if (arr.length == 0) {
      return -1;
    }

    for (int i = 0; i < arr.length; i++) {
      int element = arr[i];
      if (element == target) {// we iterate the array and if the target is found return its positon in array
        return i;

      }

    }
    return -1;// return - 1 if the target is not found;
  }

}
