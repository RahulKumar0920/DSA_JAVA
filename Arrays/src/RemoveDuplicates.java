import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args){

        int[] arr = {1,1,2,2,2,3,3};

        List<Integer> newArr = new ArrayList<>();
        newArr.add(arr[0]);

        for(int i = 1; i < arr.length; i++){

            if(arr[i] != arr[i - 1]){
                newArr.add(arr[i]);
            }

        }

        for(int i : newArr ){
            System.out.print(i + " ");
        }

    }
}
