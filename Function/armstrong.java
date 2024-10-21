import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isarm(n));

        for(int i = 100; i < 1000; i++){            // this indicates the how many armstrong between 3 digit num.....
            if(isarm(i)){
                System.out.println(i);
            }
        }
    }
    static boolean isarm(int n){
        int original = n;
        int sum = 0;
        while(n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        if(original == sum){
            return true;
        }
        else{
            return false;
        }
    }
}