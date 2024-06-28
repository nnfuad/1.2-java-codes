public class ass1_prob12 {
    static void twinPrime(int a ){
        for(int i = 2 ; i<a-1 ; i++){
            if(isPrime(i) + isPrime(i+2) == 2){
                System.out.println("("+i+","+(i+2)+")");
            }

        }
    }
    static int isPrime(int x){
        int flag = 1;
        for(int i = 2 ; i<x ; i++){
            if(x%i ==0){
                flag = 0;
                break;
            }
        }
        if(flag == 1) return 1;
        else return 0;
    }

    public static void main(String[] args){
        twinPrime(100);
    }
}