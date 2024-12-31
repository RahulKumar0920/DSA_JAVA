import java.util.HashSet;
import java.util.Set;

public class Union_SortedArray {
    public static void main(String[] args){

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,3,4,4,5};

        Set<Integer> set = new HashSet<>();


        for (int j : arr1) {
            set.add(j);
        }

        for (int j : arr2) {
            set.add(j);
        }

        int[] union = new int[set.size()];

        int i = 0;
        for(int it : set){
            union[i] = it;
            i++;
        }

        for(int it : union){
            System.out.print(it + " ");
        }
    }
}
