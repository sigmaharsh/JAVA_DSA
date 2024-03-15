public class SearchMax {

    public static void main(String[] args) {
        //program can also be created by taking user input for the array
        int[] arr = {12,43,1,-3,5,6};
        System.out.println(max(arr));

    }
    static int max(int[] arr ){
        int ans = arr[0];
        for (int i = 1; i < arr.length ; i++)
        { //checks if element is gretaer than the intitially assigend element here its the zeroth index
           if(arr[i]> ans){
               ans = arr[i];

           }
        }
        return ans;
    }
}
