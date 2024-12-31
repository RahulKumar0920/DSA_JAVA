public class SecondLargestElement {
    public static void main(String[] args){

        int[] arr = {1,2,4,7,7,5};

        int max = arr[0];
        int sMax = Integer.MIN_VALUE;

        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] < min){
                sMin = min;
                min = arr[i];
            }else if(arr[i] < sMin && arr[i] != min ){
                sMin = arr[i];
            }

            if(arr[i] > max){
                sMax = max;
                max = arr[i];
            }else if(arr[i] < max && arr[i] > sMax){
                sMax = arr[i];
            }

        }

        System.out.println("Second Smallest Number : " + sMin);
        System.out.println("Second Largest Number : " + sMax);

        /*
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;


        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }

            if(arr[i] > max){
                max = arr[i];
            }
        }


        int sMin = Integer.MAX_VALUE;
        int sMax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < sMin && arr[i] != min){
                sMin = arr[i];
            }

            if(arr[i] > sMax && arr[i] != max){
                sMax = arr[i];
            }
        }

        System.out.println("Second Smallest Number : " + sMin);
        System.out.println("Second Largest Number : " + sMax);
        */
    }
}
