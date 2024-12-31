public class NumberApprear_Once {
    public static void main(String[] args){

        int[] arr = {2,2,1,1,3,4,4};

        int xor = 0;


        for(int i = 0; i < arr.length; i++){
            xor = xor ^ arr[i];
        }

        System.out.println(xor);


    }
}
