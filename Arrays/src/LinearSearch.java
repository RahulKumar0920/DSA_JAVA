public class LinearSearch {
    public static void main(String[] args){

        int[] arr = {5, 4, 3, 2, 1};
        int key = 5;


        for(int i = 0; i < arr.length; i++){

            if(arr[i] == key){
                System.out.println(i);
            }

        }


    }
}
