import java.util.Scanner;

public class Main {
  // this is a commemt please ignore it
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("enter array size");
    int n;
    n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();

    }
    System.out.println("enter target");
    int target = sc.nextInt();
    sc.close();
    int ans = binsearch(arr, target);
    System.out.println(ans);

  }

  static int binsearch(int[] arr, int target) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
      int mid = low + (high - low) / 2;

      if (arr[mid] == target) {
        return mid;
      }

      else if (arr[mid] < target) {
        low = mid + 1;

      } else {
        high = mid - 1;
      }

    }
    return -1;

  }
}
