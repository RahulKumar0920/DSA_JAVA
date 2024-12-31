public class MoveZero_ToEnd {
    public static void main(String[] args){

        int[] arr = {1,2,0,3,0,4,0,1}; // -> 1,2,3,4,1,0,0,0


        int first = 0;
        int second  = 1;


        while(second <= arr.length - 1){

            if(arr[first] == 0 && arr[second] == 0){
                second++;
            }else if(arr[first] != 0 && arr[second] != 0){
                first++;
                second++;
            }else if(arr[first] != 0 && arr[second] == 0){
                first++;
                second++;
            }else{
                int temp = arr[second];
                arr[second] = arr[first];
                arr[first] = temp;

                first++;
                second++;
            }

        }

        for(int i : arr) {
            System.out.print(i+" ");
        }

    }
}
