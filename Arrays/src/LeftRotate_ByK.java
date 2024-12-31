import java.util.ArrayList;
import java.util.List;

public class LeftRotate_ByK {
    public static void main(String[] args){

        int[] arr = {1,2,3,4,5,6,7};

        int k = 3; //Left rotate by k

        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i < k; i++){
            temp.add(arr[i]);
        }

        for(int i = k; i < arr.length; i++){
            arr[i-k] = arr[i];
        }

        int j = 0;
        for(int i = arr.length - k; i < arr.length; i++){
            arr[i] = temp.get(j);
            j++;
        }

        for(int i : arr){
            System.out.print(i+" ");
        }

    }
}
