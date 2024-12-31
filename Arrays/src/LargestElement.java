public class LargestElement {
    public static void main(String[] args){


        int[] arr = {8,10,5,7,9};

        int max = Integer.MIN_VALUE;

        /*
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        */

        for(int i: arr){
            if(i > max){
                max = i;
            }
        }

        System.out.println(max);

    }

}
