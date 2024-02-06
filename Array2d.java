import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int [][] arr = {
                {2,4,5,2},
                {33,57,9},
                {88,789}
        };
        System.out.println("enter the target");
        int target =sc.nextInt();
        search(arr,target);

    }




    static void search(int[][] arr,int target){
        for (int row_index = 0; row_index < arr.length; row_index++) {
            for (int column_index = 0; column_index <arr[row_index].length; column_index++) {
                int element = arr[row_index][column_index];
                if (element==target){
                    System.out.println(" row number :"+row_index+"  column number:"+column_index);

                }


            }


        }

            System.out.println("target not found!!");

    }


}
