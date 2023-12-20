
public class UserPrime {
    public static void main(String[] args) {
        int num = 10;
        for (int i=2; i<num; i++){
            if (num%i == 0){
                System.out.println("not Prime number");
            }
            else{
                System.out.println(num+" is a prime number");
                break;
            }
        
        }
    }
}
