public class CheckPrime {
    public static void main(String[] args){

        int n = 10;
        int temp = n;

        boolean flag = true;

        int count = 0;
        for(int i = 1; i <= 7; i++){
            if(n%i == 0) {
                count++;
            }

            if(count > 2){
                flag = false;
            }
        }

        if(flag) {
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
