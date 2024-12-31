public class CheckSorted {
    public static void main(String[] args){

        int[] arr = {5,4,6,7,8};

        boolean flag = false;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] < arr[i+1]){
                flag = true;
            }else{
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Ture");
        }else{
            System.out.println("False");
        }

    }

}
