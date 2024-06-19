import java.util.Arrays;

public class RowCol{
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {3,56,78,99},
            {100,120,190}
        };
        System.out.println(Arrays.toString(search(matrix, 100)));

    }

    static int[] search(int[][] matrix ,int target){
        int r = 0 ;
         int c = matrix.length -1 ;
         while(r< matrix.length && c>=0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }
            if(matrix[r][c] < target){
                r++;
            }
            else{
                c--;
            }
         }
         return new int[] {-1,-1};
    }
}