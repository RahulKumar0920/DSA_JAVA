public class ArmstrongNumber {
    public static void main(String[] args){

        int n = 371;
        int temp1 = n;
        int temp2 = n;


        int count = 0;
        while(temp1 > 0){
            temp1 = temp1 / 10;
            count++;
        }

        int sum = 0;
        while(temp2 > 0){

            int digit = temp2 % 10;
            sum =(int)( sum + (Math.pow(digit,count)));
            temp2 = temp2/10;
        }

        if(sum == n){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong Number");
        }
    }
}
