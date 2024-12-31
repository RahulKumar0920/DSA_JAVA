public class ConsecutiveOnes {
    public static void main(String[] args){

        int[] arr = {1, 0, 1, 1, 0, 1};

        int count = 0;
        int cons_ones = 0;


        for(int i = 0; i < arr.length; i++){

            if(arr[i] == 1){
                count++;
            }else{
                count = 0;
            }

            cons_ones = Math.max(cons_ones, count);

        }

        System.out.println(cons_ones);


    }
}
