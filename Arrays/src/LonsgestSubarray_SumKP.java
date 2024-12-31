import java.util.HashMap;
import java.util.Map;

public class LonsgestSubarray_SumKP {
    public static void main(String[] args) {

//        int n = 3;
        int k = 10;
        int[] arr = {2, 3, 5, 1, 9};


        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;


        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum ==k){
                maxLen = Math.max(maxLen, i+1);
            }

            int rem = sum - k;
            if(preSumMap.containsKey(rem)){
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            if(!preSumMap.containsKey(rem)){
                preSumMap.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }
}
