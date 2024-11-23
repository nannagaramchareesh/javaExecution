public class Prime{
    public static void main(String [] args){
        int number = 5;
        boolean isPrime = true;
        for(int i=2;i<=number;i++){
            if(i%number==0){
                isPrime = false;
            }
        }
        if(isPrime)System.out.println("Prime");
        else System.out.println("Not Prime");
    }
}