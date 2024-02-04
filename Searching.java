public class Searching {

    public static void main(String[] args) {
        int[] arr = {11,33,44,43,34,3423,-1,55,66};

        int target = 99;
        int ans = linearSearch(arr,target);
        System.out.println(ans);
    }

// creating function
        static  int linearSearch(int[] arr,int target){
            if( arr.length == 0) {
              return -1;
            }


            for (int i = 0; i < arr.length; i++) {
                int element = arr[i];
                if (element == target){
                    return i ;

            }


        }
         return -1;
    }

}


