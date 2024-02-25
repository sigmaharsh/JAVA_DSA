import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[][] arr = {
        { 2, 4, 5, 2 },
        { 33, 57, 9 },
        { 88, 789 }
    };
    System.out.println("enter the target");
    int target = sc.nextInt();
    int[] ans = search(arr, target);
    System.out.println(Arrays.toString(ans));
    sc.close();

  }

  static int[] search(int[][] arr, int target) {
    for (int row = 0; row < arr.length; row++) {
      for (int column = 0; column < arr[row].length; column++) {

        if (arr[row][column] == target) {
          return new int[] { row, column };
        }

      }

    }

    return new int[] { -1, -1 };
  }

}
