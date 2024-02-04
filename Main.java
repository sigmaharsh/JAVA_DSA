import java.util.Scanner;

public class Main{

    public static void main(String[] args) {


      //take input from user for array
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
             {
             arr[i][j] = sc.nextInt();
            }


        }
        //this line of code prints the 2d array
        for (int[] ints : arr) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");

            }
            System.out.println(" ");

        }





    }

}



