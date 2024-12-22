import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class PrintDivisors {
    public static void main(String[] args){

        int n = 36;

        List<Integer> arr= new ArrayList<Integer>();

        for(int i = 1; i <= 36; i++){
            if(n%i == 0){
                arr.add(i);
            }
        }

        System.out.print("[");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
