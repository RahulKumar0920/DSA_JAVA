public class CheckPalindrome {
    public static void main(String[] args){

        int n = 121;
        int temp = n;

        int reverse = 0;
        while(temp > 0){
            int digit = temp % 10;
            reverse = (reverse  * 10) + digit;
            temp = temp/10;
        }

        if(reverse == n) {
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }

    }
}
