public class GCD_or_HCF {
    public static void main(String[] args){

        int n1 = 20;
        int n2 = 15;

        int store = 0;
        for(int i = 1; i <= n1; i++){

            if(n1%i == 0 && n2%i == 0){
                store = i;
            }
        }

        System.out.println(store);

    }
}
